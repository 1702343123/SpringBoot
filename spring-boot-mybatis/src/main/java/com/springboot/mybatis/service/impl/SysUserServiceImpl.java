package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.SysUser;
import com.springboot.mybatis.mapper.SysUserMapper;
import com.springboot.mybatis.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/3/18.
 */
@Service
public  class SysUserServiceImpl implements SysUserService{
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectAll() {
        return sysUserMapper.selectAll();
    }

    @Override
    public SysUser getOne(Long userId) {
        return sysUserMapper.getOne(userId);
    }

    @Override
    public void delete(Long userId) {
        sysUserMapper.delete(userId);
    }

    @Override
    public void insert(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }

    @Override
    public void update(SysUser sysUser) {
        sysUserMapper.update(sysUser);
    }
}
