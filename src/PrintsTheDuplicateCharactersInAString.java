import java.util.HashMap;
import java.util.Map;

public class PrintsTheDuplicateCharactersInAString {

    public static String str = "Hello My fellow";

    public static void main(String[] args) {

        String str = "Hello World!";
        printDuplicateCharacters(str);

    }

    public static void printDuplicateCharacters(String str) {
        // Create a HashMap containing character as a key and occurrences as a value
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = str.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                // If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If char is not present in charCountMap, putting this char to charCountMap
                // with 1 as it's value
                charCountMap.put(c, 1);
            }
        }

        // Printing the charCountMap
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

}
