use sys;
CREATE TABLE Product1 (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255),
  price DECIMAL(10, 2),
  description TEXT,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

insert into Product1 value (1, 'Laptop',999.99,'High-performance laptop with SSD storage.', CURRENT_TIMESTAMP);
insert into Product1 value (2, 'Smartphone',599.50,'4G smartphone with advanced camera features.', CURRENT_TIMESTAMP);
insert into Product1 value (3, 'Headphones',79.99,'Wireless headphones with noise-canceling technology.', CURRENT_TIMESTAMP);

-- Select and display all products from the "Product" table sorted by name in ascending order.
SELECT * FROM Product1 ORDER BY name ASC;
-- Select and display the product with the highest price from the "Product" table.
-- Tip: max()
SELECT * FROM Product1 WHERE price = (SELECT MAX(price) FROM Product);

-- Select and display the count of products in the "Product" table.
-- Tip: count()
SELECT COUNT(*) FROM Product1;

-- Select and display all products from the "Product" table where the name contains the word "laptop" 
-- (case-insensitive).
-- Tips: lower()
SELECT * FROM Product1 WHERE LOWER(name) LIKE '%laptop%';

-- Select and display the average price of all products in the "Product" table.
-- tips: avg()
SELECT 
    AVG(price)
FROM
    Product1;


SELECT * FROM Product1 ORDER BY created_at ASC LIMIT 1;

-- Alias the sum result as "Total Price" in the output.
-- tips: sum()
SELECT SUM(price) AS "Total Price" FROM Product1;

-- Select and display the lowest price among products with names containing the word "phone" (case-insensitive). 
-- Alias the max price result as "Max Price for Phones" in the output.
-- tips: min()
SELECT MIN(price) AS "Max Price for Phones" FROM Product1 WHERE LOWER(name) LIKE '%phone%';

-- Select and display all products from the "Product" table where the description contains the word "wireless" (case-insensitive). 
-- Alias the "description" column as "Product Description" in the output.
-- tips: lower() and like
SELECT description AS "Product Description" FROM Product1 WHERE LOWER(description) LIKE '%wireless%';

select event_day as day, emp_id,sum(out_time-in_time) as total_time
from employees;
select*from Product1;
