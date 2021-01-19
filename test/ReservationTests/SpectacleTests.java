package ReservationTests;

import Spectacle.Spectacle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SpectacleTests {
    @Test
    public void findSpectacleTest() {
        String title = "titleTest";
        Spectacle expected = new Spectacle(1, title, "timeTableTest", "2021-01-01");
        Spectacle actual = expected.findSpectacle(title);
        assertSame(expected, actual);
    }
}
