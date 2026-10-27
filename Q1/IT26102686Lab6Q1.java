import java.util.Scanner;

public class IT26102686Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number, square, squareRoot;

        System.out.print("Enter a number: ");
        number = input.nextDouble();
		
		if(number <= 0){
		 System.out.println("Invalied number");
		}
		
		else{
			square = number * number;
			squareRoot = Math.sqrt(number);

			System.out.println();
			System.out.println("Square = " + square);
			System.out.println("Square Root = " + squareRoot);
		}

        input.close();
    }
}