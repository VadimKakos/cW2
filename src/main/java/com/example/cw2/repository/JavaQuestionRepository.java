package com.example.cw2.repository;

import com.example.cw2.model.Question;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Repository
public class JavaQuestionRepository implements QuestionRepository {
    private final Set<Question> questions = new HashSet<>();

    @PostConstruct
    private void init() {
        questions.add(new Question("question", "answer"));
        questions.add(new Question("question1", "answer1"));
        questions.add(new Question("question2", "answer2"));
        questions.add(new Question("question3", "answer3"));
        questions.add(new Question("question4", "answer4"));
        questions.add(new Question("question5", "answer5"));
    }

    public int getInt() {
        int x = 1;
        return x;
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
        return questions;
    }
}
