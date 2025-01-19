package math_leetcode;

class Solution {
    public int trailingZeroes(int n) {
    //This is a leetcode solution to find the number of trailing zeroes in the factorial of a number.
    //(Solved by Rahul Krishnan M).

        int res = 0;            
        while (n > 0) {
            n /= 5;         //identifying the number of multiples of 5 in n.
            res += n;
        }
        return res;         //return result
    }
}
