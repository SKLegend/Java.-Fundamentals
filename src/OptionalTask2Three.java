//2. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.


import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask2Three {
    public static void main(String[] args) {
        int [][] matrix;
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int n1 = sr.nextInt();
        int n2 = sr.nextInt();
        matrix = new int[n][n];
        for (int i = 0; i < n; i++ ){
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = ((int)(Math.random()*(n1+n2+1))-n1);
            }
        }
        for (int i = 0; i < n; i++ ){
            System.out.println();
            for (int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
        }


        int max = 0; int m =0; int h1 = 0; int r = 0; int min = 0; int h = 0;
        for (int i = 1; i < n-1; i++ ){
            for (int j = 1; j < n-1; j++)
            {
                if(matrix[i][j] < matrix[i][j+1]){//если последующий элемент больше
                    r+=1;
                    if(r>max){max=r;h=(i*n)+j+1;}//запоминаем количество возрастаний и индекс последнего возрастающего элем
                }else{r=0;}//возрастание прервалась
                if(matrix[i][j] > matrix[i][j+1]){
                    m+=1;
                    if(m>min){min=m;h1=(i*n)+j+1;}//запоминаем количество возрастаний и индекс последнего убыв элем
                } else{
                    m=0;
                }
            }
        }
        System.out.println();
        int[] f = new int[matrix.length * matrix.length];
        System.out.println("Максимальная последовательность возрастающих чисел:");
        int[]l=new int[max+1];
        System.arraycopy(f,(h-max+1),l,0,(max+1));//копирую последовательность возр элем в новый массив
        System.out.println(Arrays.toString(l)+" "+(max+1));
        System.out.println("Максимальная последовательность убывающих чисел:");
        int[]t=new int[min+1];
        System.arraycopy(f,(h1-min+1),t,0,(min+1));//копирую последовательность убыв элем в новый массив
        System.out.println(Arrays.toString(t)+" "+(min+1));
    }
}
