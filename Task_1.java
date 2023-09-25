import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        Float number = enter();
        System.out.println("Введено " + number);
    }

    public static Float enter() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Float number = 0.0f;
        while (flag) {
            System.out.println("Введите дробное число: ");
            try {
                number = Float.parseFloat(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введено не  число!");
                continue;
            }
            if (Math.rint(number) != number) { // считаю, что, например, 5 и 5.0 - не дробные числа.
                flag = false;
                System.out.println("Ok!");
            } else {
                System.out.println("Введено не дробное число!");
            }
        }
        return number;
    }
}