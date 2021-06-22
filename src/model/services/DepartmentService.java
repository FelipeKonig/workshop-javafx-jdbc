package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll() {
		List<Department> list = new ArrayList<>();
		
		list.add(new Department(1, "Department 1"));
		list.add(new Department(2, "Department 2"));
		list.add(new Department(3, "Department 3"));

		return list;
	}
}
