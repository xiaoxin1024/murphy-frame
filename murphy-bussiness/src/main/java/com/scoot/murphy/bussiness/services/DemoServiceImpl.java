package com.scoot.murphy.bussiness.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.scoot.murphy.api.demo.dto.DemoVersion;
import com.scoot.murphy.api.demo.inter.DemoService;

import java.util.Date;

/**
 * Created by TDUser on 2017/4/6.
 */
@Service
public class DemoServiceImpl implements DemoService {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DemoService.class);

    public String getDemoVersion() {

        LOG.info("-----------------------------  recive request!");

        DemoVersion dv = new DemoVersion();
        dv.setCreateTime(new Date());
        dv.setNum(0);
        dv.setVersion("1.0.0");

        return JSON.toJSONString(dv);
    }

}
