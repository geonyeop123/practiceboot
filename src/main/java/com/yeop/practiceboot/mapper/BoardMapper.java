package com.yeop.practiceboot.mapper;

import com.yeop.practiceboot.data.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int listCount(BoardVO boardVO);
}
