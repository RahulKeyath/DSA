package Math_qns;
public class palindrome {

    //This is a leetcode solution to check if an input number is a palindorme or not 
    //(Solved by Rahul Krishnan M).

class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int org = x;                 //copy the value to compare later

        while (x>0){                 //accept only positive numbers (negative numbers not considered palindrome due to minus sign) 
            if ( rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return false;
            }                        //eliminate overflow and underflow
            rev = rev * 10 + x % 10; //code to store each digit in reverse after every loop
            x /= 10;
        }
        if (rev == org){
            return true;
        }
        else{
            return false;
        }
    }
}
}