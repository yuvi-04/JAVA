package com.uv.main;

public class Person{
	String name;
	Person father;//what is data type of father and son why we write person 
	Person son;//refrence to father and son...

	public Person(String name)
	{
		this.name=name;
		son=null;
		father=null;
	}
	public void show()
	{
		if(father!=null && son!=null)
			System.out.println("I am " + name +" Son of " + father.name + " having son " + son.name);
		else if(father!=null)
			System.out.println("I am " + name + " Son of " + father.name);
		else if(son!=null)
			System.out.println("I am " + name + " having son " + son.name);
	}
	public Person firstFather()
	{
		Person temp=this;
		while(temp.father !=null)
		{
			temp=temp.father;
		}
		return temp;
	}
}
