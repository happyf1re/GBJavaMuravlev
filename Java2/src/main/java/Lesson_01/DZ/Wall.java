package DZ;

public class Wall extends Barrier {

    public Wall(String name) {
        super(name);
    }
    @Override
    public void move(Action action) {
        action.jump();
        System.out.println("Успешно перепрыгнул!");
    }
}
