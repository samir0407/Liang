package Chapter3Exercise;

import java.util.Scanner;

public class Cha3Ex3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: today's day and elapsed days
        System.out.print("Enter today's day (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        // Calculate future day
        int futureDay = (today + elapsed) % 7;

        // Day names
        String[] dayNames = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // Display result
        System.out.println("Today is " + dayNames[today] + " and the future day is " + dayNames[futureDay]);

        input.close();
    }
}
