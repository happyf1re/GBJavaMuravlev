package Lesson_02.DZ;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        System.err.println("Ошибка данных:");
        System.err.println(i + 1 + " строка");
        System.err.println(j + 1 + " столбец");
    }
}
