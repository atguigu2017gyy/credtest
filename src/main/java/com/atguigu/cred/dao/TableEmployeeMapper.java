package com.atguigu.cred.dao;

import com.atguigu.cred.bean.TableEmployee;
import com.atguigu.cred.bean.TableEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableEmployeeMapper {
    long countByExample(TableEmployeeExample example);

    int deleteByExample(TableEmployeeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(TableEmployee record);

    int insertSelective(TableEmployee record);

    List<TableEmployee> selectByExample(TableEmployeeExample example);

    TableEmployee selectByPrimaryKey(Integer empId);

    int updateByExampleSelective(@Param("record") TableEmployee record, @Param("example") TableEmployeeExample example);

    int updateByExample(@Param("record") TableEmployee record, @Param("example") TableEmployeeExample example);

    int updateByPrimaryKeySelective(TableEmployee record);

    int updateByPrimaryKey(TableEmployee record);
}