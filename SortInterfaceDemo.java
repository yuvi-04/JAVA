package com.uv.inh;

import java.util.Arrays;

class Student implements Comparable<Student> 
{
	int rollno;
	String name;
	int marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		
//		if(this.rollno > o.rollno)
//		{
//			return 1;
//		}
//		if(this.rollno < o.rollno)
//		{
//			return -1;
//		}
//		else
//			return 0;
		
		return this.rollno - o.rollno;
		//return this.marks - o.marks;
	}
}

public class SortInterfaceDemo {
	public static void main(String[] args) {
		
		int ar[] = {12,585,5845,558,258,12,45,22,58};
		
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		Student student[] = new Student[5];
		student[0] = new Student(104, "Dks", 67);
		student[1] = new Student(105, "abc", 37);
		student[2] = new Student(108, "jkl", 27);
		student[3] = new Student(109, "nma", 97);
		student[4] = new Student(103, "nkh", 87);
		
		Arrays.sort(student);
		System.out.println(Arrays.toString(student));
		
		// interface is a contract that class is bound to obey 
	}
}
