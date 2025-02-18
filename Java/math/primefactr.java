//This is a java solution to find the prime factors of a number.

import java.util.Scanner;

//Defined below is the solution class that contains the user-defined function "factors" that returns prime_factors of a number.
class solution{
    public void factors(int n){
        if (n<=1) return;                           //checks if the number is less than 1.
        while (n%2==0){                             //checks if the number is divisible by 2 and prints 2 until over.
            System.out.print(2+" ");
            n/=2;
        }
        while (n%3==0){
            System.out.print(3+" ");                //checks if the number is divisible by 3 and prints 3 until over.
            n/=3;
        }
        for (int i=5;i*i<=n;i+=6){                  //checks if the number is divisible by other prime numbers and prints them until over.
            while (n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
            while (n%(i+2)==0){
                System.out.print((i+2)+" ");
                n/=(i+2);
            }
        }
        if (n>3) System.out.print(n);                // finally returns the remaining number if it is greater than 3.
    }
}


public class primefactr {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int number = in.nextInt();

        solution s = new solution();
        s.factors(number);
        in.close();
    }
}
