package com.Associations;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Questions {

	@Id
	private int QID;

	private String Question;

	@OneToMany
	private List<Answers> ans;

	public Questions() {
		System.out.println("Questions constructer called");
	}

	public int getQID() {
		return QID;
	}

	public void setQID(int qID) {
		QID = qID;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public List<Answers> getAns() {
		return ans;
	}

	public void setAns(List<Answers> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Questions [QID=" + QID + ", Question=" + Question + ", ans=" + ans + "]";
	}

}
