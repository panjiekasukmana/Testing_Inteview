SELECT emp_name, emp_status 
FROM tbl_employee;

SELECT tbl_employee.emp_name, tbl_income.emp_income
FROM tbl_employee JOIN tbl_income
ON tbl_employee.emp_code = tbl_employee.emp_code
WHERE tbl_employee.emp_status = 'R'


SELECT e.emp_name, i.emp_income
FROM tbl_employee as e JOIN tbl_income as i
ON e.emp_code = i.emp_code
WHERE e.emp_status = 'R'

SELECT e.emp_code, e.emp_nama, e.emp_status, i.emp_income
FROM tbl_employee as e JOIN tbl_income as i
ON e.emp_code = i.emp_code
ORDER BY i.emp_income ASC
