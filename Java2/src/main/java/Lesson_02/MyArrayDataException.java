package Lesson_02;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i, int j) {
        super();
        System.err.println("Ошибка данных:");
        System.err.println(i+1 + " строка");
        System.err.println(j+1 + " столбец");


}}
