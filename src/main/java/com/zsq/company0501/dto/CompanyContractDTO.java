package com.zsq.company0501.dto;

import com.zsq.company0501.controller.CompanyAreaIdsVO;
import com.zsq.company0501.po.Contract;

public class CompanyContractDTO {

    private Contract contract;
    private CompanyAreaIdsVO companyAreaIdsVO;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public CompanyAreaIdsVO getCompanyAreaIdsVO() {
        return companyAreaIdsVO;
    }

    public void setCompanyAreaIdsVO(CompanyAreaIdsVO companyAreaIdsVO) {
        this.companyAreaIdsVO = companyAreaIdsVO;
    }
}
