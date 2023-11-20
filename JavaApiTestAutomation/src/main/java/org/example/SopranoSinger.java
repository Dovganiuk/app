package org.example;

public class SopranoSinger extends Singer {

    public SopranoSinger(String name) {
        super(name);
    }

    @Override
    public String sing() {
        return "Soprano song";
    }

    @Override
    public String drinkWater() {
        return null;
    }
}
