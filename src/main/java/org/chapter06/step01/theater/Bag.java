package main.java.org.chapter06.step01.theater;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
