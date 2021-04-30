package DZ;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Action [] guys = new Action[3];

        guys[0] = new Human("Дмитрий");
        guys[1] = new Cat("Рыжая");
        guys[2] = new Robot("Железяка");

        Barrier [] barriers = new Barrier[2];
        barriers[0] = new Treadmill("Treadmill");
        barriers[1] = new Wall("Wall");

        for (int i = 0; i < guys.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                barriers[j].move(guys[i]);

            }
        }


    }
}
