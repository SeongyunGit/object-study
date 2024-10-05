package ch09.step1.pricing;

import ch09.money.Money;
import ch09.step1.DiscountCondition;
import ch09.step1.DiscountPolicy;
import ch09.step1.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition ... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
