class Solution{
    public static String removeDuplicateWords(String s){
        // Your code here, good sir.
      String[] remove = s.split(String.valueOf(' '));
        StringBuilder result = new StringBuilder();
        for (String word : remove) {
            if (!word.equals("")){
                result.append(word);
                result.append(" ");
            }
            for (int j = 0; j < remove.length; j++) {
                if (remove[j].equals(word)) {
                    remove[j] = "";
                }
            }
        }
        result.reverse().deleteCharAt(0);
        return result.reverse().toString();
    }
}
