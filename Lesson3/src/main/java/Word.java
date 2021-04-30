
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
         String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};


        Scanner scan = new Scanner(System.in);
        Random guess = new Random();
        int word = guess.nextInt(words.length);

        int a = 1;
        char [] result = new char[15];

        char [] computerword = words[word].toCharArray();
        char [] comp = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'};
        for (int i = 0; i < computerword.length; i++) {
            comp [i] = computerword[i];
        }
        System.out.println(comp);

        char [] player = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'};
        System.out.println("Угадайте слово!");
        while (a == 1) {
            char[] playerword = scan.nextLine().toCharArray();
            for (int j = 0; j < playerword.length; j++) {
                player[j] = playerword[j];
            }
            if (!Arrays.equals(player, comp)){
                System.out.println("Попробуйте ещё раз!");
                for (int i = 0; i < result.length; i++) {
                    if (player[i] == comp[i]) {
                        result[i] = player[i];
                    } else {
                        result[i] = '#';
                    }
                }
                System.out.println(result);
            }
            else {
                    System.out.println("Вам удалось!");
                    a = 0;
                }
            }
        }
    }










