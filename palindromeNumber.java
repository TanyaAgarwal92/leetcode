//9. Palindrome Number

// Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

class Solution {
    public boolean isPalindrome(int x) {
        if ( x < 0){
            return false;
        }
        int orig2 = x;
        int power = 0;
        while ( orig2 > 0){
            power++;
            orig2 = orig2/10;
        }
        orig2 = x;
        while( x > 0 && orig2 > 0){
            int rem = x % 10;
            int num =  (int)(orig2 / (Math.pow(10,power-1)));
            if ( num != rem){
                return false;
            }
            x = x/10;
            orig2 -= num * (Math.pow(10,power-1));
            power--;
        }
        return true;
    }
}
