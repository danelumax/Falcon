package com.daniel.rest.monitor;

import com.daniel.rest.Log.LoggerWrapper;

import java.util.concurrent.*;

public class RestMonitor {

    public void init() {
        LoggerWrapper.info("REST monitor is starting ...");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<3; i++) {
                    LoggerWrapper.info(String.format("Monitoring (%s)", i));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

}
