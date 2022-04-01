package com.openclassrooms.hr.API.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.openclassrooms.hr.API.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

