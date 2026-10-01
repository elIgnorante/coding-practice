class Solution {
/**
* URL of the Solution: https://leetcode.com/problems/reverse-degree-of-a-string/solutions/8549445/3498-reverse-degree-of-a-string-by-zeltr-ozqh
*
**/
    public static int getValue(char c) {

        // This is an example in the case where we have no guarantee of what the string s contains
        /**char cUpperCase = Character.toUpperCase(c);
        if (cUpperCase < 'A' || cUpperCase > 'Z') { return -1; }
        return (27 - (cUpperCase - 'A' + 1));
        **/

        return (27 - (c - 'a' + 1));
    }

    public int reverseDegree(String s) {
        int output = 0;

        for (int i = 0; i < s.length(); i++) {
            int valueOfc = getValue(s.charAt(i));

            output += (valueOfc * (i+1));
        }

        return output;
    }
}
