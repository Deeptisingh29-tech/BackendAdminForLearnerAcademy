package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classes {
	@Id
	private int id;
	private int section;
	private int trainer;
	private int subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public int getTrainer() {
		return trainer;
	}
	public void setTrainer(int trainer) {
		this.trainer = trainer;
	}
	public int getSubject() {
		return subject;
	}
	public void setSubject(int subject) {
		this.subject = subject;
	}
	
	
	
	

}
