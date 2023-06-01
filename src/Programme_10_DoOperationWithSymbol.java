
/*
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
import java.util.Scanner;
public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {

        //scanner declaration for reading input from console
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int y = scanner.nextInt();
        System.out.print("Please select the calculation symbol +, -, *, / : ");

        char symbol = scanner.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);
        //Closing the scanner object
        scanner.close();
    }

    // Calculating operation based on symbol
    public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
        if (symbol == '+') {
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + " x " + y + " = " + (x * y));
        } else if (symbol == '/') {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Please enter correct symbol +,-,*,/");
        }
    }
    }



