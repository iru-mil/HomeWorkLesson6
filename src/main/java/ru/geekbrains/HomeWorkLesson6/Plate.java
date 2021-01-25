package ru.geekbrains.HomeWorkLesson6;

public class Plate {
    private int food;

    public void putFood(int amount) {
        this.food += amount;
        System.out.println("В тарелку положили " + amount + " еды");
    }

    public void decreaseFood(int amount) {
        this.food -= amount;
    }

    public int getFood() {
        return food;
    }
}
