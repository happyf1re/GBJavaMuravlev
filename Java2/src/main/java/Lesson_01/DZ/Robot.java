package DZ;

public class Robot implements Action {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Робот " + this.name + " прыгает!");
    }
    @Override
    public void run() {
        System.out.println("Робот " + this.name + " бежит!");
    }
}
