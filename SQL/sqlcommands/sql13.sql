
select * from employee_old where DEPTNO in (select iddepartment from department);