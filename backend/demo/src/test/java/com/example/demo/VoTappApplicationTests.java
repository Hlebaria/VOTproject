package com.example.demo;

import org.junit.jupiter.api.Test;
import org.postgresql.ds.PGConnectionPoolDataSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootTest
class VoTappApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void TestConnection() throws SQLException {
		PGConnectionPoolDataSource p = new PGConnectionPoolDataSource();
		p.setPassword("mitko");
		p.setUser("mitko");
		p.setDatabaseName("dbtest");
		p.setServerNames(new String[]{"127.0.0.1"});
		p.setPortNumbers(new int[]{6543});
		Connection c = p.getConnection();


		Client temp = new Client(4, "Gosho", "ytpg", 40);

		try {
			Statement statement = c.createStatement();
			String CreateClient = "INSERT INTO Client (id, userName, password, money) VALUES ( " + temp.getId() + ", '" + temp.getUsername() + "', '" + temp.getPassword() + "', " + temp.getMoney() + ");";
			statement.executeQuery(CreateClient);
		}catch(SQLException e){
			System.out.print(e.getMessage());
		}

		try {
			Statement statement = c.createStatement();

			String SelectClient = "SELECT * FROM Client;";

			ResultSet rs = statement.executeQuery(SelectClient);
			while(rs.next()){
				System.out.print("\n id: " + rs.getString("id") + " | userName: " + rs.getString("userName") + " | password: " + rs.getString("password") + " | money: " + rs.getString("money") );
			}

		}catch(SQLException e){
			System.out.print(e.getMessage());
		}

	}

}
