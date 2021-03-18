package DZ;

public class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }
    public void move (Action action) {
        System.out.println("Успешно выполнил действие!");
    }
}
