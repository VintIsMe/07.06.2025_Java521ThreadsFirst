import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number extends Thread{

    String string;

    public Number(String string) {
        this.string = string;
    }

    @Override
    public void run() {
        int numberOfNumbers = 0;

        // Данное регулярное выражение ищет все цифры
        Pattern pattern = Pattern.compile("\\d");

        // Matcher ищет совпадение шаблона регулярного выражения с текстом строки
        Matcher matcher = pattern.matcher(this.string);

        while (matcher.find()) {
            numberOfNumbers++;
        }
        System.out.println("Number of numbers in the file is - " + numberOfNumbers);
    }
}
