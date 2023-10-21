import java.lang.Math;
public class NthSeries {
	
	public static String seriesSum(int n) {
		// Happy Coding ^_^	
    double d = 0;
    double num = 1, denom = 1;
    for(int i = 0; i < n; i++, denom+=3){
      d += num / denom;
    }
    int r = (int) Math.round(d*100);
    double f = r / 100.0;
    return String.format("%.2f",f);//String.valueOf(f);
	}
}
