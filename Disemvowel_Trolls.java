public class Troll {
    public static String disemvowel(String str) {
        // Code away...
      String cadenaCons = str.replaceAll("[eaiouAEIOU]", "");
      System.out.println(cadenaCons);
      return cadenaCons;
    }
}
