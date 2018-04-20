package com.yogee.yogee.module.sys.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 主页
 * @author Liyuan
 * @version 2018-03-08
 */
@Controller
public class IndexConteoller {
    @Value("${adminPath:/a}")
    private String adminpath;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:" + adminpath + "/login";
    }
}
