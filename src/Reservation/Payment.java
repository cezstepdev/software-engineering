package Reservation;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Payment {
    private static int id;
    private int idPayment;
    private enum paymentWay{CREDIT_CART, MOBILE, BANK_TRANSFER, PREPAID_CARD, CASH};
    private String date;
    private int price;
    private boolean paid;

    public Payment(){
        id++;
        idPayment = id;
    }

    public void makePayment() {
        date = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        paid = true;
    }

    public void checkPayment() {
        if(paid)
            System.out.println("Transakcja" + id + " została zakończona " + date);
        else
            System.out.println("Transakcja" + id + " nie miała jeszcze miejsca.");
    }
}
