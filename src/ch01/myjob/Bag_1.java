package ch01.myjob;

public class Bag_1 {
    private Long amount_1;
    private Ticket_1 ticket_1;
    private Invitation_1 invitation_1;


    public Long hold(Ticket_1 ticket_1) {
        if (hasInvitation()) {
            setTicket(ticket_1);
                setTicket(ticket_1);
                return 0L;
        } else {
                setTicket(ticket_1);
                minusAmount(ticket_1.getFee());
                return ticket_1.getFee();
        }
    }

    private void setTicket(Ticket_1 ticket_1) {this.ticket_1 = ticket_1;}

    private boolean hasInvitation() {return invitation_1 != null;}

    private void minusAmount(Long amount_1) {this.amount_1 -= amount_1;}


}
