import java.util.Scanner;
public class MultiClassGPA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float[][] classes = new float[3][3];
        float superAverage = 0;
        for (int i = 0; i < classes.length; i++) {
            for (int j = 0; j < classes[i].length; j++) {
                System.out.print("Please input student " + (j + 1) + " test result: ");
                classes[i][j] = sc.nextFloat();
                System.out.println();
            }
            float classAverage = average(classes[i]);
            String gradeSimple = String.format("%.1f", classAverage);
            System.out.println("The class average is: " +  gradeSimple);
            superAverage += Float.parseFloat(gradeSimple);

        }
        System.out.println("The grade's average is " + superAverage / 3);
    }

    public static float average(float[] scores){
        float sum = 0;
        int i = 0;
        while (i < scores.length) {
            sum += scores[i];
            i++;
        }
        return sum / i;
    }
}
