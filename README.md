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
- [x] WeAdmin作为前端基础架子
- [ ] SpringBootGenerator和WeAdmin整合，WeAdmin修改为Thymeleaf
- [ ] 集成Quartz
- [ ] 完成定时任务的CRUD
- [ ] 集成ECharts可视化

#### 软件架构

SpringBoot + Mybatis + PageHelper + 通用Mapper + Quartz定时任务 + Thymeleaf + LayUI + ECharts

#### 安装教程

1. 解压后执行src\main\resources\sql\mysql.sql脚本创建数据库和表

#### 使用说明

1. 

### 搭建参考

1. SpringBoot几种定时任务的实现方式:[https://blog.csdn.net/wqh8522/article/details/79224290](https://blog.csdn.net/wqh8522/article/details/79224290)
2. SpringBoot官方文档:[https://docs.spring.io/spring-boot/docs/2.1.1.RELEASE/reference/htmlsingle/#boot-features-quartz](https://docs.spring.io/spring-boot/docs/2.1.1.RELEASE/reference/htmlsingle/#boot-features-quartz)
3. SpringBoot2.x开发案例之整合Quartz任务管理系统:[https://www.cnblogs.com/smallSevens/p/8798451.html](https://www.cnblogs.com/smallSevens/p/8798451.html)
4. Spring Boot教程(二十一)：Spring Boot使用Quartz定时任务:[https://blog.csdn.net/gnail_oug/article/details/80825302](https://blog.csdn.net/gnail_oug/article/details/80825302)
5. Thymeleaf教程 （十二） 标签内，js中使用表达式:[https://blog.csdn.net/mygzs/article/details/52667897](https://blog.csdn.net/mygzs/article/details/52667897)
6. DAY23 Thymeleaf html 导入(th:replace & th:include):[https://blog.csdn.net/h1021456873/article/details/79085505](https://blog.csdn.net/h1021456873/article/details/79085505)
7. thymeleaf中的th:remove用法:[https://www.cnblogs.com/suncj/p/4030975.html](https://www.cnblogs.com/suncj/p/4030975.html)
8. Thymeleaf的include封装共用js和css:[https://blog.csdn.net/zqy_zq_zxl/article/details/72773973](https://blog.csdn.net/zqy_zq_zxl/article/details/72773973)

#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request