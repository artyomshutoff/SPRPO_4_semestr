import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        ArrayList < String > palindromes = new ArrayList < String > ();
        ArrayList < String > words = new ArrayList < String > ();

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
            if (!(new String(eng_alphabet).contains(String.valueOf(c))) && word_start) {
                String word = text.substring(word_start_index, i).toLowerCase();
                word_start = false;
                if (!words.contains(text.substring(word_start_index, i).toLowerCase())) {
                    words.add(word);
                }
            } else if (new String(eng_alphabet).contains(String.valueOf(c)) && i == (text.length() - 1) && word_start) {
                String word = text.substring(word_start_index, i + 1).toLowerCase();
                word_start = false;
                if (!words.contains(text.substring(word_start_index, i + 1).toLowerCase())) {
                    words.add(word);
                }
            }
        }

        for (int i = 0; i < words.size(); i++) {
            String our_word = words.get(i);
            ArrayList < String > reversed_words = new ArrayList < > (words);
            reversed_words.remove(our_word);
            String reversed_word = "";
            for (int j = our_word.length() - 1; j > -1; j--) {
                reversed_word += our_word.charAt(j);
            }
            reversed_word = reversed_word.replaceFirst("^\\s*", "");
            if (reversed_words.contains(reversed_word) && !palindromes.contains(our_word) && !palindromes.contains(reversed_word)) {
                palindromes.add(our_word);
            }
        }

        for (int i = 0; i < palindromes.size(); i++) {
            String reversed_string = "";
            for (int j = palindromes.get(i).length() - 1; j > -1; j--) {
                reversed_string += palindromes.get(i).charAt(j);
            }
            System.out.print((i + 1) + " pair: " + palindromes.get(i) + " " + reversed_string + System.lineSeparator());
        }

        if (palindromes.size() == 0) {
            System.out.print("No palindromes");
        }

    }

}