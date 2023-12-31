package com.chaithu.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chaithu.www.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}

