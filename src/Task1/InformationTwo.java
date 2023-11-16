package Task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InformationTwo  {
    public void numberTwo(){
        System.out.println("Введите сколько вы хотите ввести номера документов в формате xxxx-xxxx-xx:");
        Scanner scanner = new Scanner(System.in);
        int numberDocument = scanner.nextInt();

        System.out.println("Введите сколько вы хотите ввести номера телефонов в формате +(xx)xxxxxxx:");
        int numberTelephone = scanner.nextInt();

        String[] document = new String[numberDocument];
        String[] telephone = new String[numberTelephone];

        String documentPattern = "\\d{4}-\\d{4}-\\d{2}";
        String telephonePattern = "\\+\\(\\d{2}\\)\\d{7}";

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

        for(int i = 0; i<numberTelephone;i++) {
            System.out.print("Пожалуйста введите ваш " + (i + 1) + " телефон: ");
            String input = scanner.next();

            if (Pattern.matches(telephonePattern, input)) {
                telephone[i] = input;
            } else {
                System.out.println("Некорректный формат телефона. Пожалуйста, введите в формате +(xx)xxxxxxx.");
                i--; // Повторите ввод для текущего индекса
            }
        }

        for (int i = 0; i < numberDocument; i++) {
            System.out.println("document number " + (i + 1) + " : " + document[i]);
        }
        for (int i = 0; i < numberTelephone; i++) {
            System.out.println("telephone number " + (i + 1) + " : " + telephone[i]);
        }
    }
}
