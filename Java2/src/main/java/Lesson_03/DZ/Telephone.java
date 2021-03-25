package Lesson_03.DZ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Telephone {

    private Map<String, HashSet<String>> map;

    Telephone() {
        this.map = new HashMap<>();
    }

    public void data (String name, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(name)) {
            numbers = map.get(name);
        }else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(name, numbers);
    }

    Set<String> get(String name) {
        return map.get(name);
    }

}
