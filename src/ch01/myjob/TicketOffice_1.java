package ch01.myjob;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice_1 {
    private List<Ticket_1> tickets_1 = new ArrayList<>();
    private Long amount_1 = 0L;

    public void sellTicketTo(Audience_1 audience_1) {
        plusAmount(audience_1.buy(getTicket()));
    }

    private Ticket_1 getTicket() {
        return tickets_1.remove(0);
    }

    private void plusAmount(Long amount_1) {
        this.amount_1 += amount_1;
    }
}
