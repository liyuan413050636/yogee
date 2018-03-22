package com.yogee.yogee;

import org.beetl.core.resource.WebAppResourceLoader;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

/**
 * Yogee2——Power By Yogee
 *
 * @author Jackqth
 * @date 2018/3/20
 */
@SpringBootApplication
@EnableScheduling
public class YogeeBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(YogeeBootApplication.class, args);
    }

}
