package com.ssm.example.service;

import com.ssm.example.po.ActiveUser;
import com.ssm.example.po.SysPermission;
import com.ssm.example.po.SysUser;

import java.util.List;

/**
 * <p>Title: SysService</p>
 * <p>Description: 认证授权服务接口</p>
 * <p>Company: www.itcast.com</p>
 *
 * @author Tyler Yin
 * @version 1.0
 * @date 2015-3-23上午11:29:48
 */
public interface SysService {

    //根据用户的身份和密码 进行认证，如果认证通过，返回用户身份信息
    ActiveUser authenticat(String userCode, String password) throws Exception;

    //根据用户账号查询用户信息
    SysUser findSysUserByUserCode(String userCode) throws Exception;

    //根据用户id查询权限范围的菜单
    List<SysPermission> findMenuListByUserId(String userid) throws Exception;

    //根据用户id查询权限范围的url
    List<SysPermission> findPermissionListByUserId(String userid) throws Exception;
}
