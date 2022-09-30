package com.uv.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

interface Contract
{
	public int process(int x);
}

class ContractImpl implements Contract
{
	@Override
	public int process(int x)
	{
		return x+x;
	}
}

class Student
{
	String name;
	int roll;
	int marks;
	public Student(String name, int roll, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode()
	{
		return roll;
	}
	@Override
	public boolean equals(Object ob)
	{
		try
		{
			Student st = (Student) ob;
			if(st.roll == this.roll && st.name.equals(this.name) && this.marks == st.marks)
				return true;
			else return false;
		}
		catch(Exception e)
		{
			return super.equals(ob);
		}
	}
}

public class CollectionDemo {
	
	private static void mapDemo()
	{
		Map<Integer,Integer> map = new HashMap<>();
		map.put(101,23);
		map.put(102,96);
		map.put(103,88);
		map.put(105,43);
		map.put(106,73);
		System.out.println(map);
		
		Set<Integer> keyset = map.keySet();
		System.out.println("Keyset = " + keyset);
		
		int count = 1;
		Map<String,Integer> strMap = new HashMap<>();
		String strAr[] = {"a","b","c","a","dm","pm","cr","key","java","key","dm","xy","dm"};
//		for(int i=0; i<strAr.length; i++)
//		{
//			if(strMap.containsKey(strAr[i]))
//			{
//				//strMap
//				//strMap.put(strAr[i], count);
//			}
//		}
		System.out.println("strMap = " + strMap);
	}
	
	private static void setDemo()
	{
		Set<String> set = new HashSet<>();
		set.add("Sumit"); set.add("Harshita"); set.add("Yuvraj");
		set.add("Sumit"); set.add("Rajan");
		System.out.println(set);
		
		Set<Student> setStudents = new HashSet<>();
		setStudents.add(new Student("Amit",101,34));
		setStudents.add(new Student("Yuvraj",102,100));
		setStudents.add(new Student("Dk",103,44));
		setStudents.add(new Student("Manish",104,89));
		setStudents.add(new Student("Anushka",105,52));
		
		Student student = new Student("Amit",101,34);
		boolean contains = setStudents.contains(student);
		System.out.println("Sudent in set " + contains);
		
		List<String> list  = new ArrayList<>(set);
		printList(list);
		
		List<Integer> listi = new ArrayList<>();
		listi.add(12); listi.add(12); listi.add(10); listi.add(52); listi.add(12);
		
		Set<Integer> seti = new TreeSet<>(listi);
		System.out.println("TreeSet = " + seti);
		
		Set<Integer> setih = new HashSet<>(listi);
		System.out.println("HashSet = " + setih);
	}
	
	private static void listDemo()
	{
		Contract ct = new ContractImpl();
		Contract ct1 = new Contract() {public int process(int x) {
			return x+x+x;
		} };
		
		System.out.println(ct.process(20));
		System.out.println(ct1.process(20));
		
		List<Integer> list = new ArrayList<>();
		System.out.println(list.size());
		list.add(234); list.add(34); list.add(24);
		list.add(834); list.add(10); list.add(84);
		
		for(int i=0; i<list.size(); i++)
		{
			int x = list.get(i);
			System.out.print(x + " ");
		}
		System.out.println();
		
		for(int x : list)
			System.out.println(x + " ");
		
		list.forEach(new Consumer<Integer> () {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");
			}});
		
		System.out.println();
		list.forEach(System.out ::println);
		System.out.println();
		
		//adding
		list.add(5, 33); printList(list);
		list.add(3, 33); printList(list);
		list.add(3, 33); printList(list);
		list.add(3, 33); printList(list);
		list.add(3, 33); printList(list);
		list.add(3, 33); printList(list);
		list.add(list.size()-1, 33); printList(list);
		list.add(33);
//		List<Integer> list2 = new ArrayList<> (); list2.add(12); list2.add(560);
//		list.addAll(0, list2); printList(list);
		
		for(int k=0; k<list.size(); k++)
		{
			if(list.get(k) == 33)
			{
				list.remove(k);
				k--;
			}
		}
		System.out.println("after 33 removed" + list);
		printList(list);
//		//searching
//		boolean contains = list.contains(560); System.out.print(contains);
//		System.out.println();
//		int indexOf = list.indexOf(560); System.out.println(indexOf);
		
		//deleting
		//list.remove(new Integer(560) ); printList(list);
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		printList(list);
	}
	
	private static void printList(List list) {
		list.forEach(t -> System.out.print(t + " "));
		System.out.println();
	}

	public static void main(String[] args) {
		
//		String[] names = {"Ashish", "M Arishtha", "Shiva", "Vishal", "Lakshmi", "Rajan Gupta", "Kirti Sinha"};
//		String[] bigNames = getBigNames(names,6);
//		for(String name : bigNames)
//		{
//			System.out.println(name);
//		}
		
//		setDemo();
//		listDemo();
		mapDemo();
}

	private static String[] getBigNames(String[] names, int i) {
		
		String ans[] = new String[names.length];
		int k=0;
		for(int j=0; j<names.length; j++)
		{
			if(names[i].length() > i)
			{
				ans[k] = names[j];
				k++;
			}
		}
		ans = Arrays.copyOf(ans,k);
		return ans;
	}
}