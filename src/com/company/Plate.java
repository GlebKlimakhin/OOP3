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

    public void increaseFood()
    {
        Scanner scanner = new Scanner(System.in);
        food += scanner.nextInt();
        System.out.println("Введите количество у.е. еды, которое хотите добавить(целое положительное число)");
        scanner.close();

    }
}
