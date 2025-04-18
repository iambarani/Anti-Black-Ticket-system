public class Event {
    private String eventName;
    private int totalTickets;
    private int availableTickets;

    public Event(String eventName, int totalTickets) {
        this.eventName = eventName;
        this.totalTickets = totalTickets;
        this.availableTickets = totalTickets;
    }

    public String getEventName() {
        return eventName;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public boolean bookTicket(int quantity) {
        if (availableTickets >= quantity) {
            availableTickets -= quantity;
            return true;
        } else {
            return false;
        }
    }
}
