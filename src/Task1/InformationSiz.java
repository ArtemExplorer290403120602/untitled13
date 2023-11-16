package Task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InformationSiz {

    public void numberSix(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько вы хотите ввести номера телефонов в формате +(xx)xxxxxxx:");
        int numberTelephone = scanner.nextInt();

        String[] telephone = new String[numberTelephone];
        String telephonePattern = "\\+\\(\\d{2}\\)\\d{7}";

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

        for (int i = 0; i < numberTelephone; i++) {
            System.out.println("telephone number " + (i + 1) + " : " + telephone[i]);
        }
    }
}
