package ch09.step1.pricing;

import ch09.money.Money;
import ch09.step1.DiscountPolicy;
import ch09.step1.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
