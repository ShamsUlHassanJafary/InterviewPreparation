public class SwapTwoNumber {

    public static int a = 10;
    public static int b = -20;

    public static void main(String[] args) {

        System.out.println("before swap a = " + a + " b = " + b);
        swap(a, b);

    }

    public static void swap(int a, int b) {

        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println("After swap a = " + a + " b = " + b);

    }
}
