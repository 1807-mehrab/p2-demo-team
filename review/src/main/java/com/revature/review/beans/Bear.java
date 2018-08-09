package com.revature.review.beans;

import javax.persistence.*;

@Entity
public class Bear {

	@Id
	private int id;

	@Column
	private String name;

	@Column
	private double weight;

	@ManyToOne
	@JoinColumn
	private Cave cave;

	public Bear(int id, String name, double weight, Cave cave) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.cave = cave;
	}

	public Bear() {
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Cave getCave() {
		return cave;
	}

	public void setCave(Cave cave) {
		this.cave = cave;
	}

	@Override
	public String toString() {
		return "Bear [id=" + id + ", name=" + name + ", weight=" + weight + ", cave=" + cave + "]";
	}

}
