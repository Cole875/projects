import java.util.Scanner;
public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number and I will provide it's factorial");
        long num = sc.nextLong();
        long factorial = factorial(num);
        System.out.println(factorial);
    }

    public static long factorial(long num) {
        long result = 1;
        while (num > 0) {
            //result = result * num
            result *= num;
            num -= 1;
        }
        return result;
    }
}