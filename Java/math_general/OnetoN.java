//Java program to print numbers from 1 to N using recursion.


import java.util.Scanner;

class printer{
    public void NtoOne(int n){
        if (n==0) return;
        NtoOne(n-1);                //Recursive call N is printed
        System.out.print(n+" ");
    }
}


public class OnetoN {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Input number: ");
    int input = sc.nextInt();

    printer p = new printer();
    p.NtoOne(input);
    

    }  
}
