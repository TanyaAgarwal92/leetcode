// 14. Longest Common Prefix
// problem : Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string ""

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int words = strs.length;
        int len = Integer.MAX_VALUE;
        String res = "";
        int i , j;
        boolean mismatch = false;
        for ( String word : strs){
            if ( word != null && word.length() < len){
                len = word.length();
            }
        }
        if(len == Integer.MAX_VALUE){
            len = 0;
        }
        for ( i = 0; i < len; i++){
            char ch = strs[0].charAt(i);
            for ( j = 1; j < words; j++){
                if ( ch != strs[j].charAt(i)){
                    mismatch = true;
                    break;
                }
            }
            if( mismatch){
                break;
            }
        }
        res = len == 0 ? "" : strs[0].substring(0, i );
        return res;
    }
}
