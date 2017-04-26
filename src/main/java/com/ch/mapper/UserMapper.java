package com.ch.mapper;

import com.ch.domain.User;
import com.ch.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by chenhao on 2017/4/25.
 */
@Mapper
public interface UserMapper extends MyMapper<User> {


        @Select("select * from User where username = #{username}")
        User findByUsername(@Param("username") String username);

        User findById(@Param("id") int id);

}
