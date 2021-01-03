package Reservation;

import java.util.Date;

public class Ticket {
    private static int id = 0;
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

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    /*public void updateInfoTicket(){

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
    }*/
}
