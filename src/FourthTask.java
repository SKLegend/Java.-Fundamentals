import java.util.Scanner;

// 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class FourthTask {
    public static void main(String[] args) {

        System.out.println("Ввести целые числа: ");
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int x = vvod.nextInt();
            int y = vvod.nextInt();
            int z = vvod.nextInt();

            System.out.println("Sum= " + (x + y + z));
            System.out.println("Mutli= " + (x * y * z));
        }
    }
}
