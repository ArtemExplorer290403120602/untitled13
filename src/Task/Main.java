package Task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Вывести в консоль из строки которую пользователь вводит с клавиатуры все
//аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
//только из прописных букв, без чисел.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пользователь введите текст:");
        if (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            System.out.println("Твой текст: " + text);
            Pattern pattern=Pattern.compile("[А-Я]{2,6}");
            Matcher matcher=pattern.matcher(text);
            while (matcher.find()){
                System.out.println("Твой результат: " + matcher.group());
            }
        } else {
            System.out.println("Error!!!");
        }
    }
}
