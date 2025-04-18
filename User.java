// User.java
public class User {
    protected String username;
    protected String password;
    protected int ticketsBooked;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.ticketsBooked = 0;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public int getTicketsBooked() {
        return ticketsBooked;
    }

    public void bookTickets(int number) {
        this.ticketsBooked += number;
    }
}
