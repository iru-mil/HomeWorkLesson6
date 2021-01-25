package ru.geekbrains.HomeWorkLesson6;

public class Cat {
    private final String name;
    private final int appetite;
    protected boolean satiety;

    public Cat(String name, int appetite) {
        this.satiety = false;
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            System.out.println("Кот " + name + " съел " + appetite + " еды");
            satiety = true;
        } else System.out.println("Коту " + name + " недостаточно еды в тарелке ");
    }

    public int isSatiety(Cat cat) {
        if (satiety) {
            System.out.println("Кот " + name + " сыт");
            return 0;
        } else System.out.println("Кот " + name + " голоден");
        return appetite;
    }
}
