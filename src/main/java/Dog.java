public class Dog extends Animal{
    int dogRunDistance = 500;
    int dogSwimDistance = 10;
    static int dogCount = 0;

    public Dog (String name) {
        super (name);
        dogCount++;
    }
    @Override
    public void run (int rdistance) {
        if (rdistance > dogRunDistance) {
            System.out.println("Собакам нельзя столько бегать!");
        } else {
            System.out.println(name + " пробежал " + rdistance);
        }
    }

    @Override
    public void swim (int sdistance) {
        if (sdistance > dogSwimDistance) {
            System.out.println(name + " столько не проплывёт!");
        } else {
            System.out.println(name + " проплыл " + sdistance);
        }
    }

}
