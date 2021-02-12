import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("Задача №1:");
        fiarr();
        System.out.println("Задача №2:");
        searr();
        System.out.println("Задача №3:");
        tharr();
        System.out.println("Задача №4:");
        foarr();
        System.out.println("Задача №5:");
        fifarr();
    }

    public static void fiarr() {
        //объявляем и инициализируем массив
        int[] first_array = {1, 0, 0, 1, 1, 0};
        //выводим массив строкой в консоль и проверяем его длину
        System.out.println("Первоначальный массив: " + Arrays.toString(first_array));
        System.out.println("Длина массива: " + first_array.length);
        //цикл для инвертирования массива
        for (int i = 0; i < first_array.length; i++) {
            if (first_array[i] == 1) {
                first_array[i] = 0;
            } else if (first_array[i] == 0) {
                first_array[i] = 1;
            }
        }
        //выводим инвертированный массив
        System.out.println("Инвертированный массив: " + Arrays.toString(first_array));
    }

    public static void searr() {
        //объявляем массив
        int[] second_array = new int[8];
        //заполняем массив
        for (int i = 0; i < second_array.length; i++) {
            second_array[i] = i * 3;
        }
        System.out.println(Arrays.toString(second_array));
    }

    public static void tharr() {
        //объявляем массив
        int[] third_array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Первоначальный массив :" + Arrays.toString(third_array));
        //умножаем значения массива < 6 на 3
        for (int i = 0; i < third_array.length; i++) {
            if (third_array[i] < 6) {
                third_array[i] = third_array[i] * 3;
            }
        }
        System.out.println("Получившийся массив :" + Arrays.toString(third_array));
    }

    public static void foarr() {
        //объявляем массив
        int [][] cross_array = new int [9][9];
        for (int i = 0; i < cross_array.length; i++){
            //проверяет длину своего элемента
            for (int j = 0; j < cross_array[i].length; j++){
                if (i == j){
                    cross_array[i][j] = 1;
                }else if (i == cross_array.length - j - 1){
                    cross_array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < cross_array.length; i++) {
            for (int j = 0; j < cross_array[i].length; j++) {
                System.out.print(cross_array[i][j] + " ");
            }
            //каждый элемент массива с новой строки
            System.out.println();
        }
    }

    public static void fifarr() {
        int [] arr = {3, 10, 109, -40, 1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            else if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }

    public static boolean check(int[] a) {
        int left, right;

        for (int i = 0; i < a.length + 1; i++) {
            left = 0;
            right = 0;

            for (int j = 0; j < i; j++) {
                left += a[j];
            }

            for (int j = i; j < a.length; j++) {
                right += a[j];
            }

            if (left == right) return true;
        }
        return false;

    }
}

