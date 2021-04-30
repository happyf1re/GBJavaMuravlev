public class Lesson1 {
    public static void main(String[] args) {
        /*     Примитивные типы     */
        //целочисленные типы
        byte by = 60;
        short sh = 31000;
        int in = 100000;
        long lo = 100000000L;
        //числа с плавающей точкой
        float fl = 1.2F;
        double db = 3.25;
        //символьный тип
        char ch = '$';
        //логический тип
        boolean bool = true;

        //проверяем метод operation
        float op = operation(3.2f, 34.3f, 5.6f, 7.9f);
        System.out.println("Проверка метода operation: " + op);

        //проверяем метод range
        boolean result = range(4, 7);
        System.out.println("Проверка метода range: " + result);

        //проверяем метод evo
        evo(1);

        //проверяем метод check
        boolean check = check (-34);
        System.out.println("Проверка метода check: " + check);

        //проверяем метод str
        str ("Дима");

        //проверяем метод leap
        leap(1600);

    }
    public static float operation (float a, float b, float c, float d) {
        return ((a * (b + (c / d))));
    }


    public static boolean range(int first, int second){
        int sum = first + second;
        boolean statement;
        if (sum <= 20 && sum >= 10){
            statement = true;
        }
        else{
            statement = false;
        }
        return ((boolean) statement);
    }

    public static void evo (int number){
        if (number >= 0) {
            System.out.println("Число положительное!");
        }
        else{
            System.out.println("Число отрицательное!");
        }
    }

    public static boolean check (int number1){
        boolean statement;
        if (number1 < 0){
            statement = true;
        }
        else{
            statement = false;
        }
        return statement;
    }

    public static void str (String name){
        System.out.println("Привет " + name + "!");
    }

    public static void leap (int year){
        if (year % 100 == 0 && year % 400 == 0){
            System.out.println("Год високосный!");
        }
        else if (year % 100 > 0 && year % 4 == 0){
            System.out.println("Год високосный!");
        }
        else {
            System.out.println("Год  не високосный!");
        }

    }
}
