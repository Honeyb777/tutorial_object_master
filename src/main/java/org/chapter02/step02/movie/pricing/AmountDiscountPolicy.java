package main.java.org.chapter02.step02.movie.pricing;

import main.java.org.chapter02.step02.money.Money;
import main.java.org.chapter02.step02.movie.DefaultDiscountPolicy;
import main.java.org.chapter02.step02.movie.DiscountCondition;
import main.java.org.chapter02.step02.movie.Screening;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
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
