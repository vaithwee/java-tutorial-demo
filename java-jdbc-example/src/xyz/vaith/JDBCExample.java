package xyz.vaith;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCExample {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc-test", "root", "abcd1234");
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery("select * from student");
			while (set.next()) {
				int id = set.getInt("id");
				String name = set.getString("name");
				int age = set.getInt("age");
				System.out.println("name:" + name + ", id:" + id + ", age:" + age);
			}

			set.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}




	}
}
