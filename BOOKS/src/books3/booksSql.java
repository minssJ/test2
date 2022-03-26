package books3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class booksSql {
	Connection con =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void connect() {
		con = dbc.DBConnect();
	}
	public void conClose() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insert(member mb) {
		// 1) 작성
				String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?,?,?)";
				// 2) 준비
				try {
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, mb.getId());
					pstmt.setString(2, mb.getPw());
					pstmt.setString(3, mb.getMname());
					pstmt.setString(4, mb.getBirth());
					pstmt.setString(5, mb.getEmail());
					pstmt.setString(6, mb.getPhone());
					pstmt.setString(7, mb.getAdress());
					pstmt.setString(8, mb.getAc());

					// 3)실행
					int result = pstmt.executeUpdate();
					// 4)결과
					if (result > 0) {
						System.out.println(" 회원가입 성공!");
					} else {
						System.out.println(" 회원가입 실패!");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}
	public boolean checkcheck(String id, String pw) {
		boolean check = false;
		
		String sql = "SELECT * FROM MEMBER WHERE ID=? AND PW=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				check = true;
				System.out.println("로그인 성공");

			} else {
				check = false;
				System.out.println("로그인실패!");
			}

			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return check;
	}
	public void insert2(goods gd) {
		// 1) 작성
		String sql = "INSERT INTO GOODS VALUES(?,?,?,?,?,?,?)";
		// 2) 준비
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, gd.getGname());
			pstmt.setInt(2, gd.getGprice());
			pstmt.setString(3, gd.getGdate());
			pstmt.setString(4, gd.getGauthor());
			pstmt.setString(5, gd.getGgenre());
			pstmt.setInt(6, gd.getGstock());
			pstmt.setString(7, gd.getGseller());

			// 3)실행
			int result = pstmt.executeUpdate();
			// 4)결과
			if (result > 0) {
				System.out.println(" 상품등록 성공!");
			} else {
				System.out.println(" 상품등록 실패!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void select() {
		String sql="SELECT G_NAME,G_PRICE,G_DATE,G_AUTHOR,G_GENRE,G_STOCK,G_seller FROM GOODS";
		try {
			pstmt =con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String Gname = rs.getString(1);
				int Gprice= rs.getInt(2);
				String Gdate = rs.getString(3);
				String Gauthor = rs.getString(4);
				String Ggenre = rs.getString(5);
				int Gstock = rs.getInt(6);
				String Gseller = rs.getString(7);

				System.out.println("[ 책이름:"+Gname+" 가격:"+Gprice+" 출판일:"+Gdate+" 저자:"+Gauthor+" 장르:"+Ggenre+" 재고:"+Gstock+" 판매자:"+Gseller+"]");
				 };
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	
	public void insert3(account aco) {
		String sql = "INSERT INTO ACCOUNT VALUES(?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, aco.getId());
			pstmt.setString(2, aco.getAc());
			pstmt.setInt(3, aco.getAmount());
			
			
			int result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void  Charging(int amount,String id) {//id값으로 조인
		String sql = "UPDATE ACCOUNT SET AMOUNT = AMOUNT+? WHERE ID=?";
		
			try {
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1,amount);
				pstmt.setString(2,id);
				
				int result = pstmt.executeUpdate();
				
				if(result>0) {
					System.out.println(amount +"원 충전 되었읍니다");
				}else {
					System.out.println("충전 실패 했습니다");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public void select2(String id) {
		//System.out.println("연결test");
		String sql=	 "SELECT M.ID, M.M_NAME,A.AC_NUMBER, A.AMOUNT FROM ACCOUNT A, MEMBER M WHERE M.AC_NUMBER = A.AC_NUMBER AND M.ID = ?";
		//System.out.println("연결test");
		try {
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
		//	System.out.println("연결test");
			while(rs.next()) {//--오류
//				System.out.println("연결test"); 
				String Id = rs.getString(1);
				String Mname= rs.getString(2);
				String Ac = rs.getString(3);
				int amount= rs.getInt(4);
				

				System.out.println("[ 아이디:"+Id+" 아름:"+Mname+" 계좌번호"+Ac+" 현재 잔액:"+amount+"]");
				
				 };
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("실패!");
			e.printStackTrace();
		}
	}
}
