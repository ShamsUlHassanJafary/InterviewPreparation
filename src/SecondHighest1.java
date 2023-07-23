public class SecondHighest1 {

    public static int[] arr = { 1, 4, 6, 8, 9, 73, 64, 78 };

    public static void main(String[] args) {

        int secondHighest = findSecondHighest(arr);
        System.out.println("Second Highest : " + secondHighest);
    }

    private static int findSecondHighest(int[] arr2) {

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i <= arr2.length - 1; i++) {

            if (arr2[i] > highest) {
                secondHighest = highest;
                highest = arr2[i];
            }

            else if (arr2[i] > secondHighest && arr2[i] < highest) {
                secondHighest = arr2[i];
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            throw new RuntimeException("There is no second Highest ");
        } else {
            return secondHighest;
        }
    }
}
