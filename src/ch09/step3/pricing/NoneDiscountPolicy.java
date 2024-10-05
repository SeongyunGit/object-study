package ch09.step3.pricing;

import ch09.money.Money;
import ch09.step3.DiscountPolicy;
import ch09.step3.Screening;


public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
