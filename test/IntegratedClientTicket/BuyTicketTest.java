package IntegratedClientTicket;

import Reservation.Client;
import Spectacle.Spectacle;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;

public class BuyTicketTest {
    @Test
    public void buyTicketTest() {
        Client client = new Client();
        client.buyTicket(1);
        assertSame(1, client.getTicket().getIdTicket());
    }

    @Test
    public void addToFavouritesTest() {
        new Spectacle(1,"test1","testTimeTable", "2021-01-01");
        Client client = new Client();
        client.addToFavourites("test1");
        List<Spectacle> actual = client.getFavourites();
        Spectacle expected = Spectacle.findSpectacle("test1");
        assertSame(expected, actual.get(0));
    }

    @Test
    public void getSpectacleTimeTableTest() {
        Spectacle spectacle = new Spectacle(1,"test1","testTimeTable", "2021-01-01");
        String expected = spectacle.getTimetableSpectacle();
        Client client = new Client();
        Spectacle searched = Spectacle.findSpectacle("test1");
        String actualSpectacle = client.viewSpectacleTimetable(searched);
        assertSame(expected, actualSpectacle);
    }
}
