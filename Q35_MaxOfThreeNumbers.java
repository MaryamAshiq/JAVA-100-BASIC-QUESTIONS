public class Q35_MaxOfThreeNumbers {
    public static int maxofthree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int c = 15;
            int result = maxofthree(a, b, c);
            System.out.println("Result: " + result);
        }
    }

