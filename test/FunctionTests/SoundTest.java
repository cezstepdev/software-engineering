package FunctionTests;

import Functions.Sound.AbstractSound;
import Functions.Sound.Guitar;
import Functions.Sound.Sound;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SoundTest {
    @Test
    public void getGuitarTypeTest() {
        String expected = "bass";
        Sound sound = new Sound();
        Guitar guitar = (Guitar) sound.getType("guitar");
        guitar.setType(expected);
        String actual = guitar.getType();
        assertEquals(expected, actual);
    }
}
