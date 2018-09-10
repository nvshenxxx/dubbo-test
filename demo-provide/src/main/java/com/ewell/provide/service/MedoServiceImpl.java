package com.ewell.provide.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.ewell.MedoService;

/**
 * Created by hj on 2018/9/7.
 */
@Service
public class MedoServiceImpl implements MedoService {
    @Override
    public String getName() {
        return "hello";
    }
}
