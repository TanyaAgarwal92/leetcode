//6. ZigZag Conversion

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

class Solution {
    public String convert(String s, int numRows) {
        if ( numRows <= 1){
            return s;
        }
        StringBuilder[] words = new StringBuilder[numRows];
        StringBuilder res = new StringBuilder("");
        int sLen = s.length();
        int counter = 0;
        boolean toggle = false;
        for ( int i = 0; i < numRows; i++){
            words[i] = new StringBuilder("");
        }
        for ( int i = 0; i < sLen; i++){
            char ch = s.charAt(i);
            if( counter < numRows && !toggle){
                words[counter].append(ch);
                counter++;
            }
            else{
                if(counter == numRows){
                    counter -= 2;
                    toggle = true;
                }else{
                    counter--;
                }
                if( counter >= 0){
                    words[counter].append(ch);
                }
                if( counter == 0){
                    toggle = false;
                    counter++;
                }
            }
        }
        for ( int i = 0; i < numRows; i++){
            res.append(words[i]);
        }
        return res.toString();
    }
}
