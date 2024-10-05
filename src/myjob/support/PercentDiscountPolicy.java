package myjob.support;

import myjob.ch02.DefaultDiscountPolicy;
import myjob.ch02.DiscountCondition;
import myjob.ch02.Money;
import myjob.ch02.Screening;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
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
