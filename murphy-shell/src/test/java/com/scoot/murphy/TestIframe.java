package com.scoot.murphy;

import com.scoot.murphy.bussiness.conf.DatasourceConf;
import com.scoot.murphy.bussiness.conf.DefaultConf;
import com.scoot.murphy.shell.MurphyApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MurphyApplication.class)
public class TestIframe {

    @Autowired
    private DatasourceConf datasourceConf;
    @Autowired
    private DefaultConf defaultConf;

    @Test
    public void tstRead() {
        try {
            System.out.println("----------------------------------------------------------------------");

            System.out.println(datasourceConf.getMark());

            System.out.println(defaultConf.getMark());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
