package com.xkcoding.orm.mybatis.mapper;


import com.xkcoding.orm.mybatis.entity.PersonalPhone;

public interface PersonalPhoneMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PersonalPhone record);

    int insertSelective(PersonalPhone record);

    PersonalPhone selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PersonalPhone record);

    int updateByPrimaryKey(PersonalPhone record);
}
