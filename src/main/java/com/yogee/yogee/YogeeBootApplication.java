package com.yogee.yogee;


import com.yogee.yogee.module.sys.service.SystemService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Yogee2——Power By Yogee
 *
 * @author Jackqth
 * @date 2018/3/20
 */
@EnableCaching
@SpringBootApplication
@EnableScheduling
@ServletComponentScan("com.yogee.yogee")
@ComponentScan(value = "com.yogee.yogee",lazyInit = true)
public class YogeeBootApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(YogeeBootApplication.class).web(true).run(args);
        SystemService.printKeyLoadMessage();

//        SpringApplication.run(YogeeBootApplication.class, args);
    }

}
