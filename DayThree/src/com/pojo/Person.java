package com.pojo;

public class Person {
	
	private int age;
	private String name;
	
	public Person()      
	{
		age=10;
		name="abc";
	}
	public Person(int age,String name)      
	{
		this.age=age;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println("Name is: "+name+", Age is: "+age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		Person p = (Person) obj;   //down casting
		
		return p.name.equals(this.name) && p.age == this.age;
	}
	

}
