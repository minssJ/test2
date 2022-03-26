package books3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbc {
	public static Connection DBConnect(){

		//DB에 접속에 필요한 정보를 저장하기 위한 Connection 타입 객체 con생성
			Connection con = null;
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user="MINSOO";
			String password ="1111";

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//오라클 데이터베이스 접속정보
				con = DriverManager.getConnection(url, user, password);
				System.out.println("접속성공");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("접속실패!");
				
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("접속실패!!");
			}


			return con;
}}




