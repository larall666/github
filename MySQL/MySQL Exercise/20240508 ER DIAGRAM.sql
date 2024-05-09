create table regions (REGION_ID int primary key, REGION_NAME varchar(25));

create table countries1 (COUNTRY_ID char(2) primary key, COUNTRY_NAME varchar(40), 
REGION_ID int,
foreign key (REGION_ID) references regions(REGION_ID));

DROP TABLE countries1;

create table locations (LOCATION_ID int primary key, STREET_ADDRESS varchar(25),
 POSTAL_CODE varchar(12), CITY varchar(30), STATE_PROVINCE varchar(12),
 COUNTRY_ID char(2), foreign key (COUNTRY_ID) references countries1 (COUNTRY_ID)
);

DROP TABLE locations;

create table departments (DEPARTMENT_ID int primary key, DEPARTMENT_NAME varchar(30), 
MANAGER_ID int, LOCATION_ID int, foreign key (LOCATION_ID) references locations (LOCATION_ID)
);   

DROP TABLE departments;

create table job_history (EMPLOYEE_ID int , START_DATE date ,
 END_DATE date, JOB_ID varchar(10), foreign key (JOB_ID) references jobs (JOB_ID)
, DEPARTMENT_ID int, foreign key (DEPARTMENT_ID) references departments (DEPARTMENT_ID),
 PRIMARY KEY (EMPLOYEE_ID, START_DATE)
);   

DROP TABLE job_history;

create table jobs (JOB_ID varchar(10) primary key, JOB_TITLE varchar(35), 
MIN_SALARY int, MAX_SALARY int);   

DROP TABLE jobs;

create table employees (EMPLOYEE_ID int primary key, FIRST_NAME varchar(20),
LAST_NAME varchar(25), EMAIL varchar(25) unique, PHONE_NUMBER varchar(20), HIRE_DATE date,
JOB_ID varchar(10), foreign key (JOB_ID) references jobs (JOB_ID), foreign key (DEPARTMENT_ID) references departments (DEPARTMENT_ID)
, SALARY int, COMMISSION_PCT int, MANAGER_ID int, 
DEPARTMENT_ID int, foreign key (DEPARTMENT_ID) references departments (DEPARTMENT_ID));

DROP TABLE employees;

-- REGIONS
INSERT INTO regions (REGION_ID, REGION_NAME) VALUES
(1, 'North America'),
(2, 'Europe'),
(3, 'Asia');

select * from regions;

-- COUNTRIES
INSERT INTO COUNTRIES1 (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES
(1, 'United States', 1),
(2, 'United Kingdom', 2),
(3, 'Japan', 3);

select * from COUNTRIES1;

-- LOCATIONS
INSERT INTO LOCATIONS (LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, COUNTRY_ID) VALUES
(1001, '123 Main St', '12345', 'New York', 'NY', 1),
(1002, '456 Elm St', '67890', 'London', NULL, 2),
(1003, '789 Oak St', '98765', 'Tokyo', NULL, 3);

-- DEPARTMENTS
INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) VALUES
(10, 'Sales', 101, 1001),
(20, 'HR', 102, 1002),
(30, 'IT', 103, 1003);

-- JOBS
INSERT INTO JOBS (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY) VALUES
('SALESMAN', 'Salesman', 30000, 60000),
('HR_REP', 'HR Representative', 35000, 70000),
('IT_PROG', 'IT Programmer', 40000, 80000);

-- EMPLOYEES
INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) VALUES
(101, 'John', 'Doe', 'john@example.com', '123-456-7890', '2023-01-15', 'SALESMAN', 50000, 0.05, 103, 10),
(102, 'Jane', 'Smith', 'jane@example.com', '987-654-3210', '2023-02-20', 'HR_REP', 55000, 0.07, 103, 20),
(103, 'Michael', 'Johnson', 'michael@example.com', '555-123-4567', '2023-03-25', 'IT_PROG', 60000, 0.06, 103,30);
INSERT INTO EMPLOYEES values (104, 'De Haan','Lex', 'LexDeHaan@example.com', '555-123-9999', '2023-03-23', 'SALESMAN', 70000, 0.01, 101,10);
INSERT INTO EMPLOYEES values (105, 'May','chan', 'maychan@example.com', '555-123-9123', '2023-03-25', 'HR_REP', 55000, 0.07, 103, 20);
update EMPLOYEES set HIRE_DATE = '2023-02-23' where EMPLOYEE_ID = 104;
update EMPLOYEES set HIRE_DATE = '2023-02-27' where EMPLOYEE_ID = 105;

