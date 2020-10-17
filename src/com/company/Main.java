package com.company;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();
        Cat [] cats = new Cat [4];
        cats[0] = new Cat ("Дуся", 7);
        cats[1] = new Cat ("Бегемот", 4);
        cats[2] = new Cat ("Кашелот", 5);
        catsEat(cats, plate);
        printArray(cats);
        
    }
    public static void catsEat(Cat[] cats, Plate plate)
    {
        for(int i = 0; i< cats.length; i++)
        {
            cats[i].eat(cats[i], plate);
        }
    }

    public static void printArray(Cat [] cats)
    {
        for (Cat cat : cats) {
            cat.getInfo();
        }
    }

}
