//2.  Вывести числа в порядке возрастания (убывания) значений их длины.

import java.util.Scanner;

public class OptionalTask1Two {
    public static void main(String[] args) {
        String[] arr = new String[3];
        Scanner in = new Scanner(System.in);
//Вводим значения в массив (вместо массива лучше использовать конечно же
//динамическую структуру данных (например ArrayList):
        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextLine();
        }
//Здесь происходит сортировка (сортировка пузырьком):
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
             если они имеют неправильный порядок,
             то меняем местами */
                if (arr[j].length() > arr[j + 1].length()) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
//выводим результат на экран:
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
