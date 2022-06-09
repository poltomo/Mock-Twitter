package com.poltomo.HibernateDemo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	
	@Id
	private Integer id;
	
	private LocalDateTime postdate;

	private String details;

	private Integer userid;

	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	@ManyToOne
	@JoinColumn(name="userid", updatable = false, insertable = false)
	private User user;
	
	public Post() {}
	public Post(Integer id, LocalDateTime postdate, String details, User user) {
		super();
		this.id = id;
		this.postdate = postdate;
		this.details = details;
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getPostdate() {
		return postdate;
	}
	public void setPostdate(LocalDateTime postdate) {
		this.postdate = postdate;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@JsonBackReference
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
