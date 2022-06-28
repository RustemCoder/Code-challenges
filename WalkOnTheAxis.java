public class MyClass {
    public static void main(String args[]) {
        int n =1;
        System.out.println(turnOffLights(n));
    }
    
  public static int  turnOffLights(int N){
      int start = 0;
      int end = N;
      int sum = 0;
      while(end-start>0){
          
          sum+=end-start;
          end--;
          sum+=end-start;
          start++;
          
          
      }
      return sum+N;
  }
  
  
}
