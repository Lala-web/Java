package ru.geekbrains.lesson6;



abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
    private final double MAX_JUMP_HEIGTH = 0;

    abstract void run(int length);

    abstract void swim(int length);

    abstract void jump(double height);
}

class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    private final double MAX_JUMP_HEIGTH = 2;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Cat runs:true");
        else System.out.println("Cat runs: false");
    }

    @Override
    void swim(int length) {
        System.out.println("Cat swims: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("Cat jumps: true");
        else System.out.println("Cat jumps: fase");
    }
}

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;
    private final double MAX_JUMP_HEIGTH = 0.5;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Dog runs: true");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("Dog swims: true");
        else System.out.println("Dog swims: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("Dog jumps: true");
        else System.out.println("Dog jumps: false");
    }
}

public class lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(201);
        cat.swim(1);
        cat.jump(1.9);

        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);
        dog.jump(0.4);
    }
}

