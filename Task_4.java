import java.util.*;

public class Task_4 {
    public static void main(String[] args) {
        try {
            enter();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void enter() throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Строка не должна быть пустой!");
        }
        System.out.println("Ok!");
    }
}