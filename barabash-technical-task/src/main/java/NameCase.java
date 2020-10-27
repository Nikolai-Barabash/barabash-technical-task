import java.util.Scanner;

public class NameCase {

    private static final String CONTROL_NAME = "Вячеслав";
    private String name;

    public String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        if (scanner.hasNext()) {
            name = scanner.nextLine();
            return name;
        } else {
            System.out.println("Ошибка ввода. Введите правильное значение");
            return inputName();
        }
    }

    public void checkName(String name) {
        if (name != null && name.equals(CONTROL_NAME)) {
            System.out.println("Привет, Вячеслав");
        } else {
            if (name != null) {
                System.out.println("Нет такого имени");
            }
        }
    }
}
