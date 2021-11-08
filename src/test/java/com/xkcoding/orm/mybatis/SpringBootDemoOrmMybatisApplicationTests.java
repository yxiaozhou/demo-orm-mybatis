package com.xkcoding.orm.mybatis;

import com.xkcoding.orm.mybatis.entity.PersonalPhone;
import com.xkcoding.orm.mybatis.mapper.PersonalPhoneMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoOrmMybatisApplication.class)
public class SpringBootDemoOrmMybatisApplicationTests {

    @Autowired
    private PersonalPhoneMapper personalPhoneMapper;

    @Test
    public void addPhone(){

        PersonalPhone record = new PersonalPhone();
        record.setPhoneNumber("123123");
        record.setArea("111");
        personalPhoneMapper.insertSelective(record);

    }

}
