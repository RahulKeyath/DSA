import java.util.Scanner;
//This is an optimized Java solution to find the greatest common divisor of two numbers.
//By Rahul Krishnan M


class Solution{                                                 
    public int gcd(int a, int b) {                              //function for finding gcd
       
        return (b==0) ? a : gcd(b,a%b); 
    }
} 
class GCD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);                   //Scanner class object created
        System.out.print("Input value 1: ");                 
        int input1 = in.nextInt();                              
        System.out.print("Input value 2: ");
        int input2 = in.nextInt();

        Solution sol = new Solution();
        System.out.println("The gcd of the two numbers is: "+sol.gcd(input1,input2)); //prints the gcd of two numbers
    }
}