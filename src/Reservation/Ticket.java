package Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ticket {
    private static int id;
    private int idTicket;
    private String clientName;
    private String clientSurname;
    private double price;
    private int idClient;
    private Date date;
    private String hall;
    private int place;

    public Ticket() {
        id++;
        idTicket = id;
    }

    public void updateInfoTicket(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Update name: ");
        clientName = scan.nextLine();

        System.out.println("Update client surname: ");
        clientSurname = scan.nextLine();

        System.out.println("Update price: ");
        price = scan.nextDouble();

        System.out.println("Update client id: ");
        idClient = scan.nextInt();

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Update date: ");
        String tmp = scan.nextLine();
        try {
            date = sdf.parse(tmp);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Update hall: ");
        hall = scan.nextLine();

        System.out.println("Update place: ");
        place = scan.nextInt();
    }
}
