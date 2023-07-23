public class SecondHighest {

    public static void main(String[] args) {
        int[] arr = { 10, 5, 8, 1, 7, 6, 3 };
        System.out.println("Second largest number is " + findSecondLargest(arr));
    }

    static int findSecondLargest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] < highest) {
                secondHighest = arr[i];
            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest number.");
        } else {
            return secondHighest;
        }
    }
}
