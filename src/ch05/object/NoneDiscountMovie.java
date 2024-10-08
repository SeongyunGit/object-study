package ch05.object;

import ch05.money.Money;

import java.time.Duration;

public class NoneDiscountMovie extends Movie{
    public NoneDiscountMovie(String title, Duration runningTime, Money fee) {
        super(title, runningTime, fee);
    }

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
