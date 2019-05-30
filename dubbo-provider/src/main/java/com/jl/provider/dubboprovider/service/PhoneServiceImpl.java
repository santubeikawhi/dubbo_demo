package com.jl.provider.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jl.api.dubboapi.model.Phone;
import com.jl.api.dubboapi.service.IPhoneService;

import java.math.BigDecimal;

/**
 * @ClassName PhoneServiceImpl
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/14 21:52
 * @Version 1.0
 */
@Service(version = "1.0.0")
public class PhoneServiceImpl implements IPhoneService {

    @Override
    public Phone findById(Long id) {
        Phone phone = new Phone();
        phone.setId(id);
        phone.setName("iphonex");
        phone.setPrice(BigDecimal.valueOf(8848.88));
        return phone;
    }
}
