public class Main {
    public static void main(String[] args) {
        //кошки
        Cat catDeny = new Cat("Deny");
        Cat catRyzh = new Cat("Ryzh");
        Cat catZulia = new Cat ("Zulia");

        //собаки
        Dog dogAxel = new Dog("Axel");

        //животные
        Animal animalParrot = new Animal("Popka");

        catDeny.swim(150);
        catRyzh.run(100);
        catZulia.run(400);
        dogAxel.run(450);
        animalParrot.run(1000);

        System.out.println("Всего животных: " + animalParrot.animalCount);
        System.out.println("Всего кошек: " + catDeny.catCount);
        System.out.println("Всего собак: " + dogAxel.dogCount);
    }
}
