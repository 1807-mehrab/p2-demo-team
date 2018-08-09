package com.revature.review.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cave {

	@Id
	private int id;

	@Column
	private String name;

	@Column
	private int max_bears;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn
	private Set<Bear> bears;

	public Cave(int id, String name, int max_bears, Set<Bear> bears) {
		super();
		this.id = id;
		this.name = name;
		this.max_bears = max_bears;
		this.bears = bears;
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

	public Set<Bear> getBears() {
		return bears;
	}

	public void setBears(Set<Bear> bears) {
		this.bears = bears;
	}

	@Override
	public String toString() {
		return "Cave [id=" + id + ", name=" + name + ", max_bears=" + max_bears + ", bears=" + bears + "]";
	}

}