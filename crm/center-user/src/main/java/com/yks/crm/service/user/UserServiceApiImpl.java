package com.yks.crm.service.user;

import com.yks.crm.pojo.user.UserInfo;
import org.springframework.stereotype.Service;

/**
 * Created by wanglong on 16-2-6.
 */
@Service("userServiceApi")
public class UserServiceApiImpl implements UserServiceApi{
    public UserInfo findUserInfoByLoginName(String loginName) {
        return null;
    }

    public void saveUserInfo(UserInfo userInfo) {

    }

    public void delUserInfoById(Long id) {

    }

    public void updateUserInfo(UserInfo userInfo) {

    }
}
