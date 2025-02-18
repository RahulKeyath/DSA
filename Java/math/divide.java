class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        // Convert to long and get absolute values
        long a = Math.abs((long) dividend), b = Math.abs((long) divisor), res = 0;
        
        while (a >= b) {
            long temp = b, multiple = 1;
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            a -= temp;
            res += multiple;
        }

        // Apply sign and return result within 32-bit integer range
        return (dividend > 0) == (divisor > 0) ? (int) res : (int) -res;
    }
}
