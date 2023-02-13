import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        System.out.print("Enter k: ");
        int k = scan.nextInt();
        System.out.print("Enter character: ");
        String ch = scan.next();

        char[] eng_alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] rus_alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();

        boolean word_start = false;
        int word_start_index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.toLowerCase().charAt(i);
            if (new String(eng_alphabet).contains(String.valueOf(c)) && !word_start) {
                word_start_index = i;
                word_start = true;
            }

            if ((!(new String(eng_alphabet).contains(String.valueOf(c))) || (i + 1) == text.length()) && word_start) {
                if ((i - word_start_index) > (k - 1)) {
                    text = text.substring(0, word_start_index + k - 1) + ch + text.substring(word_start_index + k);
                }
                word_start = false;
            }
        }

        System.out.print(text);
    }

}
