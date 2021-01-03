package com.jichao.stackoption.domain.analyser.entity;

import lombok.Builder;
import lombok.Getter;

/**
 * 期权订单
 * 每个订单都有买卖价格、对应期权、订单类型
 */
@Builder()
@Getter()
public class OptionOrder {
    private Option option;
    private Double price;
    private OrderType orderType; // Long | Short
}

