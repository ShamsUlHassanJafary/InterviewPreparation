import java.util.Arrays;

public class MainClass {

    public static int[] arr = { 1, 5, 7, 9, 39, 903 };

    public static void main(String[] args) {

        int secondHighest = findSecondHighest(arr);
        System.out.println("second Highest using sort " + secondHighest);

    }

    private static int findSecondHighest(int[] arr2) {

        int secondHighest = Integer.MIN_VALUE;
        Arrays.sort(arr2);
        for (int i = arr2.length - 1; i >= arr2.length - 2; i--) {
            secondHighest = arr2[i];
        }

        return secondHighest;
    }
}
