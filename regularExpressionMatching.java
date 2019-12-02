// 10. Regular Expression Matching
// Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.

// '.' Matches any single character.
// '*' Matches zero or more of the preceding element.

class Solution {
    public boolean isMatch(String s, String p) {
    if( p == null || s == null){
      return false;
    }
    int sLen = s.length();
    int pLen = p.length();
    boolean map[][] = new boolean[sLen + 1][pLen + 1];
    int i, j;
    map[0][0] = true;
    for ( i = 1; i < pLen+1; i++){
      if( p.charAt(i-1) == '*'){
        map[0][i] = (i-2 >= 0) ? map[0][i-2] : false;
      }
    }
    for ( i = 1; i < sLen + 1; i++){
      for ( j = 1; j < pLen + 1; j++){
        if ( s.charAt(i-1) == p.charAt(j-1) || p.charAt(i-1) == '.'){
          map[i][j] = map[i-1][j-1];
        }
        else if ( p.charAt(j-1) == '*'){
          map[i][j] = (j-2 >= 0) ? map[i-1][j-2] : false;
          if( j-2 >= 0 && (p.charAt(j-2) == '.' || s.charAt(i-1) == p.charAt(j-2))){
            map[i][j] = map[i][j] | map[i-1][j];
          }
        }
        else{
          map[i][j] = false;
        }
      }
    }  
    
    return map[sLen][pLen];
    }
}    
