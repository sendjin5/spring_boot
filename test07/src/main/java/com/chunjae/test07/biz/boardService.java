package com.chunjae.test07.biz;

import com.chunjae.test07.entity.Board;
import com.chunjae.test07.persis.BoardMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class boardService {

    @Autowired
    private BoardMapper boardMapper;

    public List<Board> boardList(){
     return boardMapper.boardList();
    }

    public Board boardGet(int no){
        return boardMapper.boardGet(no);
    }

    public void boardAdd(Board board){
        boardMapper.boardAdd(board);

    };
    public void boardDel(int no){
        boardMapper.boardDel(no);
    };
}
