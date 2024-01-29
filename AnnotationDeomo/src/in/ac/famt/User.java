package in.ac.famt;

import org.springframework.beans.factory.annotation.Required;
//import org.springframework.stereotype.Component;


public class User {
	
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	@Required
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
    @Required
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
