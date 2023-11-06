import java.util.Scanner;

public class CodeSoft_Word_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or Sentence: ");
        String Phrase = sc.nextLine();

        int Word_Count = countWords(Phrase);

        System.out.println("Word count: " + Word_Count);

        sc.close();
    }
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+"); // Split the text using whitespace as the delimiter
        return words.length;
    }
}
