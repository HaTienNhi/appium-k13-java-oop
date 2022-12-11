package lab_02;

import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height (m): ");
        float height = scanner.nextFloat();
        System.out.print("Please enter your weight (kg): ");
        float weight = scanner.nextFloat();

        float bmi = weight / (height * 2);
        System.out.println("Your BMI index is " + bmi);

        if(bmi < 18.5) {
            System.out.println("Oops! You are underweight! Let's eat more");
        } else if(bmi <= 24.9) {
            System.out.println("Great! You have a normal weight");
        } else if(bmi <= 29.9){
            System.out.println("Oops! You are overweight! Just eat less");
        } else {
            System.out.println("Oh no! You are obesity...");
        }
    }
}
