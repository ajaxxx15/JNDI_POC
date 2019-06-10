package com.ibm.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private int empno;

    private String ename;
    private String job;
    private int mgr;
    private int sal;

    private int deptno;
}

//DONT FORGET TO CREATE THE TABLE
