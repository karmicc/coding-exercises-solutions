import java.util.*;
import java.util.stream.Collectors;
public class WeightSort {
	
	public static String orderWeight(String str) {
    String[] strArray = str.split(" ");
    List<String> strList = new ArrayList<>();
    List<String> bucket = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < strArray.length; i++) {
       map.put(i, weight(strArray[i]));
    }


    Map<Integer, Integer> mapaOrdenado = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (e1, e2) -> e1,
                    LinkedHashMap::new
            ));

    int lastIndex = -1;
    int lastWeight = 0;
    boolean freeze = false;
    for (Integer index: mapaOrdenado.keySet()) {
        String last;
        String current = strArray[index];
        if (strList.isEmpty()) {
            strList.add(current);
        } else {
            last = strList.get(strList.size() - 1);
            if (weight(current) == lastWeight) {
                if (bucket.isEmpty()) {
                    bucket.add(last);
                    bucket.add(current);
                    freeze = true;
                } else {
                    bucket.add(current);
                }
                Collections.sort(bucket);
            } else {
                if (!bucket.isEmpty()) {
                    strList.remove(lastIndex);
                    strList.addAll(lastIndex, bucket);
                    lastIndex +=  bucket.size() -1;
                    bucket.clear();
                    freeze = false;
                }
                strList.add(current);
            }
        }
        lastWeight = weight(current);
        if (!freeze) lastIndex++;
    }    
    if (!bucket.isEmpty()) {
        strList.remove(lastIndex);
        strList.addAll(lastIndex, bucket);
        bucket.clear();
    }

    return strList.toString().replace(", ", " ").replace("[", "").replace("]", "");
  }
  
  public static int weight(String cadena) {
        int suma = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (Character.isDigit(caracter)) {
                int digito = Character.getNumericValue(caracter);
                suma += digito;
            }
        }

        return suma;
    }
}
