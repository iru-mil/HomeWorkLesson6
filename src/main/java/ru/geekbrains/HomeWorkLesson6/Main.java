package ru.geekbrains.HomeWorkLesson6;

public class Main {

    public static void main(String[] args) {

        int hungryCount = 0;
        Cat[] CatsArray = new Cat[5];
        CatsArray[0] = new Cat("Рыжик", 10);
        CatsArray[1] = new Cat("Пушок", 15);
        CatsArray[2] = new Cat("Матроскин", 18);
        CatsArray[3] = new Cat("Васька", 9);
        CatsArray[4] = new Cat("Снежок", 11);

        Plate plate = new Plate();
        plate.putFood(40);

        for (Cat cat : CatsArray)
            cat.eat(plate);

        for (Cat cat : CatsArray)  // вывод информации о сытости котов и подсчет сколько еще нужно покормить
            hungryCount += cat.isSatiety(cat);

        System.out.println("В тарелке осталось еды - " + plate.getFood());
        System.out.println("Нужно еды - " + hungryCount);
        plate.putFood(hungryCount - plate.getFood());

        for (Cat cat : CatsArray) { //кормим оставшихся голодных котов
            if (!cat.satiety)
                cat.eat(plate);
        }
        System.out.println(plate.getFood());
    }

}
