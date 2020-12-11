package com.jichao.stackoption.domain.analyser;

import com.jichao.stackoption.domain.analyser.entity.Option;
import com.jichao.stackoption.domain.analyser.entity.OptionOrder;
import com.jichao.stackoption.domain.analyser.entity.OptionType;
import com.jichao.stackoption.domain.analyser.entity.OrderType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnalyserTest {
    @Test()
    public void should_return_balance_price() {
        Option option = Option.builder()
                .subjectMatter("NIO")
                .optionExpiry("2020-01-08")
                .strikePrice(44)
                .type(OptionType.PUT)
                .build();

        OptionOrder order = OptionOrder.builder()
                .option(option)
                .price(4.8 * 100)
                .orderType(OrderType.Long)
                .build();

        Analyser optionAnalyser = Analyser.builder()
                .optionOrder(order)
                .build();

        Double breakEvenPoint = optionAnalyser.getBreakEvenPoint();

        Assertions.assertEquals(breakEvenPoint, 39.2);
    }
}
