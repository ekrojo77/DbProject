package dataBaseProject;

import java.sql.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//Class to check if the connection works
public class DBtest extends Connect {

	 //String message = "Connected!";
	static Connection conn;
	

	public static int checkConn() {
			conn = Connect.getConn();
			if (conn == null) {
				return 0;
			}
			else {
				return 1;
			}	
		}
	@Test
	public void testPing() throws SQLException {

		assertEquals(checkConn(),1);

	
	}
}
