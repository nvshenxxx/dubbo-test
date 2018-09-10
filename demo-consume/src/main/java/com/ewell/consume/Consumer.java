package com.ewell.consume;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ewell.MedoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hj on 2018/9/6.
 */
@RestController
public class Consumer {

    @Reference
    private MedoService medoService;
    @Value("${com.llc.name}")
    private String name;

    @RequestMapping("autopro")
    public String Autopro(){
        System.out.print(name);
        return name;
    }

    @RequestMapping("/hello")
    public String Hello(){
        return medoService.getName();
    }

}
