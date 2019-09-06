package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAB")
public class CabEntity {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name="DRIVERNAME")
	private String drivername;
	
	@Column(name="CABNUMBER")
	private String cabnumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public String getCabnumber() {
		return cabnumber;
	}

	public void setCabnumber(String cabnumber) {
		this.cabnumber = cabnumber;
	}
	
}
