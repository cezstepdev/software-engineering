package FunctionTests;

import Functions.Props.AbstractProps;
import Functions.Props.Chair;
import Functions.Props.Props;
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

    }
}
