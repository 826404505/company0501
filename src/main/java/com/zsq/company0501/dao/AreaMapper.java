package com.zsq.company0501.dao;

import com.zsq.company0501.po.Area;
import org.apache.ibatis.annotations.Param;

public interface AreaMapper {
    int deleteByPrimaryKey(Integer areaId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer areaId);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

    Area selectParent(@Param("parentId") Integer parentId);
}