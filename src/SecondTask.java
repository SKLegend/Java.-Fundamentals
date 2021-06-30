import java.util.Scanner;

// 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Введите Цифры для вывода их в обратном порядке: ");
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            StringBuffer toll = new StringBuffer(vvod.nextLine());
            toll.reverse();
            System.out.println("Аргументы в обратном порядке " + toll.toString());
        }
    }
}
