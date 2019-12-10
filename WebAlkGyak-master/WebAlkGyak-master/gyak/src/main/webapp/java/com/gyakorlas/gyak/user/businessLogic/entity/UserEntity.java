package com.gyakorlas.gyak.user.businessLogic.entity;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class UserEntity {
	
	@Id
	@Column(name = "ID")
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	
	/*@ManyToMany
	@JoinTable(name="User", joinColumns = @JoinColumn(name="userId"),
	inverseJoinColumns = @JoinColumn(name = "roleId"))
	private Set<role> roles;*/
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	

}
