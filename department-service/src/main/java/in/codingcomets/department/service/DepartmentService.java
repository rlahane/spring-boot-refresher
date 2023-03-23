package in.codingcomets.department.service;

import in.codingcomets.department.entity.Department;

public interface DepartmentService {

	Department fetchDepartmentById(Long id);

	

	Department saveDepartment(Department department);

}