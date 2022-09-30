package com.uv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/congnizantsfdc", "root", "password");
			System.out.println("connection = " + connection);
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student");
			while(resultSet.next())
			{
				int roll = resultSet.getInt(1);
				String name = resultSet.getString("name");
				String branch = resultSet.getString("branch");
				System.out.println(roll + ":" + name + ":" + branch);
			}
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter roll");
			int roll = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter branch");
			String branch = sc.next();
			System.out.println("enter marks");
			int marks = sc.nextInt();
						
			PreparedStatement prepareStatement = connection.prepareStatement("insert into student values(?,?,?,?);");
			prepareStatement.setInt(1, roll);
			prepareStatement.setString(2, name);
			prepareStatement.setString(3, branch);
			prepareStatement.setInt(4, marks);
			
			String sql = ("select MAX(marks) from student;");
			resultSet = statement.executeQuery(sql);
			resultSet.next();
			int maxMarks = resultSet.getInt(1);
			System.out.println("Maxmarks = " + maxMarks);
			
			int rowsUpdated = prepareStatement.executeUpdate();
			if(rowsUpdated == 1)
			{
				System.out.println("succesful insertion");
			}
			else
				System.out.println("error occured");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
				System.out.println("connection closed ");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
