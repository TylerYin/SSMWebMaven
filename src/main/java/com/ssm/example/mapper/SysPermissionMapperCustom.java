package com.ssm.example.mapper;

import com.ssm.example.po.SysPermission;

import java.util.List;

/**
 * <p>Title: SysPermissionMapperCustom</p>
 * <p>Description: 权限mapper</p>
 * <p>Company: www.itcast.com</p>
 *
 * @author Tyler Yin
 * @version 1.0
 * @date 2015-3-23下午2:55:28
 */
public interface SysPermissionMapperCustom {

    //根据用户id查询菜单
    public List<SysPermission> findMenuListByUserId(String userid) throws Exception;

    //根据用户id查询权限url
    public List<SysPermission> findPermissionListByUserId(String userid) throws Exception;

}
