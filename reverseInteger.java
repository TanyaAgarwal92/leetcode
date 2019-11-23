//7. reverse an integer
//Given a 32-bit signed integer, reverse digits of an integer.

class Solution {
    public int reverse(int x) {
        if ( x == 0 ){
            return 0;
        }
        boolean negative = false;
        if ( x < 0){
            negative = true;
            x = Math.abs(x);
        }
        int res = 0, prev_num = 0;
        while ( x > 0){
            int rem = x % 10;
            res = res * 10 + rem;
            if ( prev_num != (res - rem)/10 ){
                return 0;
            }
            prev_num = res;
            x = x /10;
        }
        if (negative == true){
            res *= -1;
        }
        return res;
        
    }
}
