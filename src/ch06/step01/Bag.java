package ch06.step01;

public class Bag {
    public Long amount;
    private Invitation invitation;
    private Ticket ticket;



    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            this.ticket = ticket;
            return 0L;
        } else {
            this.ticket = ticket;
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
