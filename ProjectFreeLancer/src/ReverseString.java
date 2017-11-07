public class ReverseString {
    public static void main(String args[]) {
        String cole = "Project";
        char[] letters = cole.toCharArray();
        int i = 0;
        int j = letters.length - 1;
        while(i < j) {
          char last = letters[j];
          letters[j] = letters[i];
          letters[i] = last;
          i++;
          j--;
        }
        System.out.println(new String(letters));
    }
}
