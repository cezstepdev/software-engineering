package Reservation;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Payment {
    private static int id = 0;
    private int idPayment;
    private enum paymentWay{CREDIT_CART, MOBILE, BANK_TRANSFER, PREPAID_CARD, CASH};
    private String date;
    private int price;
    private boolean paid;
    private int idClient;

    public Payment(int idClient){
        id++;
        idPayment = id;
        this.idClient = idClient;
    }

    public void makePayment() {
        date = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        paid = true;
    }
}
