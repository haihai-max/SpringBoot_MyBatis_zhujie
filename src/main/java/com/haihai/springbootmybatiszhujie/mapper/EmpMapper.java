package com.haihai.springbootmybatiszhujie.mapper;

import com.haihai.springbootmybatiszhujie.bean.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EmpMapper {

    @Select("select * from emp where eid=#{eid}")
    public Emp getEmpById(int eid);

    @Delete("delete from emp where eid=#{eid}")
    public int deleteEmpById(int eid);

    @Insert("insert into emp values(#{eid},#{ename})")
    public int inertEmp(Emp emp);

    @Update("update emp set ename=#{ename} where eid=#{eid}")
    public int updateEmp(Emp emp);
}
