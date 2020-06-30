package com.yzg.gsms.common;

import lombok.Data;

@Data
public class ResultMessage {
    private int flag;
    private String message;
    private Object data;

    public ResultMessage(int flag, String message, Object data){
        this.flag = flag;
        this.message = message;
        this.data = data;
    }
}
