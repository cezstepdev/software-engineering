import java.util.Scanner;

public class Director{
    public void CreateScenario(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj tytuł scenariusza: ");
        titleScenario = scan.nextLine();

        System.out.println("Treść scenariusza ");
        clientSurname = scan.nextLine();

        System.out.println("stworzyłeś nowy scenariusz");
    }

    public void CreateRehearsal(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj tytuł próby: ");
        titleScenario = scan.nextLine();

        System.out.println("Data próby ");
        clientSurname = scan.nextLine();

        System.out.println("stworzyłeś nową próbę");
    }

    public void UpdateWardrobe(int idWardrobe){
        System.out.println("zaktualizowałeś garderobę z id: "+idWardrobe+"\n");
    }

    public void UpdateScenario(int idScenario){
        System.out.println("zaktualizowałeś scenariusz z id: "+idScenario+"\n");
    }

    public void UpdateSoundInfo(int idSound){
        System.out.println("zaktualizowałeś informacje dla dźwiękowców z id: "+idScenario+"\n");
    }

    public void UpdateWardrobe(int idWardrobe){
        System.out.println("zaktualizowałeś listę rekwizytów z id: "+idWardrobe+"\n");
    }
}

public class Actress_Actor{
    public void CheckScenario(){
        System.out.println("scenariusz spektaklu: ");
    }

    public void CheckWardrobe(){
        System.out.println("garderoba do spektaklu: ");
    }

    public void CheckProps(){
        System.out.println("rekwizyty do spektaklu: ");
    }

    public void CheckSoundInfo(){
        System.out.println("informacje dla dźwiękowców do spektaklu: ");
    }

    public void CheckRehearsal() {
        System.out.println("informacje o próbach: ");
    }
}

public class Theatre_Employee{
    public void UpdateSpectacleTimetable(int idTimetable){
        System.out.println("zaktualizowałeś rozkład spektakli z id:"+idWardrobe+"\n");
    }

    public void ActivateAccount(int idUser){
        System.out.println("aktywowano konto z id:"+idWardrobe+"\n");
    }

    public void CreateSpectacle(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj tytuł spektaklu: ");
        nameSpectacle = scan.nextLine();

        System.out.println("Informacja do rozkładu spektakli");
        spectacleTimetable = scan.nextLine();

        System.out.println("Data spektaklu ");
        dateSpectacle = scan.nextLine();

        System.out.println("stworzyłeś spektakl z id[...]");
    }

    public void UpdateSpectacle(int idSpectacle){
        System.out.println("zaktualizwałeś informacje o spektaklu z id: "+idSpectacle+"\n");
    }

    public void DeleteSpectacle(int idSpectacle){
        System.out.println("usunąłeś spektakl z id: "+idSpectacle+"\n");
    }

    public void FindClient(int idClient){
        System.out.println("znaleziono klienta z id: "+idClient+"\n");
    }

    public void DeleteReservation(int idClient){
        System.out.println("usunięto rezerwację klienta z id: "+idClient+"\n");
    }
}

public class Theatre_Manager{
    public void DeleteWorker(int idWorker){
        System.out.println("usunięto pracownika z id: "+idWorker+"\n");
    }

    public void FindWorker(int idWorker){
        System.out.println("znaleziono pracownika z id: "+idWorker+"\n");
    }

    public void AddWorker(int idWorker){
        System.out.println("dodałeś pracownika z id: "+idWorker+"\n");
    }

    public void DeleteClient(int idClient){
        System.out.println("usunąłeś klienta z id:"+idClient+"\n");
    }
}