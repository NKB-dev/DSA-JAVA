//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//        Increment the large integer by one and return the resulting array of digits.
//
//
//
//        Example 1:
//
//        Input: digits = [1,2,3]
//        Output: [1,2,4]

import java.util.Arrays;
public class PLUSoNE {
    public static void main(String[] args) {
        int[] arr ={9,9,9};
       int[]ans= plusOne(arr);
        System.out.println(Arrays.toString(ans));

    }

        public static int[] plusOne(int[] digits) {
            int n = digits.length;

            // Traverse the array from the end to handle the carry
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++; // Add 1 if the current digit is less than 9
                    return digits;
                }
                digits[i] = 0; // If the digit is 9, set it to 0 and continue the loop
            }

            // If all digits were 9, we need to add a new digit at the start
            int[] result = new int[n + 1];
            result[0] = 1; // Set the first digit to 1, rest will be 0 by default
            return result;
        }
    }



