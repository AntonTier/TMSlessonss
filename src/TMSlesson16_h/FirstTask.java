package TMSlesson16_h;

import java.util.HashMap;
import java.util.Map;

public class FirstTask {

    public static void main(String[] args) {

        String [] str = {"s","a","b","a","f","f"};
        System.out.println(wordMultiple(str));

    }

    public static Map<String,Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> resultMap = new HashMap<>();

        for (String str : strings) {
            if (resultMap.containsKey(str)) {

                resultMap.put(str, true);

            } else {

                resultMap.put(str, false);
            }
        }

        return resultMap;

    }

}
