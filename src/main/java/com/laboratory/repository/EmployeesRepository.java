package com.laboratory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratory.entity.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long>{


}
