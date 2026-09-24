import java.util.ArrayList;
import java.util.Collections;
class Solution {
    private static int sumOfDigits(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private static int returnSmallestIndex(ArrayList<Integer> indexs){
        return Collections.min(indexs);
    }

    public int smallestIndex(int[] nums) {
        ArrayList<Integer> validadedIndexs = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if (i == sumOfDigits(nums[i])) {
                validadedIndexs.add(i);
            }
        }

        if (validadedIndexs.size() == 0){
            return -1;
        } else {
            return returnSmallestIndex(validadedIndexs);
        }
    }
}
