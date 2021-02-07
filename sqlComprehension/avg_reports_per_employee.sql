SELECT AVG(reports_to)
FROM employees;

SELECT SUM(employee_id)
FROM employees WHERE reports_to > (SELECT AVG(reports_to) FROM employees);