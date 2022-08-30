package com.example.helloboots.company.store.impl;

import com.example.helloboots.company.store.ICompanyStore;
import com.example.helloboots.company.entity.Company;
import com.example.helloboots.company.vo.CompanyRequestVO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class CompanyStore implements ICompanyStore {
    private final Map<String, Company> companyMap;

    public CompanyStore() {
        this.companyMap = new HashMap<>();
    }

    @Override
    public String create(Company item) {
        this.companyMap.put(item.getCompId(), item);
        return item.getCompId();
    }

    @Override
    public void update(Company item) {
        this.companyMap.put(item.getCompId(), item);
    }

    @Override
    public void delete(String id) {
        this.companyMap.remove(id);
    }

    @Override
    public Company retreieve(String id) {
        return this.companyMap.get(id);
    }

    @Override
    public List<Company> retreieveAll(CompanyRequestVO vo) {
        var stream = this.companyMap.values().stream();
        if(!vo.getCompNm().isEmpty()) stream.filter(m -> m.getCompNm().contains(vo.getCompNm()));
        if(!vo.getCompTel().isEmpty()) stream.filter(m -> m.getCompTel().equals(vo.getCompTel()));
        return stream.collect(Collectors.toList());
    }
}
