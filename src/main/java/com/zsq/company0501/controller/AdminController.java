package com.zsq.company0501.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zsq.company0501.dao.AdminMapper;
import com.zsq.company0501.dao.AreaMapper;
import com.zsq.company0501.dao.CompanyMapper;
import com.zsq.company0501.dao.ContractMapper;
import com.zsq.company0501.dto.CompanyListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

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



        return null;
    }

}
