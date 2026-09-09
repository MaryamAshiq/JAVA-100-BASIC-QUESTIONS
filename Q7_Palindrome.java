public class Q7_Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversedStr = "";
        for (int i = str.length() -1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        if (str.equals(reversedStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
