package main.java.org.chapter02.step01.movie.pricing;

import main.java.org.chapter02.step01.money.Money;
import main.java.org.chapter02.step01.movie.DiscountPolicy;
import main.java.org.chapter02.step01.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
