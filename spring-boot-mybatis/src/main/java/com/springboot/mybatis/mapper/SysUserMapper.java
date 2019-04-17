package com.springboot.mybatis.mapper;

import com.springboot.mybatis.entity.SysUser;
import org.apache.ibatis.annotations.*;


import java.util.List;

/**
 * Created by Administrator on 2019/3/18.
 */
public interface SysUserMapper {
    @Results({
            @Result(property = "userId", column = "user_id"),
            @Result(property = "mobile",column = "mobile"),
            @Result(property = "password",column = "password"),
            @Result(property = "userName",column = "username"),
            @Result(property = "avatar",column = "avatar")
    })
    @Select("SELECT * FROM t_sys_user")
    List<SysUser> selectAll();

    @Results({
            @Result(property = "userId", column = "user_id"),
            @Result(property = "mobile",column = "mobile"),
            @Result(property = "password",column = "password"),
            @Result(property = "userName",column = "username"),
            @Result(property = "avatar",column = "avatar")
    })
    @Select("SELECT * FROM t_sys_user WHERE user_id =#{userId}")
    SysUser getOne(Long userId);

    @Delete("DELETE FROM t_sys_user WHERE user_id =#{userId}")
    void delete(Long userId);

    @Insert("INSERT INTO t_sys_user(mobile,password,username,avatar) VALUES(#{mobile},#{password},#{userName},#{avatar})")
    void insert(SysUser sysUser);

    @Update("UPDATE t_sys_user SET password=#{password},username=#{userName} WHERE user_id =#{userId}")
    void update(SysUser sysUser);
}
