package com.example.demo.database.mybatis;

import com.example.demo.database.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<BoardDTO> findAll();
}
