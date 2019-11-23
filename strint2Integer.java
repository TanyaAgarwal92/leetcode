// 8. String to Integer (atoi)

class Solution {
    public int myAtoi(String str) {
        if( str == null || str.length() == 0){
            return 0;
        }
        str = str.trim();
        int i = 0;
        double res = 0;
        int strLen = str.length();
        if( strLen == 0){
            return 0;
        }
        boolean positive = true;
        if( str.charAt(i) == '-'){
            positive = false;
            i++;
        }
        else if( str.charAt(i) == '+'){
            i++;
        }
        while( i < strLen && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            res = res* 10 + (str.charAt(i) - '0');
            i++;
        }
        if(!positive){
            res = res * -1;
        }
        if( res > Integer.MAX_VALUE){
            res = Integer.MAX_VALUE;
        }
        if( res < Integer.MIN_VALUE){
            res = Integer.MIN_VALUE;
        }
        return (int)res;
    }
}
