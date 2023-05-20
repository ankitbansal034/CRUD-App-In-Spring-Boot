package com.Cogni.Hispro.repository;

import javax.persistence.Column;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Cogni.Hispro.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
