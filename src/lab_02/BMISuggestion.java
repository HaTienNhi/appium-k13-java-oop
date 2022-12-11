package lab_02;

import java.util.Scanner;

public class BMISuggestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height (m): ");
        double height = scanner.nextDouble();
        System.out.print("Please enter your weight (kg): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * 2);
        System.out.println("Your BMI index is " + bmi);

        double incWeight = (18.5 * (height * 2)) - weight;
        double decWeight = weight - (24.9 * (height * 2));

        if(bmi < 18.5) {
            System.out.println("Oops! You are underweight! Let's eat more");
            System.out.println("You should increase more " + incWeight + " kg to have a normal weight!");
        } else if(bmi <= 24.9) {
            System.out.println("Great! You have a normal weight");
        } else if(bmi <= 29.9){
            System.out.println("Oops! You are overweight! Just eat less");
            System.out.println("You should decrease more " + decWeight + " kg to have a normal weight!");
        } else {
            System.out.println("Oh no! You are obesity...");
            System.out.println("You should decrease more " + decWeight + " kg to have a normal weight!");
        }
    }
}
