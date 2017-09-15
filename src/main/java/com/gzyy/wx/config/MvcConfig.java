package com.gzyy.wx.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置图片的虚拟目录配置类
 * @Author @DT人 【jky1988@qq.com】
 * @Date 2017/9/15 21:19
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").addResourceLocations("file:///C:/weixin/upload/");
        registry.addResourceHandler("/static/images/**").addResourceLocations("file:///C:/weixin/upload/");
    }
}
