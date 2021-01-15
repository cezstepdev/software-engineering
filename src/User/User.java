package User;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class User {
    private static int id = 0;
    private int idUser;
    private String password;
    private String login;
    private String registerDate;
    private String firstName;
    private String lastName;

    public User(int idUser){
        id++;
        this.idUser = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void Register(String firstName, String lastName) {
        registerDate = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int Login(String login, String password){
        if(this.login != login || this.password != password)
            return -1; //error login
        else
            return 0; //login
    }
    
    public void UpdateProfile(String firstName, String lastName, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }
}
