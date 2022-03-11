package servletsample.jp.co.aforce.h.shimanaka.model;

import servletsample.jp.co.aforce.h.shimanaka.dao.UsersDao;

public class RegistrationModel {
	public int registerNewUserData(String id, String password, String userName, int age) {
		UsersDao dao = new UsersDao();
		int insert = dao.registerNewUserData(id, password, userName, age);
		
		return insert;
	}
}
