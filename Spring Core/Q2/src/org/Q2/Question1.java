package org.Q2;

import java.util.List;

public class Question1 {
	
	private String questionId;
	private String question;
	private List<String> answer;
	
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	
	public void detail() {
		System.out.println(getQuestionId() + getQuestion());
		for(String i: answer) {
			System.out.println(i);
		}
	}
}
