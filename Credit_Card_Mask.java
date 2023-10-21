public class Maskify {
  public static String maskify(String str) {
    char[] STR = str.toCharArray();
        if(str.length()>4){
          for (int n = 0; n<str.length (); n++) { 
            if(n<str.length() - 4){
              STR[n]='#';
            }
          }
          return String.valueOf(STR);
        }
    return str;
    }
}
