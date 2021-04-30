public class Plate {
    private int food = 0;

    public Plate(){
        this.food = food;
    }

    public void fill (int amount) {
        food = amount;
    }
    public void plateInfo() {
        if (food <= 0) {
            System.out.println("Еда в миске закончилась!");
        }
        System.out.println("В миске " + food + " еды");
    }
    public void feed (Cat cat, int amount) {
        if (amount > food) {
            System.out.println("В миске недостаточно еды!");
        }
        else {
            System.out.println(cat.name + " поела " + amount + " еды!");
            cat.hunger -= amount;
            food -= amount;
        }
    }
}
