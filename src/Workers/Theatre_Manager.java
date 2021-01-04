package Workers;

import java.util.Scanner;

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