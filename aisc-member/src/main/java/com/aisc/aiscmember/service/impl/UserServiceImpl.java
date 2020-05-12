package com.aisc.aiscmember.service.impl;

import com.aisc.aiscmember.mapper.AiscUserMapper;
import com.aisc.aiscmember.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author cuishuai
 * @Date 2020/5/12 16:29
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AiscUserMapper aiscUserMapper;
    @Override
    public String getUserInfoById(String userId) {
        return aiscUserMapper.getUserInfoById(Integer.valueOf(userId));
    }
}
