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

    public void viewSpectacleTimetable(){
        System.out.println("seanse: ");
    }

    public void addToFavourites(){
        System.out.println("dodałes seans do ulubionych");
    }

    public void buyTicket(){
        System.out.println("zakupiłes bilet na seans");
    }

    public void makeReservation() {
        System.out.println("zarezerwowałes bilet na seans");
    }
}
