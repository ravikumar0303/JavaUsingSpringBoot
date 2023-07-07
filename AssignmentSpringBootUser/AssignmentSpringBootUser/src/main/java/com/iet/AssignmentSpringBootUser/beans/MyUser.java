package com.iet.AssignmentSpringBootUser.beans;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myuserRavi")
public class MyUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uid;
   private String uname;
	private String Addr;
//	@Enumerated(EnumType.STRING)
	private String gender;
	private String city;
	
	public MyUser() {
		super();
	}

	public MyUser(int uid, String uname, String addr, String gender, String city) {
		super();
		this.uid = uid;
		this.uname = uname;
		Addr = addr;
		this.gender = gender;
		this.city = city;
	}

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

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", Addr=" + Addr + ", gender=" + gender + ", city=" + city
				+ "]";
	}

}
