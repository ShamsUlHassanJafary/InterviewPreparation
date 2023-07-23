import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(2);

        Set<Integer> newSet = removeDuplicates(list);

        System.out.println(newSet);
    }

    private static Set<Integer> removeDuplicates(List<Integer> list2) {
        Set<Integer> uniqueSet = new LinkedHashSet<>(list2);
        return uniqueSet;

    }

}
