package com.geekbrains.work01.Animals;

public class Cat extends Animal {
    public Cat(String name, int distanceRun, int distanceSweem) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSweem = distanceSweem;
    }
    @Override
    public void sweem () {
        System.out.println(name + " не умеет плавать ");
    }

}

