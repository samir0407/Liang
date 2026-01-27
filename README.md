package com.mycompany.chapter2Exercise;
    import java.util.Scanner;

public class Cha2Ex2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}

package com.mycompany.chapter2Exercise;

    import java.util.Scanner;

public class Cha2Ex2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

      
        double area = radius * radius * Math.PI;
        double volume = area * length;

        
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }

package com.mycompany.chapter2Exercise;

import java.util.Scanner;

public class Cha2Ex2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");
    }
    
  }

  package com.mycompany.chapter2Exercise;
import java.util.Scanner;
public class Cha2Ex2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}

package com.mycompany.chapter2Exercise;
import java.util.Scanner;

public class Cha2Ex2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
    
}

package com.mycompany.chapter2Exercise;
    import java.util.Scanner;

public class Cha2Ex2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("The sum of the digits is " + sum);
    }

}
package com.mycompany.chapter2Exercise;

    import java.util.Scanner;

public class Cha2Ex2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long totalDays = minutes / (60 * 24);
        long years = totalDays / 365;
        long days = totalDays % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }

}

package com.mycompany.chapter2Exercise;
    import java.util.Scanner;

public class Cha2Ex2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length, width, and height in meters: ");
        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();

        double volume = length * width * height;
        double weight = volume * 1000;

        System.out.println("The weight of the water is " + weight + " kilograms");
    }

}

package com.mycompany.chapter2Exercise;

 import java.util.Scanner;

public class Cha2Ex2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial velocity (u), final velocity (v), and time (t): ");
        double u = input.nextDouble();
        double v = input.nextDouble();
        double t = input.nextDouble();

        double acceleration = (v - u) / t;

        System.out.println("The acceleration is " + acceleration + " m/s²");
    }
   
}










  


    

}

