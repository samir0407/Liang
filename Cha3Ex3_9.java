package Chapter3Exercise;


        import java.util.Scanner;

public class Cha3Ex3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: first 9 digits as integer
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = input.next();

        // Pad with leading zeros if needed
        while (isbn.length() < 9) {
            isbn = "0" + isbn;
        }

        // Calculate checksum
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = isbn.charAt(i) - '0';
            sum += digit * (i + 1);
        }

        int checksum = sum % 11;

        // Final digit: use 'X' if checksum is 10
        String lastDigit = (checksum == 10) ? "X" : String.valueOf(checksum);

        // Display full ISBN-10
        System.out.println("The ISBN-10 number is " + isbn + lastDigit);

        input.close();
    }
}
      

