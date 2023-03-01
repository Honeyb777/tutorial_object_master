package main.java.org.chapter02.step02.movie.pricing;

import main.java.org.chapter02.step02.movie.DiscountPolicy;
import main.java.org.chapter02.step02.money.Money;
import main.java.org.chapter02.step02.movie.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
