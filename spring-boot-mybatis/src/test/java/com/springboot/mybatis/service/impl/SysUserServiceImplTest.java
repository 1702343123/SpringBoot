package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.SysUser;
import com.springboot.mybatis.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/3/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {
    @Resource
    private SysUserService sysUserService;

    @Test
    public void selectAll() throws Exception {
        List<SysUser> userList=sysUserService.selectAll();
        userList.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public void getOne() throws Exception {
        SysUser sysUser=sysUserService.getOne(1L);
        System.out.println(sysUser);
    }

    @Test
    public void delete() throws Exception {
        sysUserService.delete(5L);
    }

    @Test
    public void insert() throws Exception {
        SysUser sysUser=new SysUser();
        sysUser.setMobile("13536577588");
        sysUser.setPassword("111111");
        sysUser.setUserName("abc");
        sysUser.setAvatar("abc.jpg");
        sysUserService.insert(sysUser);
    }

    @Test
    public void update() throws Exception {
        SysUser sysUser=sysUserService.getOne(2L);
        sysUser.setPassword("34654");
        sysUser.setUserName("bbbcc");
        sysUserService.update(sysUser);
    }

}