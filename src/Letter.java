import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Letter extends Thread{

    String string;

    public Letter(String string) {
        this.string = string;
    }

    @Override
    public void run() {
        int numberOfLetters = 0;

        // Данное регулярное выражение ищет все буквы
        Pattern pattern = Pattern.compile("[A-Za-z]");

        // Matcher ищет совпадение шаблона регулярного выражения с текстом строки
        Matcher matcher = pattern.matcher(this.string);

        while (matcher.find()) {
            numberOfLetters++;
        }
        System.out.println("Number of letters in the file is - " + numberOfLetters);
    }
}
