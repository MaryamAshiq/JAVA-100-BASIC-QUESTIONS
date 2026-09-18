public class Q44_EvenNumbers {
    public static void main(String [] args) {
        int N = 50;
        for (int i = 2; i <= N; i++ ) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}