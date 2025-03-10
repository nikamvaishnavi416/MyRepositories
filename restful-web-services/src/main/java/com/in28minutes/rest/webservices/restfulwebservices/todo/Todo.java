package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String username;
	private Date orderDate;
	private String isCompleted;
	private String itemName;
	private int totalAmount;
	
	protected Todo() {
		
	}
	
	
	public Todo(Long id, String username, Date orderDate, String isCompleted, String itemName, int totalAmount) {
		super();
		this.id = id;
		this.username = username;
		this.orderDate = orderDate;
		this.isCompleted = isCompleted;
		this.itemName = itemName;
		this.totalAmount = totalAmount;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public String getIsCompleted() {
		return isCompleted;
	}


	public void setIsCompleted(String isCompleted) {
		this.isCompleted = isCompleted;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public int getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}
