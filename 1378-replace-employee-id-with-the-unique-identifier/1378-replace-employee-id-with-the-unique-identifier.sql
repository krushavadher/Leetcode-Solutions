# Write your MySQL query statement below
SELECT u.unique_id,e.name FROM Employees e left join EmployeeUNI u  on e.id=u.id;