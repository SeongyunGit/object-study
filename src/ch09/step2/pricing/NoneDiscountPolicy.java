package ch09.step2.pricing;

import ch09.money.Money;
import ch09.step2.DiscountPolicy;
import ch09.step2.Screening;


public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
