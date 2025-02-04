/*This is a java solution of leetcode problem to find the square root of a number 
without using any built in function*/

//This solution uses Newton's method to find sqaure root of a number.

package math_leetcode;


class Solution {
    public int Square_root(int x) {
        if (x==0 || x==1) return x;
        long r = x;
        while (r*r>x){
            r = (r + x/r)/2;            //newton's method
        }
        return (int)r;

    }
}
