//3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.


import java.util.Scanner;

public class OptionalTask1Three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        double avg = 0;
        String[] arr = line.split(" ");
        for (String s : arr) {
            avg += s.length();
        }
        if (arr.length > 0) avg /= arr.length;
        System.out.printf("Средняя длина введенных чисел: %.2f", avg);
        System.out.println("\nЧисла с длиной больше среднего:");
        for (String s : arr) {
            if (s.length() > avg) System.out.println(s + " Длина: " + s.length());
        }
        System.out.println("Числа с длиной меньше среднего:");
        for (String s : arr) {
            if (s.length() < avg) System.out.println(s + " Длина: " + s.length());
        }
    }
}
