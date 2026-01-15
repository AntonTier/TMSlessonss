package TMSlesson16_h;

import java.util.HashMap;
import java.util.Map;

public class SecondTask {

    public static void main(String[] args) {

        String [] ST = {"apple","juice","car","house"};
        System.out.println(pairs(ST));

    }

    public static Map<String, String> pairs(String[] strings) {

        Map<String,String> map = new HashMap<>();

        for (String str:strings) {

            if (str != null && !str.isEmpty()) {
                char firstChar = str.charAt(0);
                char lastChar = str.charAt(str.length() - 1);
                map.put(String.valueOf(firstChar), String.valueOf(lastChar));
            }

        }

        return map;

    }

}
