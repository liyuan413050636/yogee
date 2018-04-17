package com.yogee.yogee.module.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Yogee2——Power By Yogee
 *
 * @author Jackqth
 * @date 2018/3/23
 */

@Controller
@RequestMapping("${adminPath}/sys/profile")
public class SysUser {

    public String profile(ModelMap map){
        map.put("name","jackqth");
        map.put("avatar","http://localhost:8080/image/123.jpg");
        return "sys/profile.html";
    }

    @RequestMapping("/sysuserList")
    public String sysuser(ModelMap map){
        map.put("name","jackqth");
        map.put("avatar","http://localhost:8080/image/123.jpg");
        return "sys/sysuser.html";
    }
}
