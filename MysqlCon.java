import java.sql.*;  
class MysqlCon{  
public static void main(String args[])
{  
	try
	{  
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("hellooo");
		Connection con=
				DriverManager.
				getConnection(  
		"jdbc:oracle:thin:@localhost:1521/OUAFDEMO","CISADM","CISADM");   
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from ci_acct");  
		while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
	}
	catch(Exception e)
	{ 
		e.printStackTrace();}  
	}  
}  