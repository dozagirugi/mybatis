package com.mysite.mybatis.mapper;

import com.mysite.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface UserMapper {

    @Select("select+from user where id=#{id}")
    public User getUser(String id);

}
