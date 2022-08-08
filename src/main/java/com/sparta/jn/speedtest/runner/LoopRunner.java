package com.sparta.jn.speedtest.runner;

import com.sparta.jn.speedtest.loops.Loopable;

public class LoopRunner {
    //Dependency injection
    public void runLoops(Loopable loop, int maxValue) {
        double start = System.nanoTime();
        loop.runLoop(maxValue); //Liskov - children implements runLoop
        double finish = System.nanoTime();
        double totalTime = finish - start;
        System.out.println("Time in milliseconds:" + totalTime / 1_000_000);
    }
}
