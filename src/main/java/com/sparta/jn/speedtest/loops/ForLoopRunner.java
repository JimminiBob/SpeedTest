package com.sparta.jn.speedtest.loops;

public class ForLoopRunner implements Loopable{

    @Override
    public void runLoop(int maxValue) {
        int total = 0;
        for (int i = 0; i <= maxValue; i++) {
            total = total + i;
        }
        System.out.print("Total for For loop: " + total + ", ");
    }
}
