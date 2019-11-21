package com.spring.example.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_student_details")
public class InsertBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "KEY_SEQ")
	@SequenceGenerator(sequenceName = "AUTO_INCR_PRIMARY_KEY_SEQ",allocationSize = 1,name = "KEY_SEQ")
	protected int sId;
	protected String name;
	protected String address;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
