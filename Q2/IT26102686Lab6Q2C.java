
import java.util.Scanner;

public class IT26102686Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
        int n6 = 0, n7 = 0, n8 = 0, n9 = 0, n10 = 0;
        int sum;
        double average;

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");

            if (i == 1) {
                n1 = input.nextInt();
            } else if (i == 2) {
                n2 = input.nextInt();
            } else if (i == 3) {
                n3 = input.nextInt();
            } else if (i == 4) {
                n4 = input.nextInt();
            } else if (i == 5) {
                n5 = input.nextInt();
            } else if (i == 6) {
                n6 = input.nextInt();
            } else if (i == 7) {
                n7 = input.nextInt();
            } else if (i == 8) {
                n8 = input.nextInt();
            } else if (i == 9) {
                n9 = input.nextInt();
            } else {
                n10 = input.nextInt();
            }

            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");

        System.out.println(n1 + " " + n2 + " " + n3 + " "
                + n4 + " " + n5 + " " + n6 + " "
                + n7 + " " + n8 + " " + n9 + " " + n10);

        sum = n1 + n2 + n3 + n4 + n5
                + n6 + n7 + n8 + n9 + n10;

        average = sum / 10.0;

        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}
