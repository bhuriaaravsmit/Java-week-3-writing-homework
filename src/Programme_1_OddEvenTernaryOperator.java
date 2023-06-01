
/*
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
import java.util.Scanner;
public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {

        //scanner declaration as reading input from scanner

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the number");


        int number=scanner.nextInt();
        isItOddOrEvenNUmber(number);
        //closing the Scanner object

        scanner.close();

    }

        public static void isItOddOrEvenNUmber(int number){
        //ternary operator is used

        String evenOrOdd = (number%2==0)?" Even":" Odd";

        System.out.println("The " + number + " is" + evenOrOdd + " number");

    }

}
