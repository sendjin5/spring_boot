package com.chunjae.test07.ctrl;


import com.chunjae.test07.biz.boardService;
import com.chunjae.test07.entity.Board;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/board/*")
public class boardCtrl {

    @Autowired
    private boardService boardService;

    @GetMapping("/List")
    public String boardList(Model model) {
        List<Board> boardList = boardService.boardList();
        model.addAttribute("boardList", boardList);
        return "/board/boardList";
    }

    @GetMapping("/Get")
    public String boardget(Model model, @RequestParam int no){
        Board board = boardService.boardGet(no);
        model.addAttribute("board", board);
        return "/board/boardGet";
    };

    @GetMapping("/Add")
    public String boardform(){
        return "/board/boardForm";
    };

    @PostMapping("/Add")
    public String boardAdd(Board board){
        boardService.boardAdd(board);
        return "redirect:/board/List";
    };

    @GetMapping("/Del")
    public String boardDel(int no){
        boardService.boardDel(no);
        return "redirect:/board/List";
    };

}
