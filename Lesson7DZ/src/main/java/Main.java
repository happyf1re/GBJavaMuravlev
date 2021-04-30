public class Main {
    public static void main(String[] args) {
        Cat Ryzh = new Cat ("Ryzh");
        Cat Deni = new Cat ("Deni");
        Cat Zulia = new Cat ("Zulia");


        Plate plate = new Plate();

        Cat [] cats = new Cat[3];

        cats[0] = Ryzh;
        cats[1] = Deni;
        cats[2] = Zulia;

        plate.fill(50);
        plate.plateInfo();
        System.out.println();
        for (Cat cat : cats) {
            plate.feed(cat, 5);
            cat.catInfo(cat);
        }
        System.out.println();
        plate.plateInfo();



    }
}

