package lab_02;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any number that you are thinking about: ");

        Long aNum = scanner.nextLong();
        System.out.println(aNum);

        if (aNum == 0) {
            System.out.println("This is neither an even nor an odd number");
        } else {
            if (aNum % 2 == 0) {
                System.out.println("This is an even number");
            } else {
                System.out.println("This is an odd number");
            }
        }

    }
}
