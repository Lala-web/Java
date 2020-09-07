package ru.geekbrains.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Lesson3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            Random r = new Random();
            int x = r.nextInt(9);
            int f;
            System.out.println("Угадай число!");

            for (int i = 1; i <= 3; i++) {
                f = Integer.parseInt(br.readLine());

                if (f == x) {
                    System.out.println(f + " = " + x + " Победа!");
                    break;
                }
                else if (f > x) System.out.println(f + " > ?");
                else if (f < x) System.out.println(f + " < ?");

                if (i == 3) System.out.println("Вы проиграли! Загаданный номер: " + x);
            }

            System.out.println("Играть ещё? 1 - ДА / 0 - НЕТ");

            int repeat = Integer.parseInt(br.readLine());
            while ((repeat < 0) || (repeat > 1)) {
                System.out.println("Введите номер: 1 - ДА / 0 - НЕТ");
                repeat = Integer.parseInt(br.readLine());
            }

            if (repeat == 1) {
                System.out.println("Новая игра...");
            }
            else {
                System.out.println("Досвидания!");
                return;
            }
        } while (true);
    }
}