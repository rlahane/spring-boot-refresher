package in.codingcomets.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.codingcomets.user.VO.Department;
import in.codingcomets.user.VO.ResponseTemplateVO;
import in.codingcomets.user.entity.UserInfo;
import in.codingcomets.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public UserInfo saveUser(UserInfo user) {

		return userRepository.save(user);
	}

	@Override
	public UserInfo fetchUserById(Long id) {

		return userRepository.findById(id).get();
	}

	@Override
	public ResponseTemplateVO getUserWithDepartment(Long userId) {

		UserInfo user = userRepository.findById(userId).get();

		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
				Department.class);

		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO(user, department);

		return responseTemplateVO;
	}

}
