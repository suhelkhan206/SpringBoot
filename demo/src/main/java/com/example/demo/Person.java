package com.example.demo;


import java.util.Date;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;

@javax.persistence.Entity
@DynamicUpdate
public class Person {
	 @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;

	  private String location;
	  private String name;
	  
	  
	  public Person() {
		  
	    }
	 
	    public Person(Integer id, String location, String name) {
	        this.id = id;
	        this.location = location;
	        this.name = name;
	    }
	  
	  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", location=" + location + ", name=" + name + ", getId()=" + getId()
				+ ", getLocation()=" + getLocation() + ", getName()=" + getName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
