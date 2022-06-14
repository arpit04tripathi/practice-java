package com.a04t.designpatterns.structural.structural_5_facade;

import java.sql.Connection;

public class OracleHelper {
	public static Connection getOracleDBConnection() {
		// get Oracle DB connection using connection parameters
		System.out.println("get Oracle DB connection using connection parameters");
		return null;
	}

	public void generateOraclePDFReport(String tableName, Connection con) {
		// get data from table and generate pdf report
		System.out.println("get data from table and generate pdf report");
	}

	public void generateOracleHTMLReport(String tableName, Connection con) {
		// get data from table and generate pdf report
		System.out.println("get data from table and generate pdf report");
	}
}