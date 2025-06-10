import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowel extends Thread{

    String string;

    public Vowel(String string) {
        this.string = string;
    }

    @Override
    public void run() {
        int numberOfVowels = 0;

        // Данное регулярное выражение ищет все буквы
        Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);

        // Matcher ищет совпадение шаблона регулярного выражения с текстом строки
        Matcher matcher = pattern.matcher(this.string);

        while (matcher.find()) {
            numberOfVowels++;
        }
        System.out.println("Number of vowels in the file is - " + numberOfVowels);
    }
}
