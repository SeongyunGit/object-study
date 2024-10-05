package ch09.step2.pricing;

import ch09.money.Money;
import ch09.step2.DiscountPolicy;
import ch09.step2.Screening;
import ch09.step2.DiscountCondition;


public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
