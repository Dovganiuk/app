package org.example;

public class Main {
    public static void main(String[] args) {
//        Singer singer = new Singer("Vasyl");
        //       String generalSong = singer.sing();
        //       System.out.println(generalSong);

        TenorSinger tenor = new TenorSinger("Stepan");
        String tenorSong = tenor.sing();
        tenor.doSomeSpecialAction();
        System.out.println(tenorSong);

        SopranoSinger soprano = new SopranoSinger("Ivan");
        String sing = soprano.sing();
        System.out.println(sing);


    }
}

