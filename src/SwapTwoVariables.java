public class SwapTwoVariables {

    public static int a = -9;
    public static int b = 7;

    public static void main(String[] args) {
        System.out.println("before swap a : " + a + " b : " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swap a : " + a + " b : " + b);

    }

}
