package ch04.object;

import ch04.money.Money;

public class ReservationAgency {

    public Reservation reserve (Screening screening, Customer customer, int audienceCount) {
        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
