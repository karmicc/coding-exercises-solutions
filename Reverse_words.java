public class Kata
{
  public static String reverseWords(final String original)
  {
    // Have at it
    String[] parts = original.split(" ");
    if(parts.length == 0) return original;
    int size = parts.length;
    int count = 1;
    StringBuilder output = new StringBuilder();
    String reverse="";
    for (String s : parts){
      char []word = s.toCharArray();
      for (int i = s.length() - 1; i >= 0; i--){
        output.append(word[i]);
      }
      if(count < size)
        output.append(" ");
      count++;
    }
    return output.toString();
  }
}