select*from EMPLOYEES;

-- JOB_HISTORY
INSERT INTO JOB_HISTORY (START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID, EMPLOYEE_ID) VALUES
('2023-01-15', '2023-05-15', 'SALESMAN', 10, 101),
('2023-02-20', '2023-06-20', 'HR_REP', 20, 102),
('2023-03-25', NULL, 'IT_PROG', 30, 103);
update JOB_HISTORY set END_DATE = '2024-01-27' where DEPARTMENT_ID = 30;

select* from JOB_HISTORY;

-- 3.Find the LOCATION_ID, STREET_ADDRESS, CITY, STATE_PROVINCE, COUNTRY_NAME of locations: 
SELECT l.LOCATION_ID, l.STREET_ADDRESS, l.CITY, l.STATE_PROVINCE, c.COUNTRY_NAME
FROM locations l
JOIN countries1 c ON l.COUNTRY_ID = c.COUNTRY_ID;

-- 4. Find the FIRST_NAME, LAST_NAME, DEPARTMENT_ID of all employees:
 SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_ID
FROM employees;

-- 5.Find the FIRST_NAME, LAST_NAME, JOB_ID, DEPARTMENT_ID of employees who work in Japan:
SELECT e.FIRST_NAME, e.LAST_NAME, e.JOB_ID, e.DEPARTMENT_ID
FROM employees e
JOIN departments d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
JOIN locations l ON d.LOCATION_ID = l.LOCATION_ID
JOIN countries1 c ON l.COUNTRY_ID = c.COUNTRY_ID
WHERE c.COUNTRY_NAME = 'Japan';

-- 6 Find the EMPLOYEE_ID, LAST_NAME along with their MANAGER_ID and LAST_NAME:
SELECT e.EMPLOYEE_ID, e.LAST_NAME, e.MANAGER_ID, m.LAST_NAME AS MANAGER_LAST_NAME
FROM employees e
LEFT JOIN employees m ON e.MANAGER_ID = m.EMPLOYEE_ID;

-- 7 Find the FIRST_NAME, LAST_NAME, and HIRE_DATE of employees who were hired after employee 'Lex De Haan':
SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE > (SELECT HIRE_DATE FROM EMPLOYEES WHERE EMAIL ='LexDeHaan@example.com');

-- 8.Get the DEPARTMENT_NAME and number of employees in each department:
SELECT d.DEPARTMENT_NAME, COUNT(e.EMPLOYEE_ID) AS NUMBER_OF_EMPLOYEES
FROM departments d
LEFT JOIN employees e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
GROUP BY d.DEPARTMENT_NAME;

-- 9.Find the EMPLOYEE_ID, JOB_TITLE, and the number of days between ending date and starting date for all jobs in department ID 30:
SELECT j.JOB_ID, j.JOB_TITLE, DATEDIFF(jh.END_DATE, jh.START_DATE) AS DAYS_WORKED
FROM job_history jh
JOIN jobs j ON jh.JOB_ID = j.JOB_ID
WHERE jh.DEPARTMENT_ID = 30;

-- 10.Display all DEPARTMENT_NAME, MANAGER_NAME, CITY, and COUNTRY_NAME:
SELECT d.DEPARTMENT_NAME, CONCAT(e.FIRST_NAME, ' ', e.LAST_NAME) AS MANAGER_NAME, l.CITY, c.COUNTRY_NAME
FROM departments d
JOIN employees e ON d.MANAGER_ID = e.EMPLOYEE_ID
JOIN locations l ON d.LOCATION_ID = l.LOCATION_ID
JOIN countries1 c ON l.COUNTRY_ID = c.COUNTRY_ID;

-- 11.Display the average salary of each department:
SELECT d.DEPARTMENT_NAME, AVG(e.SALARY) AS AVERAGE_SALARY
FROM departments d
JOIN employees e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
GROUP BY d.DEPARTMENT_NAME;

