import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]) {
        System.out.println("Enter a word and I will tell you if it is a Palindrome");
        Scanner scanner = new Scanner(System.in);
        String palin = scanner.next();
        char[] a = palin.toLowerCase().toCharArray();
        int i = 0;
        int j = a.length - 1;
        while(i < j) {
            if (a[i] != a[j]) {
                System.out.println("Not a Palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("It is a Palindrome");
    }
}
