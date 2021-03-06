package com.changex.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.changex.blog.core.pojo.TSysUser;
import com.changex.blog.core.pojo.dto.UserDTO;
import com.changex.blog.mapper.base.TSysUserMapper;
import com.changex.blog.service.TSysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Xie Chenxi
 * @Date 2018/11/21 20:18
 */
@Service
public class TSysUserServiceImpl extends ServiceImpl<TSysUserMapper, TSysUser> implements TSysUserService {

    @Resource
    private TSysUserMapper sysUserMapper;

    @Override
    public TSysUser getByUserName(String userName) {

        TSysUser sysUser = new TSysUser();
        sysUser.setUserName(userName);

        return sysUserMapper.selectOne(Wrappers.query(sysUser));
    }

    @Override
    public boolean save(UserDTO userDTO) {
        TSysUser sysUser = new TSysUser();

        BeanUtils.copyProperties(userDTO, sysUser);
        return super.save(sysUser);
    }

    @Override
    public List<TSysUser> queryUser(TSysUser user) {
        QueryWrapper<TSysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().notIn(TSysUser::getId,user.getId());
        return super.list(queryWrapper);
    }
}
