//This is a java solution to print the sum of n natural numbers using recursion.


import java.util.Scanner;

class Solution {
    public int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
}

public class sumofn {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        scanner.close();  // Closing the scanner

        Solution s = new Solution();
        System.out.println("Sum of first " + input + " natural numbers: " + s.sum(input));
    }
}