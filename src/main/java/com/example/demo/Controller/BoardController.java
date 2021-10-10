package com.example.demo.Controller;


import com.example.demo.Service.BoardService;
import com.example.demo.database.dto.BoardDTO;
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
}