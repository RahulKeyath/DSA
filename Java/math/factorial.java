import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Input a number to find it's factorial: ");
        int digit = input.nextInt();

        int result = 1;
        for (int i=1; i<=digit; i++){
            result = result * i;
        }
        System.out.println("The factorial of the number is: "+result);

    }
}