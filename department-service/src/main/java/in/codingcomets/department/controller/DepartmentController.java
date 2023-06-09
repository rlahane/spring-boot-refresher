package in.codingcomets.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codingcomets.department.entity.Department;
import in.codingcomets.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	
	@GetMapping("/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long id) {
		return departmentService.fetchDepartmentById(id);
	}
	
	@PostMapping("/create")
	public Department createDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
}
