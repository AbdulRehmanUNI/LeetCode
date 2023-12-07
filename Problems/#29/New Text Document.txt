class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0) return Integer.MAX_VALUE;
        if(divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1, result = 0;
        long ldividend = Math.abs((long) dividend), ldivisor = Math.abs((long) divisor);
        while(ldividend >= ldivisor){
            long temp = ldivisor, multiple = 1;
            while(ldividend >= (temp << 1)){
                temp <<= 1;
                multiple <<= 1;
            }
            ldividend -= temp;
            result += multiple;
        }
        return sign == 1 ? result : -result;
    }
}

// class Solution {
// public int divide(int dividend, int divisor) {
//     // Handle special cases
//     if(divisor == 0) return Integer.MAX_VALUE;
//     if(divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;

//     // Determine the sign of the result
//     int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

//     // Convert both numbers to positive
//     long ldividend = Math.abs((long) dividend);
//     long ldivisor = Math.abs((long) divisor);

//     // Initialize the result
//     int result = 0;

//     // While the dividend is greater than or equal to the divisor
//     while(ldividend >= ldivisor){
//         // Initialize a temporary divisor and a count
//         long temp = ldivisor, multiple = 1;
//         while(ldividend >= (temp << 1)){
//             temp <<= 1;
//             multiple <<= 1;
//         }
//         // Subtract the last temporary divisor from the dividend
//         ldividend -= temp;
//         // Add the last count to the result
//         result += multiple;
//     }

//     return sign == 1 ? result : -result;
// }
// }



// GitHub Copilot
// Sure, let's take an example to understand this better. Let's say we want to divide 43 by 8 using this method.

// Both numbers are positive, so the sign of the result will be positive.

// We start with ldividend = 43 and ldivisor = 8. result is initialized to 0.

// We enter the outer loop because ldividend (43) is greater than ldivisor (8).

// We initialize temp = 8 and multiple = 1.

// We enter the inner loop because ldividend (43) is greater than temp << 1 (16). We double temp and multiple, so now temp = 16 and multiple = 2.

// We continue to the next iteration of the inner loop because ldividend (43) is still greater than temp << 1 (32). We double temp and multiple again, so now temp = 32 and multiple = 4.

// Now, ldividend (43) is less than temp << 1 (64), so we exit the inner loop.

// We subtract temp (32) from ldividend and add multiple (4) to result. Now ldividend = 11 and result = 4.

// We go back to the outer loop. Since ldividend (11) is still greater than ldivisor (8), we repeat the process. This time, temp and multiple can only be doubled once before temp becomes greater than ldividend. So we subtract temp (8) from ldividend and add multiple (1) to result. Now ldividend = 3 and result = 5.

// Now, ldividend (3) is less than ldivisor (8), so we exit the outer loop.

// The sign of the result is positive, so we return result (5) as is.

// So, 43 divided by 8 is 5, which matches our result. The remainder is ldividend (3), which is left over after all possible multiples of the divisor have been subtracted from the dividend.