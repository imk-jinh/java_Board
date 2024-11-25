package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private QuestionService questionService;

	@Test
	void testJPA() {
		for(int i = 1; i <= 300; i++){
			String subject = String.format("테스트 데이터:[%03d]", i);
			String content = "내용 없음";
			this.questionService.create(subject, content);
		}
	}
}
