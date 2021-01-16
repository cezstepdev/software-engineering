package Workers;

import Reservation.*;
import User.*;
import Worker.*;

public class Theatre_Manager{
    public void DeleteWorker(int idWorker){
        int index = 0;
        for(Worker worker : SystemBase.getWorkerList()) {
            index++;
            if (worker.getId() == idWorker) {
                SystemBase.setWorkerList(index, null);
            }
        }
    }

    public Worker FindWorker(int idWorker) {
        for (Worker worker : SystemBase.getWorkerList()) {
            if (worker.getId() == idWorker) {
                return worker;
            }
        }
        return null;
    }

    public void AddWorker(String name, String surname, String profession, String email, String phone, String salaryWorker){
        Worker worker = new Worker(name, surname, profession, email, phone, salaryWorker);
        SystemBase.addWorkerList(worker);
    }

    public void DeleteClient(int idClient){
        int index = 0;
        for(Client client : SystemBase.getClientList()) {
            index++;
            if (client.getId() == idWorker) {
                SystemBase.setClientList(index, null);
            }
        }
    }
}
