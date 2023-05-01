package com.example.cw2.controller;

import com.example.cw2.model.Question;
import com.example.cw2.service.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ExamController {

    private final ExaminerServiceImpl examinerService;

    public ExamController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}")
    public Collection<Question> gqtQuestions(@PathVariable("amount") Integer amount) {

        return examinerService.getQuestions(amount);
    }

}
