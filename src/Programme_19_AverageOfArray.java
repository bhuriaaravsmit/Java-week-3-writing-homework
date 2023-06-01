
/*
 * Write a Java program to calculate the average value of array
 */

import java.util.Arrays;

public class Programme_19_AverageOfArray {

    public static void main(String[] args) {

     //Array Declaration



     int [] numArray={1535,4589,5678,2563,479};

     int sum=0;

     //calculating the sum of arrays length

        for (int i=0;i<numArray.length;i++){

            sum=sum+numArray[i];


        }


        //finding the average of arrays value

        int average = sum / numArray.length;
        System.out.println("values of elements of the array are :" + Arrays.toString(numArray));
        System.out.println("Average of all the values of the array are :  " + average);

    }


}
