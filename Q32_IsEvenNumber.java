public class Q32_IsEvenNumber {
    public static int isEven(int number) {
        return number % 2 == 0 ? 1 : 0;
    }
    public static void main(String[] args) {
        int num = 10;
        int result = isEven(num);
        System.out.println("Is " + num + " even? " + (result == 1 ? "Yes" : "No"));
    }

}
