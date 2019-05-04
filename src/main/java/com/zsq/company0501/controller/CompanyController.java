package com.zsq.company0501.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zsq.company0501.dao.AdminMapper;
import com.zsq.company0501.dao.AreaMapper;
import com.zsq.company0501.dao.CompanyMapper;
import com.zsq.company0501.dao.ContractMapper;
import com.zsq.company0501.dto.CompanyContractDTO;
import com.zsq.company0501.dto.CompanyListDto;
import com.zsq.company0501.po.Area;
import com.zsq.company0501.po.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.LinkedList;

@Controller
@RequestMapping("/company")
@CrossOrigin
public class CompanyController {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AreaMapper areaMapper;

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private ContractMapper contractMapper;

    @GetMapping("/search")
    public PageInfo<CompanyListDto> search(@RequestParam(required = false, defaultValue = "") Integer pageNum,
                                           @RequestParam(required = false, defaultValue = "1") String keyword){
        PageHelper.startPage(pageNum,2);
        //条件查询
        Page<CompanyListDto> companyListDtos = companyMapper.search(keyword);

        for (CompanyListDto companyListDto : companyListDtos) {

            LinkedList<Area> areas = new LinkedList<>();
            //得到地區ID
            Integer tempAreaId = companyListDto.getAreaId();
            //判断tempId
            while (tempAreaId != null && tempAreaId != 0) {
                //根据areaId查找area
                Area area = areaMapper.selectParent(tempAreaId);
                areas.add(area);
                tempAreaId = area.getParentId();

            }

            Collections.reverse(areas);

            companyListDto.setAreas(areas);
        }
        PageInfo<CompanyListDto> companyListDtoPageInfo = companyListDtos.toPageInfo();

        return companyListDtoPageInfo;
    }

    @GetMapping("/create")
    public Integer create(@RequestBody Company company) {
        companyMapper.insert(company);
        Integer companyId = company.getCompanyId();
        return companyId;
    }

    @GetMapping("/getById")
    public CompanyContractDTO getById(@RequestParam Integer companyId){
        CompanyContractDTO companyContractDTO = new CompanyContractDTO();

        Company company = companyMapper.selectByPrimaryKey(companyId);
        CompanyAreaIdsVO companyAreaIdsVO = new CompanyAreaIdsVO();
        companyAreaIdsVO.setCompany(company);

        LinkedList<Integer> areaIds = new LinkedList<>();

        return null;
    }

}
