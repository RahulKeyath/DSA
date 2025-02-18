//This is a Java solution to find the number of digits in a given number.

import java.util.Scanner;

class solution{                             
    public int count(int n){            //defining function count that counts number of digits.
        int res = 0;
        while (n>0){
            n /= 10;
            res += 1;
        }
        return res;
    }
}

public class countdigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter digit: ");
        int digit = in.nextInt();

        solution s = new solution();
        
        System.out.print("The number of digits are: "+s.count(digit));
    }
}