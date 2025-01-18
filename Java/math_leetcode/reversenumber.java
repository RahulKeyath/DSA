//This is a leetcode solution to check if an input number is a palindorme or not 
//(Solved by Rahul Krishnan M).
package math_leetcode;

class Solution {
    public int reversenumber(int x) {                             
        int reverse = 0;

        while (x!=0){
            if (reverse > Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10){                                                                                                         //prevernts underflow and overflow.        
                return 0;
            }
            reverse = reverse * 10 + x % 10;                    //code to insert digits one by one to the variable after executing each loop.
            x=x/10;
        }
        return reverse;                                         //returns the final answer after revesing.
    }
}