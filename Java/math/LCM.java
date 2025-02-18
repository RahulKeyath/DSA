import java.util.Scanner;
//This is an optimized Java solution to find the Lowest common multiple of two numbers.
//By rahulKrishnan M
    
class solution{                                                 //defining solution class
    public int gcd(int a, int b){
        return b==0 ? a : gcd(b , a%b);                         //To find gcd of teo numbers.
    }
}

public class LCM{                                                    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        System.out.print("Input number 1: ");
        int a1 = in.nextInt();                             
        
        System.out.print("Input number 2: ");
        int b1 = in.nextInt();
        
        solution s = new solution();
        
        int lcm = (a1*b1)/s.gcd(a1,b1);             //Based on the theory: product of two numbers equals to product of their lcm and hcf.
        System.out.println("The lowest common multiple of "+a1+" and "+b1+" is: "+lcm);
    }
}