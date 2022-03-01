package tridenicislicekuwunky;
public class TrideniCislicekUwunky {

    public static void main(String[] args) {
       int[] arr = { 14, 9, 11, 12, 1, 8, 3, 16, 18, 15, 7, 5, 2, 19, 4, 6, 17, 20, 10, 13 };
       
       
       
       for (int k = 0; k < arr.length; k++) {
          for( int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
             int x;
             x = arr[i];
             arr[i] = arr[i+1];
             arr[i+1] = x;
            }  
          }
       }
       for (int i : arr) {
           System.out.print(i + ", ");
       }
    }
    
}
