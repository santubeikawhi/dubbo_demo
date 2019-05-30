package com.jl.api.dubboapi.service;

import com.jl.api.dubboapi.model.Phone;

public interface IPhoneService {
    /**
     * 根据id查找手机
     *
     * @param id
     * @return
     */
    public Phone findById (Long id);
}
