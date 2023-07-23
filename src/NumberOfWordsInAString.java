public class NumberOfWordsInAString {

    public static String str = "hello how are you?";

    public static void main(String[] args) {

        String[] arryOfString = str.split("\s");
        int count = arryOfString.length;
        System.out.println(count);
    }
}
