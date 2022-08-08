package com.sparta.jn.speedtest.loops;

public class WhileLoopRunner implements Loopable{
    @Override
    public void runLoop(int maxValue) {
        int total = 0;
        int count = 0;

        while (count <= maxValue) {
            total = total + count;
            count++;
        }
        System.out.print("Total for while loop: " + total + ", ");
    }
}
