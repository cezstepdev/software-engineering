package Workers;

import java.util.Scanner;

public class Theatre_Employee {
    String idWardrobe;
    String nameSpectacle;
    String spectacleTimetable;
    String dateSpectacle;

    public void UpdateSpectacleTimetable(int idTimetable) {
        System.out.println("zaktualizowałeś rozkład spektakli z id:" + idWardrobe + "\n");
    }

    public void ActivateAccount(int idUser) {
        System.out.println("aktywowano konto z id:" + idWardrobe + "\n");
    }

    public void CreateSpectacle() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj tytuł spektaklu: ");
        nameSpectacle = scan.nextLine();

        System.out.println("Informacja do rozkładu spektakli");
        spectacleTimetable = scan.nextLine();

        System.out.println("Data spektaklu ");
        dateSpectacle = scan.nextLine();

        System.out.println("stworzyłeś spektakl z id[...]");
    }

    public void UpdateSpectacle(int idSpectacle) {
        System.out.println("zaktualizwałeś informacje o spektaklu z id: " + idSpectacle + "\n");
    }

    public void DeleteSpectacle(int idSpectacle) {
        System.out.println("usunąłeś spektakl z id: " + idSpectacle + "\n");
    }

    public void FindClient(int idClient) {
        System.out.println("znaleziono klienta z id: " + idClient + "\n");
    }

    public void DeleteReservation(int idClient) {
        System.out.println("usunięto rezerwację klienta z id: " + idClient + "\n");
    }
}
