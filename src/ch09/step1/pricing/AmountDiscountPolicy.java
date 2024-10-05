package ch09.step1.pricing;

import ch09.money.Money;
import ch09.step1.DiscountCondition;
import ch09.step1.DiscountPolicy;
import ch09.step1.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition ... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
