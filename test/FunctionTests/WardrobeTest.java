package FunctionTests;

import Functions.Wardrobe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WardrobeTest {
    @Test
    public void updateAndGetInfoWardrobeTest() {
        Wardrobe expected = new Wardrobe();
        expected.updateInfo("shirtTest", "shoesTest", "pantsTest");
        Wardrobe actual = expected.getInfo();
        assertEquals(expected, actual);
    }

    @Test void getIdWardrobeTest() {
        Wardrobe wardrobe = new Wardrobe();
        int expected = 1;
        int actual = wardrobe.getId();
        assertEquals(expected, actual);
    }
}