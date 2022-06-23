package com.poltomo.HibernateDemo.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

import javax.persistence.*;

@Entity
public class Location {
	
	@Id
	private Integer id;
	private String name;
	
	@OneToMany(mappedBy="location", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<User> users;

	public Location() {}
	public Location(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonManagedReference
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
