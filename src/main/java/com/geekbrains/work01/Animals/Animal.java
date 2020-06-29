package com.geekbrains.work01.Animals;

public class Animal {

    String name;
    int distanceRun;
    int distanceSweem;


    public final void run() {
        if(distanceRun>300)
        System.out.println(name + " пробежал " + 300);
        else
            System.out.println(name + " пробежал только " + distanceRun );

    }

    public void sweem() {
        if(distanceSweem>50)
            System.out.println(name + " проплыл " + 50);
        else
            System.out.println(name + " проплыл только " + distanceSweem );
    }

}
