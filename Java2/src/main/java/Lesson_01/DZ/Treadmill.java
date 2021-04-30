package DZ;

public class Treadmill extends Barrier {

    public Treadmill(String name) {
        super(name);
    }

    @Override
    public void move(Action action) {
        action.run();
        System.out.println("Успешно пробежал!");
    }

}
