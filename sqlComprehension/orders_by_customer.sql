SELECT contact_name
FROM customers WHERE contact_name LIKE 'Simon%';

--
-- As per above query there is no customer by the Name Simon Bistro
-- However will provide query for the question with cusomer Simon Crowther
--
SELECT * FROM
(select COUNT(orders.order_id) AS "Total Orders From United Package"
 FROM customers
          INNER JOIN orders ON customers.customer_id = orders.customer_id WHERE contact_name LIKE 'Simon%')
    AS "Total Orders From United Package";
