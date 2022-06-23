package com.poltomo.HibernateDemo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
	
	@Id
	private Integer id;
	
	private String firstname;
	private String lastname;

	private String email;
	private Integer locationid;

	public Integer getLocationid() {
		return locationid;
	}
	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="locationid", insertable = false, updatable = false)
	private Location location;
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Post> posts;

	public User() {}
	public User(Integer id, String firstname, String lastname, Location location, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@JsonBackReference
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	@JsonManagedReference
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}
