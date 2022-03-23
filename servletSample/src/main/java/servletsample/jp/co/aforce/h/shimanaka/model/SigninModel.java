package servletsample.jp.co.aforce.h.shimanaka.model;

import servletsample.jp.co.aforce.h.shimanaka.dao.UsersDao;
import servletsample.jp.co.aforce.h.shimanaka.dto.UsersDto;

public class SigninModel {
	public UsersDto checkExistsUser(String id, String password) {
		UsersDao dao = new UsersDao();
		UsersDto result = dao.selectByIdAndPassword(id, password);
		
		return result;
	}
}
