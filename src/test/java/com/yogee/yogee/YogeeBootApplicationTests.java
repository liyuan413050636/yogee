package com.yogee.yogee;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YogeeBootApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private YogeeProperties yogeeProperties;


	@Test
	public void getHello() throws Exception {
		Assert.assertEquals(yogeeProperties.getName(), "jackqth");
		Assert.assertEquals(yogeeProperties.getTitle(), "Spring Boot Demo");
	}
}
