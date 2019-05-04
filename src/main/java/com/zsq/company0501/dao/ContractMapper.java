package com.zsq.company0501.dao;

import com.zsq.company0501.po.Contract;

public interface ContractMapper {
    int deleteByPrimaryKey(Integer companyId);

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}