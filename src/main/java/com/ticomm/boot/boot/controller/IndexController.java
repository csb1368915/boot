package com.ticomm.boot.boot.controller;

import com.ticomm.boot.boot.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @Author: Mr.chen
 * @Date: 2020/06/22 16:56
 */
@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    /**
     * 
     * @Author: Mr.chen
     * @Date: 2020/06/22 16:55
     */
    @GetMapping(value = {"","/"})
    public String index(){
        System.out.println(userMapper.getById("1").getId());
        return "index";
    }
}
