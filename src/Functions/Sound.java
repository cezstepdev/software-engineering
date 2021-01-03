package Functions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sound {
    private static int id = 0;
    private int idSound;

    public Sound() {
        id++;
        idSound = id;
    }

    private static Map<Integer, String> element = new HashMap<>();

    public void showAllSound() {
        Set<Map.Entry<Integer,String>> entrySet = element.entrySet();

        for(Map.Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}


