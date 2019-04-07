package com.htc.ganerator_main.mapper;

import com.htc.ganerator_main.pojo.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(User record);

    User selectByPrimaryKey(String uid);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}