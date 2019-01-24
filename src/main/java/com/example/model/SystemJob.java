package com.example.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "system_job")
public class SystemJob {
    /**
     * 任务ID
     */
    @Column(name = "JOB_ID")
    private Integer jobId;

    /**
     * 任务名称
     */
    @Column(name = "JOB_NAME")
    private String jobName;

    /**
     * 任务组
     */
    @Column(name = "JOB_GROUP")
    private String jobGroup;

    /**
     * 任务状态 0-未运行 1-运行中 2-暂停 3-作废
     */
    @Column(name = "TRIGGER_STATE")
    private String triggerState;

    /**
     * 任务表达式
     */
    @Column(name = "CRON_EXPRESSION")
    private String cronExpression;

    /**
     * 任务执行类全名
     */
    @Column(name = "JOB_CLASS_NAME")
    private String jobClassName;

    /**
     * 任务执行类在SPRING配置中的ID
     */
    @Column(name = "SPRING_ID")
    private String springId;

    /**
     * 任务执行方法，无参 注：选择JOB_CLASS_NAME或SPRING_ID时必录
     */
    @Column(name = "METHOD_NAME")
    private String methodName;

    /**
     * 任务执行RESTFUL服务URL，无参 注：JOB_CLASS_NAME、SPRING_ID和RESTFUL_URL方式三选一
     */
    @Column(name = "RESTFUL_URL")
    private String restfulUrl;

    /**
     * 任务描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 创建日期
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 创建人
     */
    @Column(name = "CREATED_BY")
    private String createdBy;

    /**
     * 更新日期
     */
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    /**
     * 更新人
     */
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    /**
     * 获取任务ID
     *
     * @return JOB_ID - 任务ID
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * 设置任务ID
     *
     * @param jobId 任务ID
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
     * 获取任务名称
     *
     * @return JOB_NAME - 任务名称
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 设置任务名称
     *
     * @param jobName 任务名称
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * 获取任务组
     *
     * @return JOB_GROUP - 任务组
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * 设置任务组
     *
     * @param jobGroup 任务组
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * 获取任务状态 0-未运行 1-运行中 2-暂停 3-作废
     *
     * @return TRIGGER_STATE - 任务状态 0-未运行 1-运行中 2-暂停 3-作废
     */
    public String getTriggerState() {
        return triggerState;
    }

    /**
     * 设置任务状态 0-未运行 1-运行中 2-暂停 3-作废
     *
     * @param triggerState 任务状态 0-未运行 1-运行中 2-暂停 3-作废
     */
    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState;
    }

    /**
     * 获取任务表达式
     *
     * @return CRON_EXPRESSION - 任务表达式
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * 设置任务表达式
     *
     * @param cronExpression 任务表达式
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * 获取任务执行类全名
     *
     * @return JOB_CLASS_NAME - 任务执行类全名
     */
    public String getJobClassName() {
        return jobClassName;
    }

    /**
     * 设置任务执行类全名
     *
     * @param jobClassName 任务执行类全名
     */
    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    /**
     * 获取任务执行类在SPRING配置中的ID
     *
     * @return SPRING_ID - 任务执行类在SPRING配置中的ID
     */
    public String getSpringId() {
        return springId;
    }

    /**
     * 设置任务执行类在SPRING配置中的ID
     *
     * @param springId 任务执行类在SPRING配置中的ID
     */
    public void setSpringId(String springId) {
        this.springId = springId;
    }

    /**
     * 获取任务执行方法，无参 注：选择JOB_CLASS_NAME或SPRING_ID时必录
     *
     * @return METHOD_NAME - 任务执行方法，无参 注：选择JOB_CLASS_NAME或SPRING_ID时必录
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 设置任务执行方法，无参 注：选择JOB_CLASS_NAME或SPRING_ID时必录
     *
     * @param methodName 任务执行方法，无参 注：选择JOB_CLASS_NAME或SPRING_ID时必录
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * 获取任务执行RESTFUL服务URL，无参 注：JOB_CLASS_NAME、SPRING_ID和RESTFUL_URL方式三选一
     *
     * @return RESTFUL_URL - 任务执行RESTFUL服务URL，无参 注：JOB_CLASS_NAME、SPRING_ID和RESTFUL_URL方式三选一
     */
    public String getRestfulUrl() {
        return restfulUrl;
    }

    /**
     * 设置任务执行RESTFUL服务URL，无参 注：JOB_CLASS_NAME、SPRING_ID和RESTFUL_URL方式三选一
     *
     * @param restfulUrl 任务执行RESTFUL服务URL，无参 注：JOB_CLASS_NAME、SPRING_ID和RESTFUL_URL方式三选一
     */
    public void setRestfulUrl(String restfulUrl) {
        this.restfulUrl = restfulUrl;
    }

    /**
     * 获取任务描述
     *
     * @return DESCRIPTION - 任务描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置任务描述
     *
     * @param description 任务描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取创建日期
     *
     * @return CREATED_DATE - 创建日期
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置创建日期
     *
     * @param createdDate 创建日期
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 获取创建人
     *
     * @return CREATED_BY - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取更新日期
     *
     * @return UPDATED_DATE - 更新日期
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * 设置更新日期
     *
     * @param updatedDate 更新日期
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * 获取更新人
     *
     * @return UPDATED_BY - 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人
     *
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}