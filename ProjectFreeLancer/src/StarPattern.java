public class StarPattern {
    public static void main(String args[]) {
        String star = "*";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(star);

            }
            System.out.println();
        }
    }
}
