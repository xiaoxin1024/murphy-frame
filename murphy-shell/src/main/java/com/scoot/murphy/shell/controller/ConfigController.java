package com.scoot.murphy.shell.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by TDUser on 2017/4/12.
 */
@Controller
@RequestMapping("/demo")
public class ConfigController {
    protected static final Logger LOG = LoggerFactory.getLogger(ConfigController.class.getCanonicalName());

    @RequestMapping("/")
    public @ResponseBody String server(ModelMap map) {
        try {
            return "success";
        }
        catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }

        return "error";
    }

}
