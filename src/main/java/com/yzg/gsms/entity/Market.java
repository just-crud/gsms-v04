package com.yzg.gsms.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Market {
    private String id;
    private String name;
    private String address;
    private String owner;
    private String gaffer;
    private Integer isEnabled;
    private String creator;
    private Date createTime;
    private String lastModifier;
    private Date lastModifierTime;
    private int sequence;
}
