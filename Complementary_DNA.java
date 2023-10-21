public class DnaStrand {
  public static String makeComplement(String dna) {
    char[] DNA = dna.toCharArray();
    for (int n = 0; n<dna.length (); n++) { 
      switch(DNA[n]){
          case 'A': DNA[n]='T'; break;
          case 'T': DNA[n]='A'; break;
          case 'G': DNA[n]='C'; break;
          case 'C': DNA[n]='G'; break;
      }
    }
    return String.valueOf(DNA);
  }
}
