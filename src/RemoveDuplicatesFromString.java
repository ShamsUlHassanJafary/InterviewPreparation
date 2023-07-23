import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

    public static String str = "Hello World";

    public static void main(String[] args) {

        String newString = removeDulicateChar(str);
        System.out.println(newString);

    }

    private static String removeDulicateChar(String str2) {

        Set<Character> charSet = new LinkedHashSet<>();

        for (char c : str2.toCharArray()) {
            charSet.add(c);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (char character : charSet) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }
}
