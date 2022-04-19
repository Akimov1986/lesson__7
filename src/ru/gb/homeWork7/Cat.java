package ru.gb.homeWork7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eatFood(Plate plate) {
        satiety = plate.looseFood(appetite);
    }

    public void info() {
        System.out.println("Кот " + name + ", поел " + appetite + " гр.");
    }

    public void satietyFull() {
        if (satiety) {
            System.out.println("Кот " + name + " наелся");
        } else {
            System.out.println("Кот " + name + " голодный");
        }
    }
}
