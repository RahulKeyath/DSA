//A java solution to check if a number entered is palindrome or not.

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a number to check palindrome: ");
        int digit = input.nextInt();
        int reversed = 0;
        int original = digit;

        while (digit>0){
            reversed = reversed * 10 + digit % 10;
            digit = digit/10;
        }
        if (original == reversed){
            System.out.println("The number is a palindrome! ");
        }
        else{
            System.out.println("The number is not a palindrome! ");
        }
    }
}
