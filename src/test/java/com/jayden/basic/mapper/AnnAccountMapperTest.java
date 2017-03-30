package com.jayden.basic.mapper;

import com.jayden.basic.domain.AnnAccountDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by za-xujianjun on 2017/3/29.
 */
/*
 * 1.@RunWith(SpringRunner.class) tells JUnit to run using Spring’s testing support.
 * 2.SpringRunner is the new name for SpringJUnit4ClassRunner,
 * it’s just a bit easier on the eye.
*/
@RunWith(SpringRunner.class)
/*
 * @SpringBootTest is saying “bootstrap with Spring Boot’s support”
 * (e.g. load application.properties and give me all the Spring Boot goodness)
 */
@SpringBootTest
public class AnnAccountMapperTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(AnnAccountMapperTest.class);

    @Autowired
    private AnnAccountMapper annAccountMapper;

    @Test
    public void getAnnAccountListTest() {
        List<AnnAccountDO> list = annAccountMapper.getAnnAccountList();
        LOGGER.info("Result:{}", list);
    }
}
