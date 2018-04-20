package com.yogee.yogee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Yogee2——Power By Yogee
 *
 * @author Jackqth
 * @date 2018/3/22
 */

@Controller
public class IndexController {

    @RequestMapping("/home")
    public String index(ModelMap map){
        map.addAttribute("name","jackqth");
        return "views/index.html";
    }

    @RequestMapping("/login")
    public String login(ModelMap map){
        map.addAttribute("name","jackqth");
        return "login.html";
    }

}
