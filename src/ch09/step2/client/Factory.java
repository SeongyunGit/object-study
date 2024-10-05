package ch09.step2.client;

import ch09.money.Money;
import ch09.step1.Movie;
import ch09.step1.pricing.AmountDiscountPolicy;
import ch09.step1.pricing.SequenceCondition;

import java.time.Duration;

public class Factory {
    public Movie createAvatarMovie() {
        return new Movie("아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy(
                        Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10)));
    }
}
