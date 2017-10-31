import javax.print.DocFlavor;
import java.io.File;
import java.util.Scanner;

public class CountVowels {
    public static void main (String args[]) {
        String vowels = "T";
        Scanner sc = null;
        int count = 0;
        try {
            sc = new Scanner(new File("Tarzan.txt"));
        }
        catch (Exception e) {
            System.out.println("Computer has failed to read Tarzan");
            System.exit(1);
        }
        //sc.
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            for (int i = 0; i < line.length(); i++){
                String testedCharacter = line.charAt(i) + "";
                if (vowels.contains(testedCharacter)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
