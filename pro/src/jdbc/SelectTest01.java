package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//PreparedStatement객체 이용 : 쿼리문을 미리 전달하여 나중에 실행
public class SelectTest01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user= "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			//2.Connection객체얻기
			conn = DriverManager.getConnection(url,user,password);
			//3-1.실행객체-PreparedStatement객체,Statement객체
			String sql = "select empno,ename,sal,hiredate" + 
					" from emp" + 
					" where empno>=3000 " + 
					"order by empno desc";
			pstmt = conn.prepareStatement(sql);
			//3-2.쿼리문실행 - executeQuery() : select
			//				executeQuery()의 리턴형태는 ResultSet
			rs = pstmt.executeQuery();
			//4.추가작업
			while(rs.next()) {
			System.out.println(rs.getInt("empno")+" "+
					rs.getString("ename")
					+" "+rs.getDouble("sal")+" "+
					rs.getDate("hiredate"));
			};
		}catch(Exception e) { }
		  finally{   
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
	}	
}
