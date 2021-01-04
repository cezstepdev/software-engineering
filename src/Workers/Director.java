package Workers;

import java.util.Scanner;

public class Director {
    String idScenario;
    String titleScenario;
    String clientSurname;

    public void CreateScenario() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj tytuł scenariusza: ");
        titleScenario = scan.nextLine();

        System.out.println("Treść scenariusza ");
        clientSurname = scan.nextLine();

        System.out.println("stworzyłeś nowy scenariusz");
    }

    public void CreateRehearsal() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj tytuł próby: ");
        titleScenario = scan.nextLine();

        System.out.println("Data próby ");
        clientSurname = scan.nextLine();

        System.out.println("stworzyłeś nową próbę");
    }

    public void UpdateWardrobe(int idWardrobe) {
        System.out.println("zaktualizowałeś garderobę z id: " + idWardrobe + "\n");
    }

    public void UpdateScenario(int idScenario) {
        System.out.println("zaktualizowałeś scenariusz z id: " + idScenario + "\n");
    }

    public void UpdateSoundInfo(int idSound) {
        System.out.println("zaktualizowałeś informacje dla dźwiękowców z id: " + idScenario + "\n");
    }
}
