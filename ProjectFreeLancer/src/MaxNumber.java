import static java.lang.Math.random;
public class MaxNumber {
    public static void main(String args[]) {
        int randNum = (int)(Math.random() * 1000 + 1);
        int[] numbers = new int[randNum];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 500 + 1);
            System.out.println(numbers[i]);
        }

        int max = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum number is " + max);
    }
}
