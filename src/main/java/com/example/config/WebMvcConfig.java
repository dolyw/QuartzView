package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 在SpringBoot2.0及Spring 5.0中WebMvcConfigurerAdapter以被废弃，建议实现WebMvcConfigurer接口
 * @author Wang926454
 * @date 2019/1/24 19:17
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 设置首页
     * @param registry
     * @return void
     * @author Wang926454
     * @date 2019/1/24 19:18
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/login.shtml");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

}
