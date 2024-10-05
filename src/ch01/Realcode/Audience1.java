package ch01.Realcode;

public class Audience1 {
    private Bag1 bag1;

    public Long buy (Ticket1 ticket1) {
        return bag1.hold(ticket1);
    }
}
