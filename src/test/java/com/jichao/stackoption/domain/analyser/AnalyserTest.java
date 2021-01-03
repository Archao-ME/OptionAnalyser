package com.jichao.stackoption.domain.analyser;

import com.jichao.stackoption.domain.analyser.entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnalyserTest {
    @Test()
    public void should_return_balance_price_Long_Call() {
        SubjectMatter nio = SubjectMatter.builder().code("nio").price(48.74).build();
        Option option = Option.builder()
                .subjectMatter(nio)
                .optionExpiry("2020-01-08")
                .strikePrice(49)
                .type(OptionType.CALL)
                .build();
        OptionOrder order = OptionOrder.builder()
                .option(option)
                .price(6.55 * 100)
                .orderType(OrderType.Long)
                .build();
        Analyser optionAnalyser = Analyser.builder()
                .optionOrder(order)
                .build();

        Double breakEvenPoint = optionAnalyser.getBreakEvenPoint();

        Assertions.assertEquals(55.55, breakEvenPoint);
    }

    @Test()
    public void should_return_balance_price_Long_PUT() {
        SubjectMatter nio = SubjectMatter.builder().code("nio").price(48.74).build();
        Option option = Option.builder()
                .subjectMatter(nio)
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

    @Test
    void should_return_balance_price_Short_Call() {
        SubjectMatter nio = SubjectMatter.builder().code("nio").price(48.74).build();
        Option option = Option.builder()
                .subjectMatter(nio)
                .optionExpiry("2021-02-05")
                .strikePrice(49)
                .type(OptionType.CALL)
                .build();
        OptionOrder order = OptionOrder.builder()
                .option(option)
                .price(6.35 * 100)
                .orderType(OrderType.Short)
                .build();
        Analyser optionAnalyser = Analyser.builder()
                .optionOrder(order)
                .build();

        Double breakEvenPoint = optionAnalyser.getBreakEvenPoint();

        Assertions.assertEquals(55.35, breakEvenPoint);
    }

    @Test
    void should_return_balance_price_Short_Put() {
        SubjectMatter nio = SubjectMatter.builder().code("nio").price(48.74).build();
        Option option = Option.builder()
                .subjectMatter(nio)
                .optionExpiry("2021-02-05")
                .strikePrice(49)
                .type(OptionType.PUT)
                .build();
        OptionOrder order = OptionOrder.builder()
                .option(option)
                .price(6.45 * 100)
                .orderType(OrderType.Short)
                .build();
        Analyser optionAnalyser = Analyser.builder()
                .optionOrder(order)
                .build();

        Double breakEvenPoint = optionAnalyser.getBreakEvenPoint();

        Assertions.assertEquals(42.55, breakEvenPoint);
    }
}
