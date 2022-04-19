package ru.gb.homeWork7;

public class Plate {

    private int food;
    private int addFood;

    public Plate(int food) {
        this.food = food;
    }

    public boolean looseFood(int appetite) {
        if(food >= appetite) {
            food -= appetite;
            return true;
        }
        System.out.println(" Коту не хватило еды");
        return false;
    }

    public void infoPlate() {
        System.out.println("В тарелке осталось " +  food + "гр.  еды");
    }

    public void increaseFood(int addFood) {
        food += addFood;
        System.out.println("В тарелку добавили " + addFood + " гр. еды");
    }
}
