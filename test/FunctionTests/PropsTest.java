package FunctionTests;

import Functions.Props.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PropsTest {

    @Test
    public void IsChair() {
        Props props = new Props();
        AbstractProps chair = props.getType("chair");
        chair.updateInfo("this is a chair");
        Chair result = (Chair) chair.showInfo();
        assertEquals("this is a chair", result.getDescription());
    }

    @Test
    public void LightningTest() {
        int expected = 10;
        Props props = new Props();
        Lightning lightning = (Lightning) props.getType("lightning");
        lightning.setLightningLevel(expected);
        int actual = lightning.getLightningLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void woodPositionTest() {
        String expected = "background";
        Props props = new Props();
        Wood wood = (Wood) props.getType("wood");
        wood.setPosition(expected);
        String actual = wood.getPosition();
        assertEquals(expected, actual);
    }
}
