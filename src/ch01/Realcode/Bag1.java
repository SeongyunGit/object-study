package ch01.Realcode;

public class Bag1 {
    private Long amount1;
    private Invitation1 invitation1;
    private Ticket1 ticket1;

    public Long hold(Ticket1 ticket1) {
        if (hasInvitation()) {
            setTicket(ticket1);
            return 0L;
        } else {
            setTicket(ticket1);
            minusAmount(ticket1.getFee());
            return ticket1.getFee();
        }
    }

    private void setTicket(Ticket1 ticket1) {
        this.ticket1 = ticket1;
    }

    private boolean hasInvitation() {
        return invitation1 !=null;
    }

    private void minusAmount(Long amount1) {
        this.amount1 -= amount1;
    }

}
