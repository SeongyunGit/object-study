package ch11.step3;

import ch11.money.Money;


import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private List<Call> calls = new ArrayList<>();

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }
        return result;
    }
    protected abstract Money calculateCallFee(Call call);
    protected abstract Money afterCalculated(Money fee);
}
