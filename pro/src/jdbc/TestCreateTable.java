package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestCreateTable {

	public static void main(String[] args) {
		//각종 필요한 변수선언 - 예)conn, stmt, pstmt, rs, sql
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user= "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null; //PreparedStatement객체
		ResultSet rs = null;
		
		try {//1.드라이버로딩
				Class.forName(driver);
				//2.객체얻기
				conn = DriverManager.getConnection(url,user,password);
				//3-1.실행객체-PreparedStatement객체,Statement객체
				String sql = "select cno,cname,ceo,tel,dam" 
							+ " from company";
				//3-2.쿼리문실행 - executeQuery() : select
				pstmt=conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
			
			//4.추가작업
			while(rs.next()) {
				System.out.println(rs.getInt("cno")+" "+
						rs.getString("cname")
						+" "+rs.getString("ceo")+" "+
						rs.getString("tel")+" "+
						rs.getString("dam"));
			 	};
		} catch (Exception e) {
			e.printStackTrace();
		}finally{   
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
	}
}
