/*
package Workers;
import Reservation.*;
import Spectacle.*;
import User.*;

import java.time.LocalDate;

public class Theatre_Employee {
    public void UpdateSpectacleTimetable(int idSpectacle, String timetable) {
        for (Spectacle spectacle : SystemBase.getSpectacleList()) {
            if (spectacle.getId() == idSpectacle) {
                spectacle.updateInfo(timetable);
                break;
            }
        }
    }

    public void ActivateAccount(int idUser) {
        for (User user : SystemBase.getUserList()) {
            if (user.getId() == idUser) {
                user.setActivated(true);
                break;
            }
        }
    }

    public void CreateSpectacle(int idSpectacle, String titleSpectacle, String timetableSpectacle, String dateSpectacle) {
        Spectacle spectacle = new Spectacle(idSpectacle, titleSpectacle, timetableSpectacle, dateSpectacle);
        SystemBase.addSpectacleList(spectacle);
    }

    public void UpdateSpectacle(int idSpectacle, String titleSpectacle, String timetableSpectacle, String dateSpectacle) {
        for (Spectacle spectacle : SystemBase.getSpectacleList()) {
            if (spectacle.getId() == (idSpectacle)) {
                spectacle.updateInfo(titleSpectacle, timetableSpectacle, dateSpectacle);
                break;
            }
        }
    }

    public void DeleteSpectacle(int idSpectacle) {
        int index = 0;
        for (Spectacle spectacle : SystemBase.getSpectacleList()) {
            index++;
            if (spectacle.getId() == idSpectacle) {
                SystemBase.setSpectacleList(index, null);
                break;
            }
        }
    }

    public Client FindClient(int idClient) {
        for (Client client : SystemBase.getClientList()) {
            if (client.getId() == idClient) {
                return client;
            }
        }
        return null;
    }

    public void DeleteReservation(int idTicket) {
        int index = 0;
        for (Ticket ticket : SystemBase.getTicketList()) {
            index++;
            if (ticket.getIdTicket() == idTicket) {
                SystemBase.setTicketList(index, null);
                break;
            }
        }
    }
}
*/
