package myjob.support;

import myjob.ch02.DiscountPolicy;
import myjob.ch02.Money;
import myjob.ch02.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
