package ch01.myjob;

public class Theater_1 {
    private TicketSeller_1 ticketSeller_1;

    public Theater_1(TicketSeller_1 ticketSeller_1) {
        this.ticketSeller_1 = ticketSeller_1;
    }

    public void enter(Audience_1 audience_1) {
        ticketSeller_1.sellTo(audience_1);
    }
}
