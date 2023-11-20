package org.example;

public class TenorSinger extends Singer implements SuperStarSinger, SingleCountrySinger {


    public TenorSinger(String name) {
        super(name);
    }

    @Override
    public String sing() {
        return "Tenor song";
    }

    @Override
    public String drinkWater() {
        return null;
    }

    public void doSomeSpecialAction() {

    }

    @Override
    public boolean isSuperStar() {
        return true;
    }

    @Override
    public String getCountry() {
        return "UA";
    }
}
