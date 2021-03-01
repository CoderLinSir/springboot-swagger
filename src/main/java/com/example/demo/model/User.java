package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author linjiaming
 * @date 2021-02-28 21:23
 */
@Data
@ApiModel
public class User {
    @ApiModelProperty(value = "用户id", dataType = "Integer" , example = "1")
    private Integer id;
    @ApiModelProperty(value = "用户姓名", dataType = "String" , example = "Armin")
    private String name;
    @ApiModelProperty(value = "用户年龄", dataType = "String" , example = "18")
    private Integer age;
}
