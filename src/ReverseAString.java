public class ReverseAString {

    public static void main(String[] args) {

        reverseAString("abcdefggijk");
    }

    private static void reverseAString(String string) {

        char[] ch = string.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {

            System.out.print(ch[i]);
        }
    }
}
