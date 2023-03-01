package main.java.org.chapter02.step02.movie;

import main.java.org.chapter02.step02.money.Money;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
