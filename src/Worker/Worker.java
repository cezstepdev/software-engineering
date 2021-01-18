package Worker;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private static int id = 0;
    private int idWorker;
    private String name;
    private String surname;
    private String profession;
    private String email;
    private String phone;
    private String salaryWorker;

    public Worker(String name, String surname, String profession, String email, String phone, String salaryWorker){
        id++;
        idWorker = id;
    }

    public int getId() { return idWorker;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSalaryWorker() {
        return salaryWorker;
    }

    public void setSalaryWorker(String salaryWorker) {
        this.salaryWorker = salaryWorker;
    }

}
