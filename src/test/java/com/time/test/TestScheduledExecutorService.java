package com.time.test;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 这个也jdk自带的一个类，是基于线程池设计的定时任务类，每个调度任务都会分配到线程池中的一个线程去执行
 * 也就是说，任务是并发执行，互不影响
 * @author Wang926454
 * @date 2019/1/18 13:57
 */
public class TestScheduledExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 参数：任务体 首次执行的延时时间 任务执行间隔 间隔时间单位
        service.scheduleAtFixedRate(()->System.out.println(new Date()),0,3, TimeUnit.SECONDS);
    }
}
