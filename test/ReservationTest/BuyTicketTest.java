package ReservationTest;

import Reservation.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class BuyTicketTest {
    @Test
    public void buyTicketTest() {
        Client client = new Client();
        client.buyTicket(1);

        assertSame(1, client.getTicket().getIdTicket());
    }
}
