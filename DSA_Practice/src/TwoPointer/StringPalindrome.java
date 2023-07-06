package TwoPointer;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "bababbd";

        int i = 0, j = str.length() - 1;

        while (true) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("It is not an palindrome");
                System.exit(0);
            } else {
                i++;
                j--;
                System.out.println("It is an palindrome");
            }
        }
    }
}
