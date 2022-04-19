package ru.gb.homeWork7;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("барсик", 10, false);
        Cat cat2 = new Cat("бобик", 25, false);
        Cat cat3 = new Cat("мурзик", 15, false);
        Cat cat4 = new Cat("мурка", 20, false);
        Cat cat5 = new Cat("тобик", 35, false);
        Cat cat6 = new Cat("черныш", 30, false);

        Cat[] cats = {cat1, cat2, cat3, cat4, cat5, cat6};
        Plate plate = new Plate(100);

        for (Cat a : cats) {
            a.eatFood(plate);
            plate.infoPlate();
            a.satietyFull();
        }
        plate.increaseFood(100);
        plate.infoPlate();

    }
}
