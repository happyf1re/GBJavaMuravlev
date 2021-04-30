public class Animal {
    String name;
    static int animalCount = 0;


    public Animal (String name) {
        this.name = name;
        animalCount++;
    }

    public void run (int rdistance) {
        System.out.println(name + " пробежал " + rdistance);
    }
    public void swim (int sdistance) {
        System.out.println(name + " проплыл " + sdistance);
    }

}
