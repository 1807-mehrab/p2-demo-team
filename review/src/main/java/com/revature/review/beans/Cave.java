package com.revature.review.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Cave {

	@Override
	public String toString() {
		return "Cave [id=" + id + ", name=" + name + ", max_bears=" + max_bears + "]";
	}

	@Id
	private int id;

	@Column
	private String name;

	@Column
	private int max_bears;

	public Cave(int id, String name, int max_bears) {
		super();
		this.id = id;
		this.name = name;
		this.max_bears = max_bears;
	}

	public Cave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMax_bears() {
		return max_bears;
	}

	public void setMax_bears(int max_bears) {
		this.max_bears = max_bears;
	}
}
