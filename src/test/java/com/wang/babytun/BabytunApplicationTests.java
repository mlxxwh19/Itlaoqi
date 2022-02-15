package com.wang.babytun;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class BabytunApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() throws Exception{
        System.out.println("数据库连接为:"+dataSource.getConnection());
    }

}
