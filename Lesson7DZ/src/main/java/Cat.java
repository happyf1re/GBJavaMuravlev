public class Cat {
    String name;
    int hunger;
    boolean satiety;

    public Cat(String name) {
        this.name = name;
        this.hunger = 5;
        this.satiety = true;
    }

    public void catInfo(Cat cat) {
        if (cat.hunger <= 0) {
            cat.satiety = false;
            System.out.println(cat.name + " больше не голодна!");
        }
        else {
            System.out.println("У " + cat.name + " еще " + cat.hunger + " единиц голода!");
        }


    }
}
