package com.uv.main;

public class Student {
	 String name,address;
	 int rollno;
	 
	 public static int nextroll=101;
	 
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		this.rollno = nextroll; nextroll++;
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", rollno=" + rollno + "]";
	}
}
