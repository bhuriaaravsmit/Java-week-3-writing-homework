/*
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
import java.util.Scanner;
public class Programme_16_FindPositiveNegative {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();

        findNumberIsPositiveNegativeOrZero( n);
        sc.close();//closing scanner
    }
public static void findNumberIsPositiveNegativeOrZero(int number){

        if(number>0)
        {
            System.out.println(number + " is a Positive number");
        }
        else if (number <0){
            System.out.println(number + " is a Negative number");
        }
        else {

            System.out.println(number + " is Zero");
        }
}

}
