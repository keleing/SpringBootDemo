package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.Display;
import com.example.springbootdemo.entity.DisplayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisplayMapper {
    long countByExample(DisplayExample example);

    int deleteByExample(DisplayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Display row);

    int insertSelective(Display row);

    List<Display> selectByExample(DisplayExample example);

    Display selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Display row, @Param("example") DisplayExample example);

    int updateByExample(@Param("row") Display row, @Param("example") DisplayExample example);

    int updateByPrimaryKeySelective(Display row);

    int updateByPrimaryKey(Display row);
}