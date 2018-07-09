package com.yanfei.scaffolding.privilege.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by : yanfei
 * Created time : 18/6/22 上午10:58
 */
@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean crosFilter(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        //注入过滤器
        registration.setFilter(new CrosFilter());
        //拦截规则
        registration.addUrlPatterns("/*");
        //过滤器名称
        registration.setName("crosFilter");
        //是否自动注册 false 取消Filter的自动注册
        registration.setEnabled(true);
        //过滤器顺序
        registration.setOrder(1);
        return registration;
    }

}
