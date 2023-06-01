/*
 * Write a Java program to sum values of an array.
 */

import java.util.Arrays;
public class Programme_18_SumOfArray {

    public static void main(String[] args) {
   // Numerical array declaration

      int [] numArray = { 1789,2035 , 189 , 2040 , 2055 , 7898 , 5236 ,1455} ;

        int sum=0;


        //calculating the sum of arrays value using for loop
        for (int i=0;i<numArray.length ;i++)
        {

            sum=sum+ numArray[i];
        }
        System.out.println("Values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Sum of all the values of the array are: " + sum);


    }


}
