package com.digiwin.eretail.inner.mapper;

import com.digiwin.eretail.inner.model.TicketType;
import com.digiwin.eretail.inner.model.TicketTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketTypeMapper {
    int countByExample(TicketTypeExample example);

    int deleteByExample(TicketTypeExample example);

    int deleteByPrimaryKey(String tickettypeid);

    int insert(TicketType record);

    int insertSelective(TicketType record);

    List<TicketType> selectByExample(TicketTypeExample example);

    TicketType selectByPrimaryKey(String tickettypeid);

    int updateByExampleSelective(@Param("record") TicketType record, @Param("example") TicketTypeExample example);

    int updateByExample(@Param("record") TicketType record, @Param("example") TicketTypeExample example);

    int updateByPrimaryKeySelective(TicketType record);

    int updateByPrimaryKey(TicketType record);
}