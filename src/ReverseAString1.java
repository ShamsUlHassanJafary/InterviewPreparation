public class ReverseAString1 {

    public static String str = "ShamsUlHassan";

    public static void main(String[] args) {

        String reverseString = getReverseString(str);
        System.out.println("reverse String is : " + reverseString);

    }

    private static String getReverseString(String st) {

        StringBuilder stringBuilder = new StringBuilder();
        char[] charArr = st.toCharArray();

        for (int i = charArr.length - 1; i >= 0; i--) {
            stringBuilder.append(charArr[i]);
        }

        return stringBuilder.toString();
    }
}
