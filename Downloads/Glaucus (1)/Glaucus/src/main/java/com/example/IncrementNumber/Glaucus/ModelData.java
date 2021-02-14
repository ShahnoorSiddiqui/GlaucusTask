package com.example.IncrementNumber.Glaucus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class ModelData {

	@Id
	@GeneratedValue
	private int UserId;
	@Column(name="UserNumber")
	private int UserNumber;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public int getUserNumber() {
		return UserNumber;
	}
	public void setUserNumber(int userNumber) {
		UserNumber = userNumber;
	}

	
}
