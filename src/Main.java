import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        // todo: Создать файл на N количество слов.
        //       Запустить потоки:
        //       1) Посчитать количество слов
        //       2) Посчитать количество предложений
        //       3) Посчитать количество букв
        //       4) Посчитать количество чисел
        //       5) Посчитать количество гласных

        // Создаем случайную строку для анализа
        String string = "The weather is splendid today. " +
                "It's been this way 6 days in a row. 1 more day will make it 7.";

        // Создаем объекты классов, наследующих от Thread
        Word wordThread = new Word(string);
        Sentence sentenceThread = new Sentence(string);
        Letter letterThread = new Letter(string);
        Number numberThread = new Number(string);
        Vowel vowelThread = new Vowel(string);

        // Создаем файл
        Path path = Paths.get("file.txt");
        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            System.out.println("This file already exists, you may keep working");
        } catch (IOException e) {
            System.out.println("Sorry, something went wrong with the " + e.getMessage());
        }

        // Записываем строку в файл
        try {
            Files.writeString(path, string);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

        // Запускаем потоки
        wordThread.start();
        sentenceThread.start();
        letterThread.start();
        numberThread.start();
        vowelThread.start();
    }
}