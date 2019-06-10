package com.ibm.demo.repository;

import com.ibm.demo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "SELECT e.empno,e.deptno from employee e where e.ename=?1 and e.job=?2", nativeQuery = true)
    public List find(String name, String job);

    @Query(value = "SELECT * FROM employee WHERE ename=:name", nativeQuery = true)
    public Employee findByName(String name);
}
