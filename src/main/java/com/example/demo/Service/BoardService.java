package com.example.demo.Service;

import com.example.demo.database.dto.BoardDTO;
import com.example.demo.database.mybatis.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BoardService {

    @Autowired
    private TestMapper testMapper;

    public String TestPage(Model model) {
        model.addAttribute("boardList", testMapper.selectList());
        return "index";
    }

    public String ViewPage(Model model, BoardDTO dto) {
        model.addAttribute("boardView", testMapper.selectById(dto));
        return "view";
    }

    public String UpdatePage(Model model, BoardDTO dto) {
        model.addAttribute("boardUpdate", testMapper.selectById(dto));
        return "update";
    }
    public String UpdateDo(BoardDTO dto) {
        testMapper.update(dto);
        return "redirect:/";
    }
    public String delete(BoardDTO dto) {
        testMapper.delete(dto);
        return "redirect:/";
    }
    public String insert(BoardDTO dto) {
        return "insert";
    }
    public String insertDo(BoardDTO dto) {
        testMapper.insert(dto);
        return "redirect:/";
    }
}
