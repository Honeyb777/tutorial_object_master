package main.java.org.chapter02.step02.movie.pricing;

import main.java.org.chapter02.step01.money.Money;
import main.java.org.chapter02.step01.movie.DiscountCondition;
import main.java.org.chapter02.step01.movie.DiscountPolicy;
import main.java.org.chapter02.step01.movie.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
