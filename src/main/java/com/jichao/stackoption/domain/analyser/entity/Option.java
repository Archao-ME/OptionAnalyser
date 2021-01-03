package com.jichao.stackoption.domain.analyser.entity;

import lombok.Builder;
import lombok.Getter;

@Builder()
@Getter()
public class Option {

    // 标的
    private SubjectMatter subjectMatter;
    // 行权价
    private Integer strikePrice;
    // 到期日
    private String optionExpiry;
    // 期权类型
    private OptionType type;

    // Vega，指期权费（P）变化与标的汇率波动性（Volatility）变化的敏感性。
    // Vega=期权价格变化/波动率的变化
    private Integer vega;
}

