package Reservation;

import Spectacle.Spectacle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private static int id = 0;
    private int idClient;
    private String name;
    private String email;
    private String phone;
    private Ticket ticket;

    public Client() {
        id++;
        idClient = id;
        ticket = new Ticket();
    }

    public static int getId() {
        return id;
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

    public Ticket getTicket() {
        return ticket;
    }

    public void viewSpectacleTimetable(int idSpectacle, String titleSpectacle, String timetableSpectacle, LocalDate dateSpectacle) {
        Spectacle spectacle = new Spectacle(idSpectacle,titleSpectacle, timetableSpectacle, dateSpectacle);
        String timeTable = spectacle.getTimetableSpectacle();
    }

    public void addToFavourites(String spectacleTitle) {
        List<Spectacle> favourites = new ArrayList<Spectacle>();
        favourites.add(Spectacle.findSpectacle(spectacleTitle));
    }

    public void buyTicket(int idSpectacle) {
        Payment payment = new Payment(idClient, idSpectacle);
        ticket = payment.makePayment();
    }
}
