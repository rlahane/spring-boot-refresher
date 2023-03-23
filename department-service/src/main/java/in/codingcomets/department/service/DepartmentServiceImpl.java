package in.codingcomets.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codingcomets.department.entity.Department;
import in.codingcomets.department.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department fetchDepartmentById(Long id) {
		return departmentRepository.findById(id).get();
	}

	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}
}
