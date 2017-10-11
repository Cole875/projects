import java.util.Scanner;
public class GPA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float[] grades = new float[3];
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Please input student " +  (i + 1) + " test result: ");
            grades[i] = sc.nextFloat();
            System.out.println();
        }
        float classAverage = average(grades);
        System.out.println("The average is: " + classAverage);
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
