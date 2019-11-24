//5. Longest Palindromic Substring
// Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

class Solution {
    public String longestPalindrome(String s){
        if ( s == null || s.length() == 0){
            return "";
        }
        int maxLen = 1;
        int start = 0;
        int sLen = s.length(); int low, high;
        String res = "";
        for ( int i = 1; i < sLen; i++){
            //for even length plaindromes- 
            low = i - 1;
            high = i; 
            while (low >= 0 && high < sLen && s.charAt(low) == s.charAt(high)){
                if ( high - low + 1 > maxLen){
                    maxLen = high - low + 1;
                    start = low;
                }
                low--;
                high++;
            }
            //for odd length palindromes- 
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < sLen && s.charAt(low) == s.charAt(high)){
                if ( high - low + 1 > maxLen){
                    maxLen = high - low + 1;
                    start = low;
                }
                low--;
                high++;
            }  
        }
        res = s.substring(start, start + maxLen);
        return res;
    }
    //Accepted solution - space complexity high
    /* public String longestPalindrome(String s) {
        if ( s == null ){
            return "";
        }
        int s_len = s.length();
        boolean pal[][] = new boolean[s_len][s_len];
        int i, j, k, max_len = Integer.MIN_VALUE;
        String res = "";
        //for length = 1
        for ( i = 0; i < s_len; i++){
            pal[i][i] = true;
        }
        //for length = 2
        for ( i = 0; i < s_len-1; i++){
            pal[i][i+1] = (s.charAt(i) == s.charAt(i+1)) ? true : false;
        }
        //for length >= 3
        for (k = 3; k <= s_len; k++){
            for ( i = 0; i < s_len - k + 1; i++){
                j = i + k -1;
                if ( pal[i+1][j-1] == true && s.charAt(i) == s.charAt(j)){
                    pal[i][j] = true;
                }
            }
        } 
        for ( i = 0; i < s_len; i++){
            for ( j = i; j < s_len ; j++){
                if (pal[i][j] == true){
                    if ( (j-i+1) > max_len){
                        max_len = (j-i+1);
                        res = s.substring(i, j+1);
                    }
                }
            }
        }
        return res;
    }*/
}
