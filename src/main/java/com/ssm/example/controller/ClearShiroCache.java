package com.ssm.example.controller;

import com.ssm.example.shiro.CustomRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * <p>Title: ClearShiroCache</p>
 * <p>Description: 手动调用controller清除shiro的缓存</p>
 * <p>Company: www.itcast.com</p>
 *
 * @author Tyler Yin
 * @version 1.0
 * @date 2015-3-25下午4:26:14
 */
@Controller
public class ClearShiroCache {

    //注入realm
    @Autowired
    private CustomRealm customRealm;

    @RequestMapping("/clearShiroCache")
    public String clearShiroCache() {

        //清除缓存，将来正常开发要在service调用customRealm.clearCached()
        customRealm.clearCached();

        return "success";
    }

}
