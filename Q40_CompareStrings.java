public class Q40_CompareStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult < 0) {
            System.out.println("str1 is lexicographically less than str2");
        } else if (comparisonResult > 0) {
            System.out.println("str1 is lexicographically greater than str2");
        } else {
            System.out.println("str1 is equal to str2");
        }
    }
}
