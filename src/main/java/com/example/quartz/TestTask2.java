package com.example.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * https://blog.csdn.net/gnail_oug/article/details/80825302
 * 实现序列化接口、防止重启应用出现quartz Couldn't retrieve job because a required class was not found 的问题
 * @author Wang926454
 * @date 2019/1/24 15:58
 */
public class TestTask2 implements Job, Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("TestTask2: " + simpleDateFormat.format(new Date()));
    }
}
