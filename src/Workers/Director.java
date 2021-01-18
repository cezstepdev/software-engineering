/*

package Workers;

import Functions.Props.*;
import Functions.Sound.*;
import Functions.*;
import Spectacle.*;
import User.*;

import java.time.LocalDate;


public class Director {
    public void CreateScenario(String titleScenario, String textScenario) {
        Scenario scenario = new Scenario(titleScenario, textScenario);
        SystemBase.addScenarioList(scenario);
    }

    public void CreateRehearsal(String titleRehearsal, String dateRehearsal) {
        Rehearsal rehearsal = new Rehearsal(titleRehearsal, dateRehearsal);
        SystemBase.addRehearsalList(rehearsal);
    }

    public void UpdateWardrobe(int idWardrobe, String shirts, String shoes, String pants) {
        for(Wardrobe wardrobe : SystemBase.getWardrobeList()) {
            if(wardrobe.getId() == idWardrobe) {
                wardrobe.updateInfo(shirts, shoes, pants);
                break;
            }
        }
    }

    public void UpdateScenario(int idScenario, String titleScenario,String textScenario) {
        for(Scenario scenario: SystemBase.getScenarioList()) {
            if(scenario.getId() == idScenario) {
                scenario.updateInfo(titleScenario, textScenario);
                break;
            }
        }
    }

    public void UpdateSoundInfo(int idSound, String notes) {
        for(Sound sound: SystemBase.getSoundList()) {
            if(sound.getId() == idSound) {
                sound.updateInfo(notes);
                break;
            }
        }
    }

    public void UpdateProps(int idProps, String description) {
        for(Props props: SystemBase.getPropsList()) {
            if(props.getId() == idProps) {
                props.updateInfo(description);
                break;
            }
        }
    }
}
*/
