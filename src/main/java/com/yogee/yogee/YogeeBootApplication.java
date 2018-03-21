package com.yogee.yogee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

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
