# Write your MySQL query statement below
select sp.name
from SalesPerson sp
where sp.sales_id 
not in 
(
    select o.sales_id 
    from Orders o
    join Company c
    on o.com_id = c.com_id
    where c.name= 'RED'
)

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna