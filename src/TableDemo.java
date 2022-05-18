import javax.swing.*;
import java.sql.*;

public class TableDemo {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Connection con;
		Statement stmt;
		try {
			con=DriverManager.getConnection("jdbc:sqlite:Test.db");
			System.out.println("Database Opened");
			stmt=con.createStatement();
			//stmt.executeUpdate("create table employee(eid int,ename char(10),salary number(10,2))");
			//System.out.println("Table Created");
			//stmt.executeUpdate("insert into employee values(1,'Uvais',100)");
			//System.out.println("Record inserted");
			
			ResultSet rst=stmt.executeQuery("Select * from employee  ");
			while(rst.next()) {
				System.out.println(rst.getString(1)+" "+rst.getString(2)+" "+rst.getString(3));
			}
			con.close();
		
		}
	    catch(Exception ex) {
	    	System.out.println(ex);
	    }
	}
}

