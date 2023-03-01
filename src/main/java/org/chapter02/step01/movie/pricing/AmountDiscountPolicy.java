package main.java.org.chapter02.step01.movie.pricing;

import main.java.org.chapter02.step01.money.Money;
import main.java.org.chapter02.step01.movie.DiscountCondition;
import main.java.org.chapter02.step01.movie.DiscountPolicy;
import main.java.org.chapter02.step01.movie.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition ... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
