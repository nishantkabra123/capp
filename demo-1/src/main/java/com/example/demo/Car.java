package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String cname;
	//@ManyToMany
//	@ManyToMany(mappedBy = "cars")
//	private List<UserInfo> users;
	public int getCid() {
		return cid;
	}
//	public List<UserInfo> getUsers() {
//		return users;
//	}
//	public void setUser(List<UserInfo> users) {
//		this.users = users;
//	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}
