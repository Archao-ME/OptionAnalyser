package com.jichao.stackoption.domain.analyser.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OptionTest {

    @Test()
    public void should_option_has_strike_price() {
        Integer strikePrice = 100;

        OptionType type = OptionType.CALL;

        Option option = Option.builder()
                .strikePrice(strikePrice)
                .type(type)
                .build();

        Assertions.assertEquals(option.getStrikePrice(), strikePrice);
        Assertions.assertEquals(option.getType(), type);
    }

}
