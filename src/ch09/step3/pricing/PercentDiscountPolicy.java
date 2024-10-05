package ch09.step3.pricing;

import ch09.money.Money;
import ch09.step3.DiscountCondition;
import ch09.step3.DiscountPolicy;
import ch09.step3.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
