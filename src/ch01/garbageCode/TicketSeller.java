package ch01.garbageCode;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public static class Audience {
        private Bag bag;

        public Audience(Bag bag) {
            this.bag = bag;
        }

        public Bag getBag() {
            return bag;
        }
    }
}
