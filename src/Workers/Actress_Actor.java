package Workers;

import Functions.*;
import Functions.Props.*;
import Functions.Sound.*;
import Spectacle.*;
import User.SystemList;


public class Actress_Actor {
    public Scenario CheckScenario(int idScenario) {
        for(Scenario scenario: SystemList.getScenarioList()) {
            if(scenario.getId().equals(idScenario)) {
                return scenario;
            }
        }
        return null;
    }

    public Wardrobe CheckWardrobe(int idWardrobe) {
        for(Wardrobe wardrobe: SystemList.getWardrobeList()) {
            if(wardrobe.getId().equals(idWardrobe)) {
                return wardrobe;
            }
        }
        return null;
    }

    public Props CheckProps(int idWardrobe) {
        for(Props props: SystemList.getPropsList()) {
            if(props.getId().equals(idWardrobe)) {
                return props;
            }
        }
        return null;
    }

    public Sound CheckSoundInfo(int idSound) {
        for(Sound sound: SystemList.getSoundList()) {
            if(sound.getId().equals(idSound)) {
                return sound;
            }
        }
        return null;
    }

    public Rehearsal CheckRehearsal(int idRehearsal) {
        for(Rehearsal rehearsal: SystemList.getRehearsalList()) {
            if(rehearsal.getId().equals(idRehearsal)) {
                return rehearsal;
            }
        }
        return null;
    }
}
