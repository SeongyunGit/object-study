package ch11.step4;

import ch11.money.Money;

import java.time.Duration;

public class RateDiscountableAndTaxableNightlyDiscountPhone extends RateDiscountbaleNightlyDiscountPhone {
    private double taxRate;

    public RateDiscountableAndTaxableNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds, Money discountAmount, double taxRate) {
        super(nightlyAmount, regularAmount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
