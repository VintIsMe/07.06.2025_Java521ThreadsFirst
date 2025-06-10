import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence extends Thread{

    String string;

    public Sentence(String string) {
        this.string = string;
    }

    @Override
    public void run() {
        int numberOfSentences = 0;

        // Данное регулярное выражение не обеспечивает 100 % результат, но главное - многопоточка!
        Pattern pattern = Pattern.compile("\\..");

        // Matcher ищет совпадение шаблона регулярного выражения с текстом строки
        Matcher matcher = pattern.matcher(this.string);

        while (matcher.find()) {
            numberOfSentences++;
        }
        System.out.println("Number of sentences in the file is - " + (numberOfSentences + 1));
    }
}
