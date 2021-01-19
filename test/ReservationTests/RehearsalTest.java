package ReservationTests;

import Spectacle.Rehearsal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class RehearsalTest {
    @Test
    public void getTitleTest() {
        String expected = "titleTest";
        Rehearsal rehearsal = new Rehearsal(expected, "2021-01-01");
        String actual = rehearsal.getTitle();
        assertEquals(expected, actual);
    }

    @Test
    public void getIdRehearsalTest() {
        Rehearsal expected = new Rehearsal("testTilte", "2021-01-01");
        Rehearsal actual = expected.showAllRehearsal();
        assertSame(expected, actual);
    }
}
