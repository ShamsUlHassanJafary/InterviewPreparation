import java.util.HashMap;
import java.util.Map;

public class CountCharOccurance {

    public static String str = "hello world";

    public static void main(String[] args) {

        Map<Character, Integer> countMap = countCharAccurence(str);

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<Character, Integer> countCharAccurence(String str2) {

        Map<Character, Integer> initalMap = new HashMap<>();

        for (char c : str2.toCharArray()) {
            initalMap.put(c, initalMap.getOrDefault(c, 0) + 1);
        }

        return initalMap;

    }

}
