package Chapter3Exercise;


import java.util.Scanner;

public class Cha3Ex3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

      
        number = Math.abs(number);

        int firstDigit = number / 100;
        int lastDigit = number % 10;

     
        if (firstDigit == lastDigit) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

        input.close();
    }
}
