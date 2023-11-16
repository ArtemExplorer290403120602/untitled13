package Task1;

public class Menu {
    public void menu(int number) {
        switch (number) {
            case 1:
                InformationOne informationOne = new InformationOne();
                informationOne.numberOne();
                break;
            case 2:
                InformationTwo informationTwo = new InformationTwo();
                informationTwo.numberTwo();
                break;
            case 3:
                InformationThree informationThree = new InformationThree();
                informationThree.numberThree();
                break;
            case 4:
                InformationFour informationFour = new InformationFour();
                informationFour.numberFour();
                break;
            case 5:
                InformationFive informationFive = new InformationFive();
                informationFive.numberFive();
                break;
            case 6:
                InformationSiz informationSiz = new InformationSiz();
                informationSiz.numberSix();
                break;
            case 7:
                InformationSeven informationSeven = new InformationSeven();
                informationSeven.numberSeven();
                break;
            default:
                System.out.println("Ошибка , вы ввели не то число , пожалуйста повторите заново");
                break;
        }

    }
}
