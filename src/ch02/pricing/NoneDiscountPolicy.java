package ch02.pricing;

import ch02.code.DiscountPolicy;
import ch02.code.Money;
import ch02.code.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
