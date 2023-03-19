package main.java.org.chapter06.step01.theater;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
