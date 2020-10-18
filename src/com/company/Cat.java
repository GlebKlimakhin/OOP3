package com.company;

public class Cat {
    private String name;
    public int appetite;
    public boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Cat cat, Plate plate)
    {
        plate.decreaseFood(cat);
    }
    public void getInfo()
    {
        System.out.println("Имя : " + name + " Сытость: " + satiety);
    }

}
