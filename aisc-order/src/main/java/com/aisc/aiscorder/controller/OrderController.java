package com.aisc.aiscorder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author cuishuai
 * @Date 2020/5/12 17:15
 */
@RestController
public class OrderController {

    @RequestMapping("/order/getUserInfo")
    public String getUserInfoInOrder(String userId){
        return null;
    }
}
