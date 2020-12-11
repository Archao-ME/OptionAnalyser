package com.jichao.stackoption.domain.analyser.entity;

import lombok.Builder;
import lombok.Getter;

@Builder()
@Getter()
public class OptionOrder {
    private Option option;
    private Double price;
    private OrderType orderType;
}

