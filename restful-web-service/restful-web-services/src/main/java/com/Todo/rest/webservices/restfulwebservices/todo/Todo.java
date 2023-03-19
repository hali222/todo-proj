package com.Todo.rest.webservices.restfulwebservices.todo;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Id;

import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "todo")
public class Todo {

	@Id
	@GeneratedValue
	private Long Id;
	private String username;
	private String description;
	private Date targetDate;
	private boolean isDone;
	private int count;

	protected Todo() {
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
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
		return Id == other.Id;
	}

	public Todo(Long id, String username, String description, Date targetDate, boolean isDone, int count) {
		super();
		this.Id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
		this.count = count;
	}

	public long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

}
