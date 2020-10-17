package com.company;

import java.util.Scanner;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void decreaseFood(Cat cat)
    {
        if((food- cat.appetite) >= 0) {
            this.food -= cat.appetite;
            cat.satiety = true;
            cat.appetite = 0;
        }

    }
    public int getFood()
    {
        return food;
    }

    public void increaseFood()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        food += n;
        scanner.close();
    }
}
