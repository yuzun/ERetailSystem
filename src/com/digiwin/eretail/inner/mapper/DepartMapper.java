package com.digiwin.eretail.inner.mapper;

import com.digiwin.eretail.inner.model.Depart;
import com.digiwin.eretail.inner.model.DepartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartMapper {
    int countByExample(DepartExample example);

    int deleteByExample(DepartExample example);

    int deleteByPrimaryKey(String departid);

    int insert(Depart record);

    int insertSelective(Depart record);

    List<Depart> selectByExample(DepartExample example);

    Depart selectByPrimaryKey(String departid);

    int updateByExampleSelective(@Param("record") Depart record, @Param("example") DepartExample example);

    int updateByExample(@Param("record") Depart record, @Param("example") DepartExample example);

    int updateByPrimaryKeySelective(Depart record);

    int updateByPrimaryKey(Depart record);
}