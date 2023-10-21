import  java.util.*;
public class DuplicateEncoder {
	static String encode(String word){
    word = word.toLowerCase();
    char[] STR = word.toCharArray();
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (int n = 0; n < word.length(); n++) {
      char c = word.charAt (n);
      if(map.containsKey(c)){
        map.put(c,map.get(c)+1);
      }else{
        map.put(c,1);
      }
    }
    for (int n = 0; n < word.length(); n++) {
      char c = word.charAt (n);
      if(map.containsKey(c)){
        if(map.get(c) > 1){
          STR[n] = ')';
        }else{
          STR[n] = '(';
        }
      }
    }
    return String.valueOf(STR);
  }
}
