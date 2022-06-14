package com.a04t.designpatterns.structural.structural_5_facade;

import java.sql.Connection;

public class MySqlHelper {
	public static Connection getMySqlDBConnection() {
		// get MySql DB connection using connection parameters
		System.out.println("get MySql DB connection using connection parameters");
		return null;
	}

	public void generateMySqlPDFReport(String tableName, Connection con) {
		// get data from table and generate pdf report
		System.out.println("get data from table and generate pdf report");
	}

	public void generateMySqlHTMLReport(String tableName, Connection con) {
		// get data from table and generate pdf report
		System.out.println("get data from table and generate pdf report");
	}
}