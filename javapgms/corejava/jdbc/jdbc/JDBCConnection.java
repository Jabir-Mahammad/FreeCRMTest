package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args) {
		statementDemo();
		//PreparedStatementDemo();
		//updateTable("delete from sample where id=1005");
	}
	
	//read DB values using 'Statement' interface
	static void statementDemo()
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		ResultSetMetaData resMeta = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			stmt = conn.createStatement();
			String sQuey = "select * from sample";
			res = stmt.executeQuery(sQuey);
			resMeta = res.getMetaData();
			
			
			String col1 = resMeta.getColumnName(1);
			String col2 = resMeta.getColumnName(2);
			//String col3 = resMeta.getColumnName(3);
			String col4 = resMeta.getColumnName(3);
			
			System.out.printf("%10s", col1);
			System.out.printf("%10s", col2);
			//System.out.printf("%10s", col3);
			System.out.printf("%10s", col4);
			System.out.printf("\n");
			
			while(res.next())
			{
				String val1 = res.getString(col1);
				String val2 = res.getString(col2);
				//String val3 = res.getString("CITY");
				String val4 = res.getString(col4);
				
				System.out.printf("%10s", val1);
				System.out.printf("%10s", val2);
				//System.out.printf("%10s", val3);
				System.out.printf("%10s", val4);
				System.out.printf("\n");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				resMeta = null;
				res.close();
				res = null;
				stmt.close();
				stmt = null;
				conn.close();
				conn = null;
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	
	//read DB values using 'PreparedStatement' interface
	static void PreparedStatementDemo()
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet res = null;
		ResultSetMetaData resMeta = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			String sQuey = "select * from sample";
			stmt = conn.prepareStatement(sQuey);
			res = stmt.executeQuery();
			resMeta = res.getMetaData();
			
			String col1 = resMeta.getColumnName(1);
			String col2 = resMeta.getColumnName(2);
			String col3 = resMeta.getColumnName(3);
			String col4 = resMeta.getColumnName(4);
			
			System.out.printf("%10s", col1);
			System.out.printf("%10s", col2);
			System.out.printf("%10s", col3);
			System.out.printf("%10s", col4);
			System.out.printf("\n");
			
			while(res.next())
			{
				String val1 = res.getString(col1);
				String val2 = res.getString(col2);
				String val3 = res.getString("CITY");
				String val4 = res.getString("AGE");
				
				System.out.printf("%10s", val1);
				System.out.printf("%10s", val2);
				System.out.printf("%10s", val3);
				System.out.printf("%10s", val4);
				System.out.printf("\n");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				resMeta = null;
				res.close();
				res = null;
				stmt.close();
				stmt = null;
				conn.close();
				conn = null;
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	//ORacle JDBC connection for executing DML statement
	static void updateTable(String sQuery)
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			//String sQuery = "insert into sample values(1005,'user5','Hubli',30)";
			stmt = conn.prepareStatement(sQuery);
			stmt.executeUpdate();
			
			PreparedStatementDemo();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}