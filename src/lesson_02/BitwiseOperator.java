package lesson_02;

public class BitwiseOperator {
    public static void main(String[] args) {
        if (getFirstNum() != 0 & getSecondNum() !=0) {
            System.out.println("Calculating...");
        }
    }

    private static int getFirstNum() {
        System.out.println("Calling getting first number!");
        return 0;
    }

    private static int getSecondNum() {
        System.out.println("Calling getting second number!");
        return 2;
    }


}
