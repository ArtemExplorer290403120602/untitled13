package Task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InformationSeven {

    public void numberSeven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько вы хотите ввести почт:");
        int numberEmail = scanner.nextInt();

        String[] email = new String[numberEmail];
        String emailPattern="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";

        for(int i = 0;i<numberEmail;i++){
            System.out.print("Пожалуйста введите ваш " + (i + 1) + " email: ");
            String input = scanner.next();

            if(Pattern.matches(emailPattern,input)){
                email[i]=input;
            }
        }

        for (int i = 0; i < numberEmail; i++) {
            System.out.println("email " + (i + 1) + " : " + email[i]);
        }
    }
}
