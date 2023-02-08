package com.kh.test.money.run;

import com.kh.test.money.model.vo.Money;

public class Run {
    public static void main(String[] args) {
        Money m = new Money(100);
        m.setMoney(10000);
        m.print();
    }
}
