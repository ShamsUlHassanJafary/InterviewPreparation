import java.util.ArrayList;
import java.util.List;

public class CommonElementsBetweenTwoArrays {

    public static int[] a = { 2, 4, 6, 8, 9, 88 };
    public static int[] b = { 2, 8, 6, 5, 99, 78 };
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i <= a.length - 1; i++) {

            for (int j = 0; j <= b.length - 1; j++) {

                if (a[i] == b[j]) {
                    list.add(a[i]);

                }
            }
        }

        System.out.println(list);
    }
}
