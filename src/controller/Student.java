package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice", "root", "abc123");
Scanner s=new Scanner(System.in);
		System.out.println("Enter the roll");
		int roll = Integer.parseInt(s.nextLine());
		System.out.println("Enter the name");
		String name = s.nextLine();
		System.out.println("Enter the address");
		String address = s.nextLine();
		PreparedStatement stmt=con.prepareStatement("UPDATE pratice.pra set name=?,address=? where roll=?");
		stmt.setString(1, name);
		stmt.setString(2, address);
		stmt.setInt(3, roll);
		int a=stmt.executeUpdate();
		if(a>0){
			System.out.println("dat inserted");
		}
		else{
			System.out.println("data not inserted");
		}
		
	}

}
