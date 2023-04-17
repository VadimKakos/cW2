package com.example.cw2.repository;

import com.example.cw2.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
}
