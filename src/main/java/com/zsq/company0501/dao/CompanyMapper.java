package com.zsq.company0501.dao;

import com.github.pagehelper.Page;
import com.zsq.company0501.dto.CompanyListDto;
import com.zsq.company0501.po.Company;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer companyId);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);

    Page<CompanyListDto> search(String keyword);
}