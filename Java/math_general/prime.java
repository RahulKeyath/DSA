//Java solution to check whether a number is prime or not.


import java.util.Scanner;


//solution class to define the function "isprime".


class solution{
    public boolean isprime(int n){
        if (n==1) return false;                             //1 is neither prime nor composite
        if (n==2 || n==3) return true;                      //2 and 3 are prime numbers    
        if (n%2==0 || n%3==0) return false;                 //numbers divisible by 2 and 3 are excempted
        
        for (int i=5;i*i<=n;i=i+6){                         
            if ((n%i==0) || (n%(i+2)==0)){                  //checks if the number is divisible by other prime numbers
                return false;
            }
        }
        return true;                                        //finally returns true of noone of the conditions are flase.
    }
}




class prime{
    public static void main(String[] args){
        
        Scanner in = new Scanner((System.in));
        System.out.print("Input a number to check whether it is a prime or not: ");
        int digit = in.nextInt();
        
        solution s = new solution();
        boolean res = s.isprime(digit);
        System.out.print("The number is a prime: "+res); 
        

    }
}