package main.java.org.chapter02.setp01.movie.pricing;

import main.java.org.chapter02.setp01.movie.DiscountCondition;
import main.java.org.chapter02.setp01.movie.Screening;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
