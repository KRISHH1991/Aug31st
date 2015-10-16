package P_22_09_2015;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.PreparedStatement;

public class DBTesting {

	public static void main(String[] args) throws Exception, IllegalAccessException, ClassNotFoundException 
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="test";
		String Dbdriver="com.mysql.jdbc.Driver";
		String userName="root";
		String password="krishna";
		
		Class.forName(Dbdriver).newInstance();
		conn=DriverManager.getConnection(url+dbname,userName,password);
		PreparedStatement psmt= conn.prepareStatement("select * from emp where sal>=? and deptno=?");
		psmt.setString(1,"2000");
		psmt.setString(2,"10");
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			for(int i=1;i<=8;i++)
			{
				System.out.print(rs.getString(i)+"  ");
			}
			System.out.println();
		}
		conn.close();

	}

}
