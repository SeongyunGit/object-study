package ch11.step5;

import ch11.money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
