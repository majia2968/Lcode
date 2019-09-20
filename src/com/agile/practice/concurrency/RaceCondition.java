package com.agile.practice.concurrency;

public class RaceCondition implements Runnable{

    public static void main(String[] args) {
        RaceCondition raceCondition = new RaceCondition();
        raceCondition.run();
    }

    @Override
    public void run() {
        System.out.println("how are you!");
    }
}
