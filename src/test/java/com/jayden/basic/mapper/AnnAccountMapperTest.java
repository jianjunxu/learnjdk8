package com.jayden.basic.mapper;

import com.jayden.basic.domain.AnnAccountDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by za-xujianjun on 2017/3/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnAccountMapperTest {
    @Autowired
    private AnnAccountMapper annAccountMapper;

    @Test
    public void getAnnAccountListTest(){
        List<AnnAccountDO> list = annAccountMapper.getAnnAccountList();
        System.out.println(list.toString());
    }
}
