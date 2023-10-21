import java.util.Stack;
public class XO {
  
  public static boolean getXO (String str) {
    
    // Good Luck!!
    str = str.toLowerCase();
    Stack<Character> pila = new Stack<Character>();
    char []word = str.toCharArray();
    for(int i = 0; i < str.length(); i++){
      if(word[i] == 'o'){
        pila.push(word[i]);
      }
    }
    for(int i = 0; i < str.length(); i++){
      if(word[i] == 'x'){
        if(!pila.empty())
          pila.pop();
        else 
          return false;
      }
    }
    if(!pila.empty()) return false;
	  return true;
  }
}
