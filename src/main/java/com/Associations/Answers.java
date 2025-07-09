package com.Associations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answers {

	@Id
	private int Aid;

	private String Answer;

	@ManyToOne
	private Questions que;

	public Answers() {
		System.out.println("Answer Constructor Called");
	}

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public Questions getQue() {
		return que;
	}

	public void setQue(Questions que) {
		this.que = que;
	}

	@Override
	public String toString() {
		return "Answers [Aid=" + Aid + ", Answer=" + Answer + ", que=" + que.getQID() + " " + que.getQuestion() + "]";
	}

}
