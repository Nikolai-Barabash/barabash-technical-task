import java.util.Scanner;

public class NumberCase {

    private static final int CONTROL_NUMBER = 7;
    private int number;

    public int inputNumber() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            return number;
        } else
            System.out.println("Ошибка ввода. Введите правильное значение");
        return inputNumber();
    }

    public void checkNumber(int number) {
        if (number > CONTROL_NUMBER) {
            System.out.println("Привет");
        }
    }
}
