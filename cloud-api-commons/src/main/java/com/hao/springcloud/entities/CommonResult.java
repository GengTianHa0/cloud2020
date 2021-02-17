package com.hao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 前后端分离：编码(404) ,String message
 * @param <T>
 *     code:200
 *     message:success
 *     data:(展现的属性信息 设置为T是所有的实体类通用)
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {


    private Integer code;
    private String message;
    private T data;


    //有可能data是null 定义一个两个参数的
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
