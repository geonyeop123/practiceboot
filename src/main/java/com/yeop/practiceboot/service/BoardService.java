package com.yeop.practiceboot.service;


import com.yeop.practiceboot.data.vo.BoardVO;
import com.yeop.practiceboot.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public BoardVO list(BoardVO boardVO){
        return null;
    }
}
