package com.dxctraining.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="item")

public class Item {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	
	public Item(String name,int id) {
		this.name=name;
		this.id=id;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		
		return id;
	}
	@Override
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}
		
	   if(arg==null || !(arg instanceof Item) ) {
			return false;
	   }
		
	    Item that=(Item)arg;	
		boolean isequal=this.id==that.id;
		return isequal;
	}

}
