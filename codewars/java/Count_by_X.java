public class Kata{
  
  private static int[] firstMultibles(int n, int x) {
    int[] result = new int[n];
    
    for(int i = 0; i < n; i++) {
      result[i] = x * (i+1);
    }
    
    return result;
  }
  public static int[] countBy(int x, int n){
    
    return firstMultibles(n, x);
  }
}
