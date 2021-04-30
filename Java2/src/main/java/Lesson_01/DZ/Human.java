package DZ;

public class Human implements Action {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Человек " + this.name + " прыгает!");

    }
    @Override
    public void run() {
        System.out.println("Человек " + this.name + " бежит!");

    }
}
