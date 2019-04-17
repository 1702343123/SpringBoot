package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.SysUser;

import java.util.List;

/**
 * Created by Administrator on 2019/3/18.
 */
public interface SysUserService {
    List<SysUser> selectAll();

    SysUser getOne(Long userId);

    void delete(Long userId);

    void insert(SysUser sysUser);

    void update(SysUser sysUser);

}
