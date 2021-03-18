package DZ;

public class Cat implements  Action{
    private String name;

    public Cat (String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Кошка " + this.name + " прыгает!");

    }

    @Override
    public void run() {
        System.out.println("Кошка " + this.name + " бежит");

    }
}
