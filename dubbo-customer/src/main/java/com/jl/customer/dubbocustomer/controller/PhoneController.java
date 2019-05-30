package com.jl.customer.dubbocustomer.controller;

import com.jl.api.dubboapi.model.Phone;
import com.jl.api.dubboapi.service.IPhoneService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName PhoneController
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/14 21:58
 * @Version 1.0
 */
@RestController
@RequestMapping("/phone")
public class PhoneController {
    @Resource
    private IPhoneService phoneService;

    @Resource
    private IPhoneService phoneService2;

    @RequestMapping("/findById")
    public Phone findById(Long id){
        System.out.println(phoneService2.findById(id));
        return phoneService.findById(id);
    }
}
