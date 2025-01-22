//This is a naive solution to find the lowest common multiple of two numbers
//This solution uses the concept of Eucleid's algorithm to find LCM.
//By Rahul Krishnan M


import java.util.Scanner;
import java.lang.Math;

public class LCM_Naive {          
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        
        int res = Math.max(num1,num2);

        while (true){
            if (res%num2 == 0 && res%num1==0){
                System.out.println("The LCM of "+num1+" and "+num2+" is: "+res);        
                break;
            }
            res++;
        }
    }
}
