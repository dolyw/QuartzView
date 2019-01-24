package com.example.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * https://blog.csdn.net/gnail_oug/article/details/80825302
 * 继承QuartzJobBean和实现Job，实现Job更好，QuartzJobBean只是spring包装的一层，也是实现了Job接口
 * @author Wang926454
 * @date 2019/1/24 15:58
 */
public class TestTask1 extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("TestTask1: " + simpleDateFormat.format(new Date()));
    }
}
