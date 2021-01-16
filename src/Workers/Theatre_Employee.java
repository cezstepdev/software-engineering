package Workers;

import Reservation.*;
import Spectacle.*;
import User.*;

public class Theatre_Employee {
    public void UpdateSpectacleTimetable(int idSpectacle, String timetable) {
        for(Spectacle spectacle: SystemList.getSpectacleList()) {
            if(spectacle != null && spectacle.getId().equals(idSpectacle)) {
                spectacle.setTimetable(timetable);
                break;
            }
        }
    }

    public void ActivateAccount(int idUser) {
        for(User user: SystemList.getUserList()) {
            if(user.getId().equals(idUser)) {
                User user = new User(idUser);
                break;
            }
        }
    }

    public void CreateSpectacle(int idSpectacle, String titleSpectacle, String timetableSpectacle, String dateSpectacle) {
        Spectacle spectacle = new Spectacle(idSpectacle, titleSpectacle, timetableSpectacle, dateSpectacle);
    }

    public void UpdateSpectacle(int idSpectacle, String titleSpectacle, String timetableSpectacle, String dateSpectacle) {
        for(Spectacle spectacle: SystemList.getSpectacleList()) {
            if(spectacle.getId().equals(idSpectacle)) {
                spectacle.updateInfo(titleSpectacle, timetableSpectacle, dateSpectacle);
                break;
            }
        }
    }

    public void DeleteSpectacle(int idSpectacle) {
        for(Spectacle spectacle: SystemList.getSpectacleList()) {
            if(spectacle.getId().equals(idSpectacle)) {
                spectacle = null;
                break;
            }
        }
    }

    public Client FindClient(int idClient) {
        for(Client client: SystemList.getClientList()) {
            if(Client.getId().equals(idClient)) {
                return client;
            }
        }
        return null;
    }

    public void DeleteReservation(int idTicket) {
        for(Ticket ticket: SystemList.getTicketList()) {
            if(ticket.getId().equals(idTicket)) {
                ticket = null;
                break;
            }
        }
    }
