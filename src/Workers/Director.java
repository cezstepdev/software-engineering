package Workers;

import Functions.Props.*;
import Functions.Sound.*;
import Functions.*;
import Spectacle.*;
import User.*;

public class Director {
    public void CreateScenario(String titleScenario, String textScenario) {
        Scenario scenario = new Scenario(titleScenario, textScenario);
    }

    public void CreateRehearsal(String titleRehearsal, String dateRehearsal) {
        Rehearsal rehearsal = new Rehearsal(titleRehearsal, dateRehearsal);
    }

    public void UpdateWardrobe(int idWardrobe, String shirts, String shoes, String pants) {
        for(Wardrobe wardrobe: SystemList.getWardrobeList()) {
            if(wardrobe != null && wardrobe.getId().equals(idWardrobe)) {
                wardrobe.updateInfo(shirts, shoes, pants);
                break;
            }
        }
    }

    public void UpdateScenario(int idScenario, String titleScenario,String textScenario) {
        for(Scenario scenario: SystemList.getScenarioList()) {
            if(scenario != null && scenario.getId().equals(idScenario)) {
                scenario.updateInfo(titleScenario, textScenario);
                break;
            }
        }
    }

    public void UpdateSoundInfo(int idSound, String notes) {
        for(Sound sound: SystemList.getSoundList()) {
            if(sound != null && sound.getId().equals(idSound)) {
                sound.updateInfo(notes);
                break;
            }
        }
    }

    public void UpdateProps(int idProps, String description) {
        for(Props props: SystemList.getPropsList()) {
            if(props != null && props.getId().equals(idProps)) {
                props.updateInfo(description);
                break;
            }
        }
    }
}
