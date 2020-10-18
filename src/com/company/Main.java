package com.company;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat [] cats = new Cat[3];
        cats[0] = new Cat ("Дуся", 7);
        cats[1] = new Cat ("Бегемот", 4);
        cats[2] = new Cat ("Кашелот", 5);
        catsEat(cats, plate);
        plate.increaseFood();
        plate.info();
    }
    public static void catsEat(Cat [] cats, Plate plate)
    {
        for (Cat cat : cats) {
            cat.eat(cat, plate);
            cat.getInfo();
        }
        plate.info();
    }

}
