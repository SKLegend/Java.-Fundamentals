import java.util.Scanner;
// 1. Приветствовать любого пользователя при вводе его имени через командную строку.Приветствовать любого пользователя при вводе его имени через командную строку.

public class FirstTask {
    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        Scanner vvod = new Scanner(System.in);
        System.out.println("Hello " + vvod.nextLine());
    }
}
