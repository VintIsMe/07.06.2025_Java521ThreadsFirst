import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word extends Thread{

    String string;

    public Word(String string) {
        this.string = string;
    }

    @Override
    public void run() {
        int numberOfWords = 0;

        // Регулярное выражение для поиска пробелов между словами строки
        // \s - сколько угодно пробелов, в скобках то, что может идти после пробелов и опять пробелы
        Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");

        // Matcher ищет совпадение шаблона регулярного выражения с текстом строки
        Matcher matcher = pattern.matcher(this.string);

        while (matcher.find()) {
            numberOfWords++;
        }
        // Цифры будут засчитаны за слова
        System.out.println("Number of words in the file is - " + numberOfWords);
    }
}
