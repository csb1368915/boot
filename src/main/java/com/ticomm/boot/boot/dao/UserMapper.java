package com.ticomm.boot.boot.dao;

import com.ticomm.boot.boot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 
 * @Author: Mr.chen
 * @Date: 2020/06/22 17:34
 */
public interface UserMapper {

    @Select("select id from t_u where id=#{id}")
    public User getById(@Param("id") String id);

}
