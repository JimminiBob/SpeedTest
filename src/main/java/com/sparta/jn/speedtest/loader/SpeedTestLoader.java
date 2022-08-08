package com.sparta.jn.speedtest.loader;

import com.sparta.jn.speedtest.loops.ForLoopRunner;
import com.sparta.jn.speedtest.loops.StreamLoopRunner;
import com.sparta.jn.speedtest.loops.WhileLoopRunner;
import com.sparta.jn.speedtest.runner.LoopRunner;

public class SpeedTestLoader {

    public static void startLoops(int maxValue) {
        ForLoopRunner forLoopRunner = new ForLoopRunner();
        WhileLoopRunner whileLoopRunner = new WhileLoopRunner();
        StreamLoopRunner streamLoopRunner = new StreamLoopRunner();
        LoopRunner runner = new LoopRunner();

        runner.runLoops(forLoopRunner, maxValue);
        runner.runLoops(whileLoopRunner, maxValue);
        runner.runLoops(streamLoopRunner, maxValue);
    }
}
