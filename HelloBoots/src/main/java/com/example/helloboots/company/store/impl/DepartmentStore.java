package com.example.helloboots.company.store.impl;

import com.example.helloboots.company.entity.Department;
import com.example.helloboots.company.store.IDepartmentStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DepartmentStore implements IDepartmentStore {
    private final Map<String, Department> departmentMap;

    public DepartmentStore() {
        this.departmentMap = new HashMap<>();
    }

    @Override
    public String create(Department item) {
        return null;
    }

    @Override
    public void update(Department item) {

    }

    @Override
    public void delete(Department item) {

    }

    @Override
    public Department retreieve(String id) {
        return null;
    }

    @Override
    public List<Department> retreieveAll() {
        return null;
    }
}
