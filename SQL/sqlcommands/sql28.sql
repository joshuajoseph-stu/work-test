select (select min(DEPTNO) from employee_old) min_id, (select max(DEPTNO) from employee_old) max_id  from dual 