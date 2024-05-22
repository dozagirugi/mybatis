package com.mysite.mybatis.mapper;

import com.mysite.mybatis.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select* from user where id=#{id}")
    public User getUser(String id);

    // 모든 유저 리스트 리턴
    @Select("select * from user")
    public List<User> getUsers();

    // 새 유저 입력
    @Insert("insert into user values (#{id},#{name},#{phone},#{address})")
    public int insertUser(String id, String name, String phone, String address);

    // 유저 업데이트
    @Update("update user SET name=#{name}, phone=#{phone}, address=#{address} where id=#{id}")
    public int updateUser(String id, String name, String phone, String address);

    @Delete("delete from user where id=#{id}")
    public int deleteUser(String id);
}
