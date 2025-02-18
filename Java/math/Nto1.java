//Java solution to print numbers from N to One.
import java.util.Scanner;

class printer{
    public void NtoOne(int n){

        if (n==0) return;
        System.out.print(n+" ");        
        NtoOne(n-1);                //prints from 1 to n.
    }
}


public class Nto1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input number: ");
        int input = sc.nextInt();

        printer x = new printer();
        x.NtoOne(input);

    }
}
