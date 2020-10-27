import java.util.Scanner;

public class ArrayCase {

    private static final int DIVISOR = 3;
    String[] arrayStr;
    int[] arrayInt;

    public void findMultiple(int[] arrayInt) {
        System.out.println("Элементы массива кратные 3: ");
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayInt[i] % DIVISOR == 0) {
                System.out.print(arrayInt[i] + " ");
            }
        }
    }

    public int[] inputArray() {
        System.out.println("Для формирования массива введите числа через пробел:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String arrayLine = scanner.nextLine();
            arrayStr = arrayLine.split(" ");
            arrayInt = new int[arrayStr.length];
        }
        for (int i = 0; i < arrayStr.length; i++) {
            try {
                arrayInt[i] = Integer.parseInt(arrayStr[i]);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода. Введите правильные значения");
                return inputArray();
            }
        }
        return arrayInt;
    }
}
