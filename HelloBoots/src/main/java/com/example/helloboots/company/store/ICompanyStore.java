package com.example.helloboots.company.store;

import com.example.helloboots.company.entity.Company;
import com.example.helloboots.company.vo.CompanyRequestVO;

import java.util.List;

public interface ICompanyStore {
    String create(Company item);
    void update(Company item);
    void delete(String id);

    Company retreieve(String id);
    List<Company> retreieveAll(CompanyRequestVO vo);
}
