package ch11.step4;

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
        return afterCalculated(result);
    }

    protected Money afterCalculated(Money fee) {
        return fee;
    }
    protected abstract Money calculateCallFee(Call call);
}
