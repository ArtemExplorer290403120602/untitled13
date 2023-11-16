package Task1;

import java.util.Scanner;

//Программа на вход получает произвольный текст. В этом тексте может быть номер
//документа(один или несколько), емейл и номер телефона. Номер документа в
//формате: , где x - это любая цифра; номер телефона в формате:
//+(xx)xxxxxxx. Документ может содержать не всю информацию, т.е. например, может не
//содержать номер телефона, или другое. Необходимо найти эту информацию и вывести
//в консоль в формате:
//email: teachmeskills@gmail.com
//document number: 1423-1512-51
//и т.д
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в нашу систему , для регистрации вам понадобиться ввести номер документа , номер телефона и email");
        System.out.println("Если вы хотите ввести все данные нажмите 1");
        System.out.println("Если хотите ввести номер документа и номер телефона нажмите 2");
        System.out.println("Если хотите ввести номер документа и еmail нажмите 3");
        System.out.println("Если хотите ввести номер телефона и email нажмите 4");
        System.out.println("Если хотите ввести только номер документа нажмите 5");
        System.out.println("Если хотите ввести только номер телефона нажмите 6");
        System.out.println("Если хотите ввести только email нажмите 7");
        System.out.print("Введите цифру: ");
        int number;
        do {
            number=scanner.nextInt();
            Menu menu1 = new Menu();
            menu1.menu(number);
        } while (number < 1 || number > 7);
    }
}