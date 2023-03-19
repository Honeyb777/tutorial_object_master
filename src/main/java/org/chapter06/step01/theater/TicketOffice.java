package main.java.org.chapter06.step01.theater;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public Ticket getTickets() {
        return tickets.remove(0);
    }

    public void plusAmount(Long sell) {
        this.amount += amount;
    }
}
