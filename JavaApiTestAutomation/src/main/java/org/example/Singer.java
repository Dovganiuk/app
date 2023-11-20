package org.example;

public abstract class Singer {
    private String name;

    public Singer(String name) {
        this.name = name;
    }

    public abstract String sing();

    public abstract String drinkWater();
}
