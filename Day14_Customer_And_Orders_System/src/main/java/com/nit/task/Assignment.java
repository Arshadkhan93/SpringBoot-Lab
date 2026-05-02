package com.nit.task;

/*
 Task: Customer & Orders System
-------------------------------
Objective

Build a Spring Boot Console Application where One Customer can have multiple Orders

Use CommandLineRunner to insert and display data

Class-wise Design
------------------

1️.Customer (Entity Class)

Purpose
Stores customer information

Fields
-------

id
name
email

Relationship:
-------------
One Customer → Many Orders

Maintains a collection of Order objects

2️.Order (Entity Class)

Purpose 
Stores order details

Fields
-------

id
productName
price

Relationship
------------
Many Orders → One Customer
Holds reference to a single Customer

3️. CustomerRepository

Purpose
Handles database operations for Customer

Responsibilities
-----------------
Save customer with orders
Fetch customer data
Delete/update customer

4️.OrderRepository

Purpose
Handles database operations for Orders

Responsibilities
----------------
Fetch all orders
Fetch orders by customer
Delete/update orders

5️.Runner Class (Main Class implementing CommandLineRunner)

Purpose
Acts as the execution point of the application


Database Tables
Customer Table
Stores customer details
Orders Table
Stores order details

Contains foreign key (customer_id)

Total Tables: 2

Expected Output (Console):
---------------------------
Customer saved successfully
Multiple orders linked to one customer
Orders retrieved and displayed
 */