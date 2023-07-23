
import java.util.Arrays;

public class SecondLargestNumberFromArray {

    public static int[] aa = { 89, 78, 63, 782 };

    public static void main(String[] args) {

        Arrays.sort(aa); // {63,89,782,782}
        for (int i = aa.length - 2; i >= aa.length - 2; i--) {
            System.out.println(aa[i]);
        }

    }
}
