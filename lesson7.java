package ru.geekbrains.lesson7;

public class lesson7 {
    public static void main(String[] args) {
        System.out.println("Cats:");
        Cat[] x = {new Cat("Black", 20), new Cat("Tom", 15), new Cat("White", 7)};
        Plate plate = new Plate(10);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println(plate + "\n");
        System.out.println("Add food: +10");
        plate.increaseFood(10);
        System.out.println(plate);
        System.out.println("\n" + "Cats eat:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
