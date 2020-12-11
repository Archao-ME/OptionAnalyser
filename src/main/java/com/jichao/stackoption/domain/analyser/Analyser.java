package com.jichao.stackoption.domain.analyser;

import com.jichao.stackoption.domain.analyser.entity.OptionOrder;
import lombok.Builder;
import lombok.Getter;

@Builder()
@Getter()
public class Analyser {

    // 期权合约订单
    OptionOrder optionOrder;

    // 盈亏平衡点（Break Even Point,简称BEP）
    Double getBreakEvenPoint() {
        Double orderPrice = optionOrder.getPrice();
        Double BEP = (optionOrder.getOption().getStrikePrice() * 100 - orderPrice) / 100;
        return BEP;
    }
}
