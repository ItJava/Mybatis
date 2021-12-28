package com.deling.mybatis.mapper.dao;

import com.deling.mybatis.hello.bean.Employee;

public interface EmployeeMapper {

       Employee getEmpById(int id);
       void addEmp(Employee employee);
       void updateEmp(Employee employee);
       void deleteEmpById(Integer id);

}
