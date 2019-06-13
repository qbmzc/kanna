package com.congco.kannadata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author congco
 * @date 19-6-13 下午3:37
 */
@RestController
@RequestMapping("hi")
public class DataController {

    /**
     * 测试
     * @return
     */
    @GetMapping
    public String sayHi(){
        return "I'm from data";
    }
}
