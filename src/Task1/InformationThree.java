package Task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InformationThree {

    public void numberThree() {
        System.out.println("Введите сколько вы хотите ввести номера документов в формате xxxx-xxxx-xx:");
        Scanner scanner = new Scanner(System.in);
        int numberDocument = scanner.nextInt();

        System.out.println("Введите сколько вы хотите ввести почт:");
        int numberEmail = scanner.nextInt();

        String[] document = new String[numberDocument];
        String[] email = new String[numberEmail];

        String documentPattern = "\\d{4}-\\d{4}-\\d{2}";
        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";


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
        for (int i = 0; i < numberEmail; i++) {
            System.out.print("Пожалуйста введите ваш " + (i + 1) + " email: ");
            String input = scanner.next();

            if (Pattern.matches(emailPattern, input)) {
                email[i] = input;
            }
        }
        for (int i = 0; i < numberDocument; i++) {
            System.out.println("document number " + (i + 1) + " : " + document[i]);
        }
        for (int i = 0; i < numberEmail; i++) {
            System.out.println("email " + (i + 1) + " : " + email[i]);
        }
    }
}
