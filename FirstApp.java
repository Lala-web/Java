package ru.geekbrains.lesson1;

public class FirstApp {
    public static void main(String[] args) {
        taskTwo();
        System.out.println(calculate(2, 2, 2, 2));
        System.out.println(task10and20(5, 6));
        isPositiveOrNegative(-30);
        System.out.println(isNegative(-1));
        greetings("Илон Маск");
    }

    static void taskTwo() {
        System.out.println("Задание 2");
        byte b = 22;
        System.out.println(b);

        short s = 12442;
        System.out.println(s);

        int x = 10;
        System.out.println(x);

        long l = 200000L;
        System.out.println(l);

        float f = 12.23f;
        System.out.println(f);

        double pi = 3.14159;
        System.out.println(pi);

        char a = 'a';
        System.out.println(a);

        boolean bool = false;
        System.out.println(bool);
    }

    public static int calculate(int a, int b, int c, int d) {
        System.out.println("Задание 3");
        return a * (b + (c / d));
    }

    public static boolean task10and20(int x1, int x2) {
        System.out.println("Задание 4");
        int sum = x1 + x2;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    public static void isPositiveOrNegative(int x) {
        System.out.println("Задание 5");
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isNegative(int x) {
        System.out.println("Задание 6");
        if (x < 0) {
            return true;
        }
        return false;
    }

    public static void greetings(String name) {
        System.out.println("Задание 7");
        System.out.println("Привет, " + name + "!");
    }

}

