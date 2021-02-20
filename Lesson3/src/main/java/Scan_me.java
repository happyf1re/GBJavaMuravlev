import java.util.Random;
import java.util.Scanner;

public class Scan_me {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random number = new Random();
        int memory = number.nextInt(9);
        int tryhard = 0;

        while (tryhard <= 3){
            System.out.println("Введите число от 0 до 9: ");
            int user_number = scan.nextInt();
            if (user_number < 0 || user_number > 8){
                System.out.println("Введите корректное число");
                continue;
            }


            if (user_number > memory) {
                System.out.println("Слишком много!");
                tryhard++;

            }
            else if (user_number < memory) {
                System.out.println("Слишком мало!");
                tryhard++;
            }
            else {
                System.out.println("Вы угадали!");
                System.out.println("Повторим? 1 - да, 0 - нет.");
                int repeat = scan.nextInt();
                if (repeat == 1) {
                    tryhard = 0;
                }
                else {
                    break;
                }
        }
            if (tryhard == 3) {
                System.out.println("Попытки закончились, вы проиграли.");
                System.out.println("Повторим? 1 - да, 0 - нет.");
                int repeat = scan.nextInt();
                if (repeat == 1) {
                    tryhard = 0;
                }
                else {
                    break;
                }
            }

    }
        scan.close();
        }

    }

