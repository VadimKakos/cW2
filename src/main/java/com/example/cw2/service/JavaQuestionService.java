package com.example.cw2.service;

import com.example.cw2.model.Question;
import com.example.cw2.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class JavaQuestionService implements QuestionService {

private final QuestionRepository questionRepository;

    public JavaQuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Collection<Question> get() {
        return questionRepository.getAll();
    }

    @Override
    public int getInt() {
        return questionRepository.getAll().size();
    }


    @Override
    public Question add(String question, String answer) {
        return null;
    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }


    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
