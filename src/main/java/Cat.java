public class Cat extends Animal{
    int catRunDistance = 200;
    int catSwimDistance = 0;
    static int catCount = 0;

    public Cat (String name) {
        super (name);
        catCount++;
    }
    @Override
    public void run (int rdistance) {
        if (rdistance > catRunDistance) {
            System.out.println(name + " столько не пробежит");
        } else {
            System.out.println(name + " пробежал " + rdistance);
            }
        }

    @Override
    public void swim (int sdistance) {
        System.out.println(name + " не умеет плавать");
    }

    }

