package com.yks.crm.dao;

import com.yks.crm.pojo.user.UserInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by wanglong on 16-2-14.
 */
public interface UserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
