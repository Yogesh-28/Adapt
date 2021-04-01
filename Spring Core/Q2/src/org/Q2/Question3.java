package org.Q2;

import java.util.Map;

public class Question3 {

	private String questionId;
	private String question;
	private Map<Integer, String> answer;
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
	public Map<Integer, String> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<Integer, String> answer) {
		this.answer = answer;
	}
	
	public void detail() {
		System.out.println(getQuestionId() + getQuestion());
		for(Integer i: answer.keySet()) {
			String value = answer.get(i);
			System.out.println(i + ". " + value);
		}
	}
	
}
