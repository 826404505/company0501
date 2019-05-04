package com.zsq.company0501.dto;

import com.zsq.company0501.po.Area;

import java.util.List;

public class CompanyListDto {

    private Integer companyId;
    private String code;
    private String name;
    private Integer areaId;
    private List<Area> areas;
    private Boolean contracted;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public Boolean getContracted() {
        return contracted;
    }

    public void setContracted(Boolean contracted) {
        this.contracted = contracted;
    }
}
