package jdbc;

//STEP 1. Import required packages 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepStatementExample {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/jdbc_example_db";

	// Database credentials
	static final String USER = "msg";
	static final String PASS = "msg";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
			System.out.println("Creating prepared statement...");
			String selectSQL = "SELECT first, last FROM people WHERE id=?";
			PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
			preparedStatement.setInt(1, 101);

			ResultSet rs = preparedStatement.executeQuery();

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String first = rs.getString("first");
				String last = rs.getString("last");
				// Display values
				System.out.print("First: " + first);
				System.out.println(" Last: " + last);
			}
			rs.close();
		} catch (SQLException se) { // Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) { // Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("Goodbye!");
	}// end main
}// end JDBCExample
