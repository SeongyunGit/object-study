package ch08.pricing;

import ch08.money.Money;
import ch08.movie.DiscountPolicy;
import ch08.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
