package User;

import Functions.Props.Props;
import Functions.Sound.Sound;
import Functions.Wardrobe;
import Reservation.*;
import Spectacle.*;
import Worker.Worker;

import java.util.ArrayList;
import java.util.List;

public class SystemList {
    private static List<Worker> workerList = new ArrayList<Worker>();
    private static List<Client> clientList = new ArrayList<Client>();
    private static List<Wardrobe> wardrobeList = new ArrayList<Wardrobe>();
    private static List<Scenario> scenarioList = new ArrayList<Scenario>();
    private static List<Sound> soundList = new ArrayList<Sound>();
    private static List<Props> propsList = new ArrayList<Props>();
    private static List<Spectacle> spectacleList = new ArrayList<Spectacle>();
    private static List<User> userList = new ArrayList<User>();
    private static List<Ticket> ticketList = new ArrayList<Ticket>();
    private static List<Rehearsal> rehearsalList = new ArrayList<Rehearsal>();

    public static List<Spectacle> getSpectacleList() {
        return spectacleList;
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static List<Ticket> getTicketList() {
        return ticketList;
    }

    public static List<Rehearsal> getRehearsalList() {
        return rehearsalList;
    }

    public static List<Wardrobe> getWardrobeList() {
        return wardrobeList;
    }

    public static List<Scenario> getScenarioList() {
        return scenarioList;
    }

    public static List<Sound> getSoundList() {
        return soundList;
    }

    public static List<Props> getPropsList() {
        return propsList;
    }

    public static List<Worker> getWorkerList() {
        return workerList;
    }

    public static List<Client> getClientList() {
        return clientList;
    }

}
