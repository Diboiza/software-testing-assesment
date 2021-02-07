SELECT * FROM
    (select customers.customer_id, COUNT(orders.order_id) AS "Customer With Most Orders"
     FROM customers
              INNER JOIN orders ON customers.customer_id = orders.customer_id
     GROUP BY customers.customer_id
     ORDER BY "Customer With Most Orders" desc) AS "Customer with Most Orders"
LIMIT 1;