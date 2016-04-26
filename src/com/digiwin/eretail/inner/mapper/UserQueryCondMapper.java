package com.digiwin.eretail.inner.mapper;

import com.digiwin.eretail.inner.model.UserQueryCond;
import com.digiwin.eretail.inner.model.UserQueryCondExample;
import com.digiwin.eretail.inner.model.UserQueryCondKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserQueryCondMapper {
    int countByExample(UserQueryCondExample example);

    int deleteByExample(UserQueryCondExample example);

    int deleteByPrimaryKey(UserQueryCondKey key);

    int insert(UserQueryCond record);

    int insertSelective(UserQueryCond record);

    List<UserQueryCond> selectByExample(UserQueryCondExample example);

    UserQueryCond selectByPrimaryKey(UserQueryCondKey key);

    int updateByExampleSelective(@Param("record") UserQueryCond record, @Param("example") UserQueryCondExample example);

    int updateByExample(@Param("record") UserQueryCond record, @Param("example") UserQueryCondExample example);

    int updateByPrimaryKeySelective(UserQueryCond record);

    int updateByPrimaryKey(UserQueryCond record);
}