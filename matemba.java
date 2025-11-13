import java.util.Scanner;

public class matemba {

    public static void main(String[] args) {

        Scanner Emmanuel = new Scanner(System.in);

        // allow the user to enter the first number
        System.out.println("Enter first number:");
        double a = Emmanuel.nextDouble();

        // allow the user to enter the second number
        System.out.println("Enter second number");
        double b = Emmanuel.nextDouble();

        // allow the user to enter the numbers

        System.out.println("Enter third number");
        double c = Emmanuel.nextDouble();

        // allow the user to enter the fourth number
        System.out.println("Enter fourth number");
        double d = Emmanuel.nextDouble();

        // calculate average sum
        double sum = (a + b + c + d);
        double average = sum / 4;

        // Display the resuits
        System.out.println("The average of " + a + ", " + b + ", " + +c + ", " + d + " is " + average);

        Emmanuel.close();
    }

}
