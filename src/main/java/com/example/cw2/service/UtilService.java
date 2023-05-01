package com.example.cw2.service;

import com.example.cw2.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;

@Component
public class UtilService {
    private Random random;


    public void setRandom(Random random) {
        this.random = random;
    }

    public int getRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public Question getRandomQuestion(Collection<Question> questions) {
        int questionNum = getRandomInt(questions.size());
        int questionCur = 0;
        for (Question question : questions) {
            if (questionCur == questionNum) {
                return question;
            }
            questionCur++;
        }
        return null;
    }
}
