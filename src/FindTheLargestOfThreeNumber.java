public class FindTheLargestOfThreeNumber {

    public static int a = 25;
    public static int b = 24;
    public static int c = 20;

    public static void main(String[] args) {

        int largestNumber = findLargest(a, b, c);
        System.out.println(largestNumber);

    }

    private static int findLargest(int x, int y, int z) {
        int largest = x;

        if (y >= largest) {
            largest = y;
        }

        if (z >= largest) {
            largest = z;
        }

        return largest;
    }

}
