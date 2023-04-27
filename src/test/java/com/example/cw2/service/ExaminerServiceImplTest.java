package com.example.cw2.service;

import com.example.cw2.exception.BadRequestException;
import com.example.cw2.model.Question;
import com.example.cw2.repository.QuestionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

  /*  @InjectMocks
    private ExaminerService out;
    @Mock
    QuestionService questionService;
    @Mock
    private QuestionRepository questionRepository;
    @Mock
    UtilService utilService;

    @BeforeEach
    void setUp() {
        out = new ExaminerServiceImpl(List.of(questionService), utilService);
    }

    @Test
    void getQuestions() {
        Question expected = new Question("Question", "Answer");
        Collection<Question> expectedList = Set.of(expected);
        Mockito.when(utilService.getRandomInt(anyInt())).thenReturn(0);
        Mockito.when(questionService.getRandomQuestion()).thenReturn(expected);
        Mockito.when(questionService.getAll()).thenReturn(expectedList);
        Collection<Question> actualList = out.getQuestions(1);
        org.assertj.core.api.Assertions.assertThat(actualList).isEqualTo(expectedList);
        Mockito.verify(questionService, Mockito.times(1)).getAll();
        Mockito.verify(questionService, Mockito.times(1)).getRandomQuestion();
        Mockito.verify(utilService, Mockito.times(1)).getRandomInt(anyInt());
    }

    @Test
    void getBadQuestions() {
        Mockito.when(questionService.getAll()).thenReturn(Set.of(new Question("Question", "Answer")));
        org.assertj.core.api.Assertions.assertThatExceptionOfType(BadRequestException.class).isThrownBy(() -> {
            out.getQuestions(5);
        });
        Mockito.verify(questionService, Mockito.times(1)).getAll();
        Mockito.verify(questionService, Mockito.never()).getRandomQuestion();
        Mockito.verify(utilService, Mockito.never()).getRandomInt(anyInt());
    }*/
}