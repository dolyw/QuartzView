package com.example.quartz;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * https://blog.csdn.net/gnail_oug/article/details/80825302
 * @author Wang926454
 * @date 2019/1/24 16:01
 */
@Configuration
public class QuartzConfig {

    /*@Bean
    public JobDetail testQuartz1() {
        return JobBuilder.newJob(TestTask1.class).withIdentity("testQuartz1").storeDurably().build();
    }

    @Bean
    public JobDetail testQuartz2() {
        return JobBuilder.newJob(TestTask2.class).withIdentity("testQuartz2").storeDurably().build();
    }

    @Bean
    public Trigger testQuartzTrigger1() {
        // 1秒执行一次
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(1)
                .repeatForever();
        return TriggerBuilder.newTrigger().forJob(testQuartz1())
                .withIdentity("testQuartzTrigger1")
                .withSchedule(scheduleBuilder)
                .build();
    }

    @Bean
    public Trigger testQuartzTrigger2() {
        // cron方式，每隔1秒执行一次
        return TriggerBuilder.newTrigger().forJob(testQuartz2())
                .withIdentity("testQuartzTrigger2")
                .withSchedule(CronScheduleBuilder.cronSchedule("* * * * * ? *"))
                .build();
    }*/
}
