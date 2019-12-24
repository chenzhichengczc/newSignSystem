package com.hc.modules.user.controller;


import com.hc.model.ResultMap;
import com.hc.modules.user.mapper.RoleUserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 *
 * @Author
 * @Description user角色权限controller
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private RoleUserMapper userMapper;

    @Resource
    private ResultMap resultMap;

}
