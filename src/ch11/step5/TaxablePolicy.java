package ch11.step5;

import ch11.money.Money;

public class TaxablePolicy extends AdditionalRatePolicy {
    private double taxRate;

    public TaxablePolicy(double taxRate, RatePolicy next) {
        super(next);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRate));
    }
}
