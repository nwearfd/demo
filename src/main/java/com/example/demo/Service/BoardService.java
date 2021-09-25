package com.example.demo.Service;

import com.example.demo.database.mybatis.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BoardService {

    @Autowired
    private TestMapper testMapper;

    public String TestPage(Model model) {
        return "index";
    }
}
