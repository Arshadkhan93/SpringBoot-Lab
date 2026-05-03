package com.nit.task;

/*
 Task:Department & Employees System (One-To-Many)

Scenario
One Department has multiple Employees.

1. Department (Entity)

id
name
location

Relation: One Department → Many Employees

Parent class

2. Employee (Entity)
id
name
salary
designation

Relation: Many Employees → One Department
Child class (contains foreign key)

3. Department Repository
Save Department
Find Department by id
Fetch all Departments

4. Employee Repository
Save Employee
Find Employees by Department
Find Employees with salary > 50,000

5. Service Layer
Add Department
Add Employees to Department
Get Employees by Department
Get Employees with salary > 50,000

6. Runner (Execution)
Save Department
Add Employees
Fetch Employees by Department
Fetch Employees with salary > 50,000

7. Tables

Department Table

id, name, location

Employee Table

id, name, salary, designation, department_id

Key Concept

OneToMany + ManyToOne Mapping with Foreign Key 
 
 */