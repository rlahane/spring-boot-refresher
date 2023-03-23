package in.codingcomets.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codingcomets.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	
}
