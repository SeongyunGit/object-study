package ch09.step3.pricing;

import ch09.money.Money;
import ch09.step3.DiscountCondition;
import ch09.step3.DiscountPolicy;
import ch09.step3.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
