package Lesson_02;

public class MyArraySizeException extends Exception{
    public MyArraySizeException() {
        System.err.println("Размер массива должен быть 4х4!");
    }
}
