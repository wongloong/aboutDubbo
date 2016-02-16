package com.yks.crm.service.user;

import com.yks.crm.dao.UserInfoMapper;
import com.yks.crm.pojo.user.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wanglong on 16-2-6.
 */
@Service("userService")
public class UserServiceApiImpl implements UserServiceApi {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo findUserInfoByLoginName(String loginName) {
        return null;
    }

    public int saveUserInfo(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
        return 0;
    }

    public int delUserInfoById(Long id) {
        return 0;
    }

    public int updateUserInfo(UserInfo userInfo) {
        return 0;
    }
}
