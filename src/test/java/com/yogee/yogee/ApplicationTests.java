package com.yogee.yogee;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Demo class
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = YogeeBootApplication.class)
@WebAppConfiguration
public class ApplicationTests {
//    @Autowired
//    private UserMapper userMapper;

    @Test
    @Rollback
    public void findByName() throws Exception {
//        userMapper.insert("AAA", 20);
//        User u = userMapper.findByName("AAA");
//        Assert.assertEquals(20, u.getAge().intValue());
    }



}
