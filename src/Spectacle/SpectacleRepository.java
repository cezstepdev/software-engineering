package Spectacle;

import java.util.List;
import Functions.*;
import Functions.Props.Props;
import Functions.Sound.Sound;

public interface SpectacleRepository {
		List<Rehearsal> showAllRehearsal();
		List<Scenario> showAllScenario();
		List<Sound> showAllSound();
		List<Wardrobe> showAllWardrobe();
		List<Props> showAllProps();
}
