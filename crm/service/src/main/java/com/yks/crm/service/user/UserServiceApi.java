package com.yks.crm.service.user;

import com.yks.crm.pojo.user.UserInfo;

/**
 * Created by wanglong on 16-2-6.
 */
public interface UserServiceApi {
    UserInfo findUserInfoByLoginName(String loginName);
    int saveUserInfo(UserInfo userInfo);
    int delUserInfoById(Long id);
    int updateUserInfo(UserInfo userInfo);
}
