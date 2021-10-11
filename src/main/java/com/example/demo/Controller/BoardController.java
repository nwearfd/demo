package com.example.demo.Controller;


import com.example.demo.Service.BoardService;
import com.example.demo.database.dto.BoardDTO;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BoardController {
    @Autowired
    private BoardService boardService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String MainPage(Model model) {
        return boardService.TestPage(model);
    }
    @RequestMapping(value = "view")
    public String ViewPage(Model model, BoardDTO dto) {
        return boardService.ViewPage(model, dto);
    }
    @RequestMapping(value = "update")
    public String UpdatePage(Model model, BoardDTO dto) {
        return boardService.UpdatePage(model, dto);
    }
    @RequestMapping(value = "update.do", method = RequestMethod.POST)
    public String UpdateDo(BoardDTO dto) {
        return boardService.UpdateDo(dto);
    }
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String delete(BoardDTO dto) {
        return boardService.delete(dto);
    }
    @RequestMapping(value = "insert")
    public String insert(BoardDTO dto){
        return boardService.insert(dto);
    }
    @RequestMapping(value = "insert.do", method = RequestMethod.POST)
    public String insertDo(BoardDTO dto) {
        return boardService.insertDo(dto);
    }
}