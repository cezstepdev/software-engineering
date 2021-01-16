package Workers;

import Reservation.*;
import User.*;
import Worker.*;

import java.util.ArrayList;
import java.util.List;

public class Theatre_Manager{
    public void DeleteWorker(int idWorker){
        for(Worker worker: SystemList.getWorkerList()) {
            if(worker.getId() == (idWorker)) {
                worker = null;
                break;
            }
        }
    }

    public Worker FindWorker(int idWorker){
        for(Worker worker: SystemList.getWorkerList()) {
            if(worker.getId() == (idWorker)) {
                return worker;
            }
        }
        return null;
    }

    public void AddWorker(String name, String surname, String profession, String email, String phone, String salaryWorker){
        Worker worker = new Worker(name, surname, profession, email, phone, salaryWorker);
    }

    public void DeleteClient(int idClient){
        for(Client client: SystemList.getClientList()) {
            if(client.getId() == equals(idClient)) {
                client = null;
                break;
            }
        }
    }
}
