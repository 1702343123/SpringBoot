package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.SysUser;
import com.springboot.mybatis.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/3/18.
 */
@RestController
@RequestMapping(value = "api")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

//    查询所有user
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<SysUser> selectAll(){
        return sysUserService.selectAll();
    }

//    根据id查询user
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public SysUser getOne(@PathVariable("id") long id){
        return sysUserService.getOne(id);
    }

//    根据id删除user
    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") long id){
        sysUserService.delete(id);
    }

//    插入user
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public void addUser(@RequestBody SysUser sysUser){
        sysUserService.insert(sysUser);
    }

//    更改user
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public void updateUser(@RequestBody SysUser sysUser){
        sysUserService.update(sysUser);
    }
}
