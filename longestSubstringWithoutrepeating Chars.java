//3. Longest Substring Without Repeating Characters
//problem : Given a string, find the length of the longest substring without repeating characters.

public int longestSub(String s){
  if( s == null || s.length() == 0){
    return 0;
  }
  int sLen = s.length();
  boolean[] seen = new boolean[256];
  int result = 1;
  int start = 0;
  for ( int i = 0; i < sLen; ; i++ ){
    char ch = s.charAt(i);
    if( seen[(int)ch] == false){
      seen[(int)ch] = true;
    } else{
      result = Math.max( result, i - start);
      for ( int j = start; j < i; j++){
        if(ch == s.charAt(j)){
          start = j+1;
          break;
        }
        seen[(int)s.charAt(j)] = false;
      }
    }
  }
  result = Math.max( result, sLen - start);
  return result;
  }
