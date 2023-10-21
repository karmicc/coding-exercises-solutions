public class Greed{
  public static int greedy(int[] dice){
    int greedy = 0;
    
    int[] counts = new int[7]; // Un arreglo para contar la frecuencia de cada número

    for (int d : dice) {
        counts[d]++;
    }
    
    // Itera a través del mapa para obtener claves y valores
    for (int i = 1 ; i < 7 ; i++) {
      int number = i;
      int frequency = counts[i];
      greedy += rules(number, frequency);
    }
    
    return greedy;
  }
  
  public static int rules(int number, int frequency){
    if (number == 1 && frequency == 1) return 100;
    if (number == 5 && frequency == 1) return 50;
    
    if (number == 1 && frequency >= 3) {
       return 1000 + rules(number, frequency%3);
    } else if(number == 1) {
      return (frequency % 3) * 100;
    }
    
    if (number == 5 && frequency >= 3) {
       return 500 + rules(number, frequency%3);
    } else if(number == 5) {
      return (frequency % 3) * 50;
    }
    
    if (number == 6 && frequency >= 3) {
       return 600 + rules(number, frequency%3);
    }
    
    if (number == 5 && frequency >= 3) {
       return 500 + rules(number, frequency%3);
    }
    
    if (number == 4 && frequency >= 3) {
       return 400 + rules(number, frequency%3);
    }
    
    if (number == 3 && frequency >= 3) {
       return 300 + rules(number, frequency%3);
    }
    
    if (number == 2 && frequency >= 3) {
       return 200 + rules(number, frequency%3);
    }
    
    return 0;
  }
}
