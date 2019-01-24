drop database springbootquartz;

create database springbootquartz;

use springbootquartz;

DROP TABLE IF EXISTS `system_job`;

CREATE TABLE `system_job` (
  `JOB_ID` INT PRIMARY KEY AUTO_INCREMENT COMMENT '任务ID',
  `JOB_NAME` varchar(600) NOT NULL COMMENT '任务名称',
  `JOB_GROUP` varchar(600) NOT NULL COMMENT '任务组',
  `TRIGGER_STATE` varchar(3) NOT NULL COMMENT '任务状态 0-未运行 1-运行中 2-暂停 3-作废',
  `CRON_EXPRESSION` varchar(100) NOT NULL COMMENT '任务表达式',
  `JOB_CLASS_NAME` varchar(150) DEFAULT NULL COMMENT '任务执行类全名',
  `SPRING_ID` varchar(100) DEFAULT NULL COMMENT '任务执行类在SPRING配置中的ID',
  `METHOD_NAME` varchar(100) DEFAULT NULL COMMENT '任务执行方法，无参 注：选择JOB_CLASS_NAME或SPRING_ID时必录',
  `RESTFUL_URL` varchar(400) DEFAULT NULL COMMENT '任务执行RESTFUL服务URL，无参 注：JOB_CLASS_NAME、SPRING_ID和RESTFUL_URL方式三选一',
  `DESCRIPTION` varchar(600) DEFAULT NULL COMMENT '任务描述',
  `CREATED_DATE` datetime NOT NULL COMMENT '创建日期',
  `CREATED_BY` varchar(32) NOT NULL COMMENT '创建人',
  `UPDATED_DATE` datetime NOT NULL COMMENT '更新日期',
  `UPDATED_BY` varchar(32) NOT NULL COMMENT '更新人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '定时任务表';

