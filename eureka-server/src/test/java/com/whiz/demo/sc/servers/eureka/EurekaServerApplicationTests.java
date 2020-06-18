
package com.whiz.demo.sc.servers.eureka;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaServerApplicationTests {

    @Test
    public void contextLoads() {
        assertEquals(new Integer(100), Integer.valueOf("100"));
    }
}