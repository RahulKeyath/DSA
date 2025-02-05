//This is a Java program to find the binary equivalent of a number using recursive function.

import java.util.Scanner;


//Defining class that contain conversion function
class Conversion{
   public void conversion(int n){
        if (n == 0) return;
        conversion(n / 2);                      //Recursively calling the function after dividing input by 2
        System.out.print(n % 2);                //Printing the remainder after each division.
    }
}

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input a n umber to find its binary: ");
        int input = s.nextInt();

        Conversion x = new Conversion();

        System.out.print("The binary equivalent of the number entered is: ");
        x.conversion(input);
    }
}