public class Q34_EvenMethod {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args){
        int num = 10;
        boolean result = isEven(num);
        System.out.println("Result = " + result);
    }
}
