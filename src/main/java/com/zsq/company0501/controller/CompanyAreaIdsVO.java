package com.zsq.company0501.controller;

import com.zsq.company0501.po.Company;

import java.util.List;

public class CompanyAreaIdsVO {

    private Company company;
    private List<Integer> areaIds;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Integer> getAreaIds() {
        return areaIds;
    }

    public void setAreaIds(List<Integer> areaIds) {
        this.areaIds = areaIds;
    }
}
