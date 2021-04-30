package Lesson_03.DZ;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String [] animals = {"cat", "dog", "parrot"};
        ArrayList<String> words = new ArrayList<>(1000); //ёмкость задал просто так, для теста
        Random random = new Random();

        System.out.println(words);

        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(animals.length);
            words.add(animals[index]);
        }
        words.add("Уникальное"); //просто добавим пару одинаковых слов, для лишней проверки на уникальность
        words.add("Уникальное");

        System.out.println(words);
//        System.out.println(words.size());

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word,0) + 1);
        }
        System.out.println(map);
        System.out.println();

        Set<String> unique = new HashSet<>(words);
        System.out.println(unique);
        System.out.println();

        //Телефонная книга
        Telephone phoneBook = new Telephone();
        phoneBook.data("Dmitry", "12334");
        phoneBook.data("Dmitry", "5566");
        phoneBook.data("Ivan", "1233213123");

        System.out.println(phoneBook.get("Dmitry"));
        
    }
}
