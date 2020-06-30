package com.yzg.gsms.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods {
    private String id;
    private String name;
    private String marketId;
    private BigDecimal price;
    private Integer quantity;
}
