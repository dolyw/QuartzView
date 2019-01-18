# SpringBootQuartz

> 一个定时任务管理系统，可视化显示图表任务执行状况

#### 项目介绍

* 后端基于SpringBootGenerator(快速生成基础代码):[https://github.com/wang926454/SpringBootGenerator](https://github.com/wang926454/SpringBootGenerator)
* 前端基于WeAdmin(基于LayUI):[https://github.com/wang926454/SpringBootQuartz/tree/weadmin](https://github.com/wang926454/SpringBootQuartz/tree/weadmin)

1. SpringBootGenerator(统一响应结果封装，统一异常处理，集成通用Mapper插件、PageHelper分页插件，实现单表业务零SQL)
2. WeAdmin(LayUI)
3. 模板使用Thymeleaf练习
4. 集成Quartz定时任务练习
5. ECharts练习

#### 完成进度

- [x] SpringBootGenerator作为后台基础架子
- [ ] WeAdmin作为前端基础架子
- [ ] SpringBootGenerator和WeAdmin整合，WeAdmin修改为Thymeleaf
- [ ] 集成Quartz
- [ ] 完成定时任务的CRUD
- [ ] 集成ECharts可视化

#### 软件架构

SpringBoot + Mybatis + PageHelper + 通用Mapper + Quartz定时任务 + Thymeleaf + LayUI + ECharts

#### 安装教程

1. 解压后执行src\test\resources\sql\MySQL.sql脚本创建数据库和表

#### 使用说明

1. 

### 搭建参考

1. SpringBoot几种定时任务的实现方式:[https://blog.csdn.net/wqh8522/article/details/79224290](https://blog.csdn.net/wqh8522/article/details/79224290)

#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request