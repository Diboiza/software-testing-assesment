SELECT EXTRACT(YEAR FROM order_date), SUM(order_id)
FROM orders GROUP BY EXTRACT(YEAR FROM order_date);