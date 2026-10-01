class Solution {
/**
  * URLs: 
  * https://leetcode.com/problems/separate-the-digits-in-an-array/submissions/2159600667
  * https://leetcode.com/problems/separate-the-digits-in-an-array/solutions/8550993/code-testcase-testcase-test-result-2553-jul24
**/
    public int[] separateDigits(int[] nums) {
        int numberOfDigits = 0;
        
        for(int num : nums) {
            // Calculate the number of digits
            if ( num == 0) { numberOfDigits += 1; } else {
                numberOfDigits += (int) Math.log10(Math.abs(num)) + 1;
            }
        }
        // initialize the Array
        int[] arrayNums = new int[numberOfDigits];
        int index = 0;

    
        for (int num : nums) {
            String strNum = Integer.toString(num);
            for (int i = 0; i < strNum.length(); i++) {
                arrayNums[index++] = strNum.charAt(i) - '0';
            }
        }

        return arrayNums;
    }
}
