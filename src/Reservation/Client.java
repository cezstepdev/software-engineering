package Reservation;

public class Client {
    private static int id = 0;
    private int idClient;
    private String name;
    private String email;
    private String phone;

    public Client(){
        id++;
        idClient = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void viewSpectacleTimetable() {
        String timeTable = Spectacle.viewSpectacleTimeTable();
    }

    public void addToFavourites(int idSpectacle) {
        List<Spectacle> favourites = new ArrayList<Spectacle>();
        favourites.add(new Spectacle(idSpectacle));
    }

    public void buyTicket() {
        Payment payment = new Payment(idClient);
    }
}
