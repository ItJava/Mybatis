package com.deling.mybatis.mapper.dao;

import com.deling.mybatis.hello.bean.Employee;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapperAnation {

    @Select(" select * from tbl_employee where id = #{id}")
    Employee getEmpById(int id);

}
