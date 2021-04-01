package org.Q2;

import java.util.Set;

public class Question2 {
	
	private String questionId;
	private String question;
	private Set<String> answer;
	
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
	public Set<String> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<String> answer) {
		this.answer = answer;
	}
	
	public void detail() {
		System.out.println(getQuestionId() + getQuestion());
		for(String i: answer) {
			System.out.println(i);
		}
	}
}
