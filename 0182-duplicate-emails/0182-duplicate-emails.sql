# Write your MySQL query statement below
SELECT email
FROM Person
HAVING COUNT(*) > 1;