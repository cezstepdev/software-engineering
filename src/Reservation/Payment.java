package Reservation;

import Spectacle.Spectacle;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Payment {
    private static int id = 0;
    private int idPayment;
    private String date;
    private int price;
    private boolean paid;
    private int idClient;
    private int idSpectacle;

    public Payment(int idClient, int idSpectacle){
        id++;
        idPayment = id;
        this.idClient = idClient;
        this.idSpectacle = idSpectacle;
    }

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdSpectacle() {
        return idSpectacle;
    }

    public void setIdSpectacle(int idSpectacle) {
        this.idSpectacle = idSpectacle;
    }

    public Ticket makePayment() {
        if(Spectacle.numSeatsHall > 0) {
            Spectacle.numSeatsHall--;
            paid = true;
            date = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            return new Ticket(100, idClient, date, "A", 1 );
        }
        else {
            paid = false;
            return null;
        }
    }
}
