package com.geekbrains.work01;


import com.geekbrains.work01.Animals.Cat;
import com.geekbrains.work01.Animals.Dog;
import com.geekbrains.work01.Animals.Tiger;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Домашний кот", 200, 0);
        Dog dog = new Dog("Собака", 500, 10);
        Tiger tiger = new Tiger("Тигр", 800, 100);


        cat.run();
        cat.sweem();
        dog.run();
        dog.sweem();
        tiger.run();
        tiger.sweem();

    }
}
