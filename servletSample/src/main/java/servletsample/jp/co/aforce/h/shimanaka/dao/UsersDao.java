package servletsample.jp.co.aforce.h.shimanaka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import servletsample.jp.co.aforce.h.shimanaka.dto.UsersDto;
import servletsample.jp.co.aforce.h.shimanaka.util.DBUtil;

public class UsersDao {
	public UsersDto selectByIdAndPassword(String id, String password) {
		UsersDto result = new UsersDto();
		String sql = "SELECT * FROM users WHERE user_id = ? AND password = ?";
		try(Connection con = DBUtil.openConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			try(ResultSet rs = pstmt.executeQuery();){
				while(rs.next()) {
					result.setUserID(rs.getString("user_id"));
					result.setUserName(rs.getString("user_name"));
					result.setAge(Integer.valueOf(rs.getString("age")));
				}
			}catch(SQLException e) {
				System.out.println("SQLの実行に失敗しました");
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			System.out.println("DBとの接続に失敗しました。");
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int registerNewUserData(String id, String password, String userName, int age) {
		int insert = 0;
		String sql = "INSERT INTO users\n"
					+"(user_id, password, user_name, age, created_user, updated_user)\n"
					+"VALUES\n"
					+"(?, ?, ?, ?, ?, ?)";
		
		try(Connection con = DBUtil.openConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			pstmt.setString(3, userName);
			pstmt.setInt(4, age);
			pstmt.setString(5, id);
			pstmt.setString(6, id);
			
			insert = pstmt.executeUpdate();
			
			try(ResultSet rs = pstmt.executeQuery();){
				
			}catch(SQLException e) {
				con.rollback();
				System.out.println("SQLの実行に失敗しました");
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			System.out.println("DBとの接続に失敗しました。");
			e.printStackTrace();
		}
		
		return insert;

	}
}
