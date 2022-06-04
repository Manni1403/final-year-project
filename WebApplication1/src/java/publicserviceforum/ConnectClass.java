/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package publicserviceforum;

/**
 *
 * @author MANMOHAN SINGH
 */
import java.sql.*;
public class ConnectClass {
    public Connection con;
	public PreparedStatement pst;
	public ResultSet rst;

	public void connect()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:psf");
			System.out.println("connected");
		}
		catch(Exception e)
		{
			System.out.println("connection error "+e);
		}
	}

	public void disconnect()
	{
		try
		{
			con.close();
			System.out.println("closed");
		}
		catch(Exception e)
		{
			System.err.println("errror in closing" + e);
		}
	}


public static void main(String arg[])
{
	ConnectClass obj = new ConnectClass();
	obj.connect();
	obj.disconnect();
}

}
