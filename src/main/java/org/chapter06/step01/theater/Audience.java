package main.java.org.chapter06.step01.theater;

public class Audience {
    private Bag bag;

    public Bag getBag() {
        return bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
