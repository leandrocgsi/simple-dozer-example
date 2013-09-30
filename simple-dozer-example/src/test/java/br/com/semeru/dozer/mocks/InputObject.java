package br.com.semeru.dozer.mocks;

import java.io.Serializable;

public class InputObject implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}