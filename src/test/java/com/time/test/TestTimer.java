package com.time.test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer：这是java自带的java.util.Timer类，这个类允许你调度一个java.util.TimerTask任务
 * 使用这种方式可以让你的程序按照某一个频度执行，但不能在指定时间运行，一般用的较少
 * @author Wang926454
 * @date 2019/1/18 13:52
 */
public class TestTimer {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        };
        Timer timer = new Timer();
        // 启动延迟1秒后每3秒执行一次
        timer.schedule(timerTask,1000,3000);
    }
}
