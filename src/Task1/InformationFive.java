package Task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InformationFive {

    public void numberFive(){
        System.out.println("Введите сколько вы хотите ввести номера документов в формате xxxx-xxxx-xx:");
        Scanner scanner = new Scanner(System.in);
        int numberDocument = scanner.nextInt();

        String[] document = new String[numberDocument];
        String documentPattern = "\\d{4}-\\d{4}-\\d{2}";

        for (int i = 0; i < numberDocument; i++) {
            System.out.print("Ваш " + (i + 1) + " документ: ");
            String input = scanner.next();

            // Проверка формата с использованием регулярного выражения
            if (Pattern.matches(documentPattern, input)) {
                document[i] = input;
            } else {
                System.out.println("Некорректный формат документа. Пожалуйста, введите в формате xxxx-xxxx-xx.");
                i--; // Повторите ввод для текущего индекса
            }
        }

        for (int i = 0; i < numberDocument; i++) {
            System.out.println("document number " + (i + 1) + " : " + document[i]);
        }
    }
}
