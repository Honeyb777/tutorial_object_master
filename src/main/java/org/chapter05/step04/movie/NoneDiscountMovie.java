package main.java.org.chapter05.step04.movie;

import main.java.org.chapter05.step04.money.Money;

import java.time.Duration;

public class NoneDiscountMovie extends Movie {
    public NoneDiscountMovie(String title, Duration runningTime, Money fee,
                             DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
    }

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
