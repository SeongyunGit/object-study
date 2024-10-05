package myjob.support;

import myjob.ch02.DefaultDiscountPolicy;
import myjob.ch02.DiscountCondition;
import myjob.ch02.Money;
import myjob.ch02.Screening;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy (Money discountAmount, DiscountCondition ... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }

}
