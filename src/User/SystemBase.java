package User;

import Functions.Props.Props;
import Functions.Sound.Sound;
import Functions.Wardrobe;
import Reservation.*;
import Spectacle.*;
import Worker.Worker;

import java.util.ArrayList;
import java.util.List;

public class SystemBase {
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

    public static void setWorkerList(int index, Worker worker){
        workerList.set(index, worker);
    }

    public static void setClientList(int index, Client client){
        clientList.set(index, client);
    }

    public static void setWardrobeList(int index, Wardrobe wardrobe){
        wardrobeList.set(index, wardrobe);
    }

    public static void setScenarioList(int index, Scenario scenario){
        scenarioList.set(index, scenario);
    }

    public static void setSoundList(int index, Sound sound){
        soundList.set(index, sound);
    }

    public static void setPropsList(int index, Props props){
        propsList.set(index, props);
    }

    public static void setSpectacleList(int index, Spectacle spectacle){
        spectacleList.set(index, spectacle);
    }

    public static void setUserList(int index, User user){
        userList.set(index, user);
    }

    public static void setTicketList(int index, Ticket ticket){
        ticketList.set(index, ticket);
    }

    public static void setRehearsalList(int index, Rehearsal rehearsal){
        rehearsalList.set(index, rehearsal);
    }

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

    public static void addWorkerList(Worker worker){
        workerList.add(worker);
    }

    public static void addClientList(Client client){
        clientList.add(client);
    }

    public static void addWardrobeList(Wardrobe wardrobe){
        wardrobeList.add(wardrobe);
    }

    public static void addScenarioList(Scenario scenario){
        scenarioList.add(scenario);
    }

    public static void addSoundList(Sound sound){
        soundList.add(sound);
    }

    public static void addPropsList(Props props){
        propsList.add(props);
    }

    public static void addSpectacleList(Spectacle spectacle){
        spectacleList.add(spectacle);
    }

    public static void addUserList(User user){
        userList.add(user);
    }

    public static void addTicketList(Ticket ticket){
        ticketList.add(ticket);
    }

    public static void addRehearsalList(Rehearsal rehearsal){
        rehearsalList.add(rehearsal);
    }
}
