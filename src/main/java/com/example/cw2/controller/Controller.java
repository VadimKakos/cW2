package com.example.cw2.controller;

import com.example.cw2.model.Question;
import com.example.cw2.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class Controller {
    private final QuestionService questionService;

    public Controller(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/print")
    public int print() {
        return questionService.getInt();
    }
    @GetMapping("/get")
    public Collection<Question> get() {
        return questionService.get();
    }

}
