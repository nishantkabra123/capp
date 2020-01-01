package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="userinfo")
public class UserInfo {
	
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int uid;	
	private String uname;
	//@ManyToMany(mappedBy = "user",cascade = CascadeType.ALL)
//	@ManyToMany
//	@JoinTable(
//        name = "Users_Cars", 
//        joinColumns = { @JoinColumn(name = "userids") }, 
//        inverseJoinColumns = { @JoinColumn(name = "carids") }
//    )
//	List <Car> cars;	
//	public List<Car> getCars() {
//		return cars;
//	}
//	public void setCars(List<Car> cars) {
//		this.cars = cars;
//	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "UserInfo [uid=" + uid + ", uname=" + uname + "]";
	}
	
}
