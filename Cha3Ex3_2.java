package Chapter3Exercise;

import java.util.Scanner;

public class Cha3Ex3_2 {
    public static void main(String[] args) {
       
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

       
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");

        int answer = input.nextInt();


        if (answer == number1 + number2 + number3) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 + number2 + number3));
        }

        input.close();
    }
}
