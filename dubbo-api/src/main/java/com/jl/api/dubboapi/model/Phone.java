package com.jl.api.dubboapi.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/14 21:48
 * @Version 1.0
 */
public class Phone implements Serializable {
    // 主键id
    private Long       id;
    // 手机名称
    private String     name;
    // 价格
    private BigDecimal price;

    public Phone() {
    }

    public Phone(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
