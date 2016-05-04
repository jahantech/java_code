/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql_access;
import java.sql.*;
/**
 *
 * @author Jahan
 */
public class Main {

    public static void main(String[] args) {
     try
     {
        Connection db = null;
	String url = "jdbc:mysql://localhost:3306";
	String username = "root", password ="xxxxxx";
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	db = DriverManager.getConnection(url,username,password);

        Statement STMT;

        STMT = db.createStatement();

        STMT.executeUpdate("INSERT INTO test.work VALUES('XXXX','XXXX','XXXX','XXXX')");
     }
     
     catch(Exception e)
     {
     
           e.printStackTrace();
     }


    }
}
