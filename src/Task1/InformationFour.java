package Task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InformationFour {
    public void numberFour(){
        System.out.println("Введите сколько вы хотите ввести номера телефонов в формате +(xx)xxxxxxx:");
        Scanner scanner=new Scanner(System.in);
        int numberTelephone = scanner.nextInt();

        System.out.println("Введите сколько вы хотите ввести почт:");
        int numberEmail = scanner.nextInt();

        String[] telephone = new String[numberTelephone];
        String[] email = new String[numberEmail];
        String telephonePattern = "\\+\\(\\d{2}\\)\\d{7}";
        String emailPattern="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";

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

        for(int i = 0;i<numberEmail;i++){
            System.out.print("Пожалуйста введите ваш " + (i + 1) + " email: ");
            String input = scanner.next();

            if(Pattern.matches(emailPattern,input)){
                email[i]=input;
            }
        }

        for (int i = 0; i < numberTelephone; i++) {
            System.out.println("telephone number " + (i + 1) + " : " + telephone[i]);
        }
        for (int i = 0; i < numberEmail; i++) {
            System.out.println("email " + (i + 1) + " : " + email[i]);
        }
    }
}
