package com.example.cw2.service;

import com.example.cw2.model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();

    int getInt();
    Question getRandomQuestion();

    Collection<Question> get();
}
