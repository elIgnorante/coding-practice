class Solution { 
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if( c == '(') {
                depth++;
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            } else if ( c == ')') {
                depth--;
            }
        }

        return maxDepth;
        
    }
}

// URL of the solucion: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/submissions/2157618762
