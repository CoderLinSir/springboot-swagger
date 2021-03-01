package com.example.demo.model.base;

import lombok.Data;

/**
 * @author linjiaming
 * @date 2021-02-28 21:23
 */
@Data
public class Result<T> {
    /**
     * 是否成功
     */
    protected boolean success = true;
    /**
     * 返回码
     */
    protected Integer code;
    /**
     *
     */
    protected String message;

    /**
     * 返回数据
     */
    protected T data;

}
