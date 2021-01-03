package Functions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Props {

    private Map<Integer, String> element = new HashMap<>();

    public void showAllProps() {
        Set<Map.Entry<Integer,String>> entrySet = element.entrySet();

        for(Map.Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}


