package net.javaguide.springboot.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguide.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();

	void saveEmployee(Employee employee);

	Employee getEmployeeById(long id);

	void deleteEmployee(long id);

	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
