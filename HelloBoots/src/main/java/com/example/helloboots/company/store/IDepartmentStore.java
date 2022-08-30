package com.example.helloboots.company.store;

import com.example.helloboots.company.entity.Department;

import java.util.List;

public interface IDepartmentStore {
    String create(Department item);
    void update(Department item);
    void delete(Department item);

    Department retreieve(String id);
    List<Department> retreieveAll();
}
