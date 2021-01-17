package Reservation;

import java.util.Date;

public class Ticket {
    static private int id = 0;
    private int idTicket;
    private double price;
    private int idClient;
    private String date;
    private String hall;
    private int place;

    public Ticket(double price, int idClient, String date, String hall, int place) {
        id++;
        this.idTicket = id;
        this.price = price;
        this.idClient = idClient;
        this.date = date;
        this.hall = hall;
        this.place = place;
    }

    public Ticket() {
        //empty constructor
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getIdTicket() {
        return idTicket;
    }
}
