package ReservationTests;

import Spectacle.Scenario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScenarioTest {
    @Test
    public void updateInfoTest() {
        String expectedTitle = "expectedTitle";
        String expectedText = "expectedText";
        Scenario scenario = new Scenario("titleTest", "textTest");
        scenario.updateInfo(expectedTitle, expectedText);
        String actualText = scenario.getText();
        String actualTitle = scenario.getTitle();
        assertEquals(expectedText, actualText);
        assertEquals(expectedTitle, actualTitle);
    }
}
