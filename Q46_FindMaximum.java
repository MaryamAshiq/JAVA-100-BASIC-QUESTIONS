public class Q46_FindMaximum {
     public static void main(String[] args) {
     int [] num = new int[] {6, 5, 9, 1};
     int max = num[0];
     for (int i = 1 ; i < num.length; i++) {
     if ( num[i] > max ) {
          max = num[i];
       }
     }
       System.out.println(max);
   }
}

