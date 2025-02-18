import java.util.Scanner;

class solution{
    public boolean prime(int n){
        if (n==1) {
            return false;
        }
        for (int i=2;i<n;i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}

public class checkprime {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int digit = sc.nextInt();
    solution s = new solution();
    boolean res=s.prime(digit);
    System.out.println(res);
    }
}
