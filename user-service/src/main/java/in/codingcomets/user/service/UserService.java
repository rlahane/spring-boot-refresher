package in.codingcomets.user.service;

import in.codingcomets.user.VO.ResponseTemplateVO;
import in.codingcomets.user.entity.UserInfo;

public interface UserService {

	

	UserInfo saveUser(UserInfo user);
	
	UserInfo fetchUserById(Long id);

	ResponseTemplateVO getUserWithDepartment(Long userId);

}
