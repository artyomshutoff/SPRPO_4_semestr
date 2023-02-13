import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        ArrayList<String> palindromes = new ArrayList<String>();
        ArrayList<String> words = new ArrayList<String>();

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

            if ((!(new String(eng_alphabet).contains(String.valueOf(c))) ||
                    (new String(eng_alphabet).contains(String.valueOf(c)) && i == text.length() - 1))
                    && word_start) {
                word_start = false;
                if (!words.contains(text.substring(word_start_index, i + 1).toLowerCase())) {
                    words.add(text.substring(word_start_index, i + 1).toLowerCase());
                }
            }
        }

        for (int i = 0; i < words.size(); i++) {
            ArrayList<String> reversed_words = words;
            reversed_words.remove(words.get(i));
            String reversed_string = "";
            for (int j = words.size() - 1; j > - 1; j++) {
                reversed_string += words.get(j);
            }
            if (reversed_words.contains(words.get(i))) {
                palindromes.add(words.get(i));
            }
        }

        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i));
        }

    }

}
