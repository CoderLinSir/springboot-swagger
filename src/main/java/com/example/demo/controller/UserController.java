package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linjiaming
 * @date 2021-02-28 21:23
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/v1")
public class UserController {

    @ApiOperation(value = "根据id获取用户")
    @GetMapping("/user/{id}")
    public Result<User> getUserById (
            @ApiParam(name = "id", value = "用户id", required = true)
            @PathVariable Integer id) {
        Result<User> result = new Result<>();
        if (id == 1) {
            User user = new User();
            user.setId(1);
            user.setName("测试");
            user.setAge(18);
            result.setSuccess(true);
            result.setData(user);
            return result;
        }
        result.setSuccess(false);
        result.setCode(10001);
        result.setMessage("用户查询异常");
        return result;
    }
    @ApiOperation(value = "添加用户")
    @PostMapping("/user")
    public Result addUser (@RequestBody User user) {
       Result result = new Result();
       return result;
    }
    @ApiOperation(value = "修改用户")
    @PutMapping("/user")
    public Result updateUser (@RequestBody User user) {
        Result result = new Result();
        return result;
    }
    @ApiOperation(value = "删除用户")
    @DeleteMapping("/user/{id}")
    public Result deleteUser (
            @ApiParam(name = "id", value = "用户id", required = true)
            @PathVariable Integer id) {
        Result result = new Result();
        return result;
    }
}
