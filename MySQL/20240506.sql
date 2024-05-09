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

SELECT * FROM Product1 ORDER BY name ASC;
SELECT * FROM Product1 WHERE price = (SELECT MAX(price) FROM Product);
SELECT COUNT(*) FROM Product;
SELECT * FROM Product1 WHERE LOWER(name) LIKE '%laptop%';
SELECT AVG(price) FROM Product1;
SELECT * FROM Product1 ORDER BY created_at ASC LIMIT 1;
SELECT SUM(price) AS "Total Price" FROM Product1;
-- Select and display the lowest price among products with names containing the word "phone" (case-insensitive). 
-- Alias the max price result as "Max Price for Phones" in the output.
-- tips: min()
SELECT MIN(price) AS "Max Price for Phones" FROM Product1 WHERE LOWER(name) LIKE '%phone%';

-- Select and display all products from the "Product" table where the description contains the word "wireless" (case-insensitive). 
-- Alias the "description" column as "Product Description" in the output.
-- tips: lower() and like
SELECT description AS "Product Description" FROM Product1 WHERE LOWER(description) LIKE '%wireless%';

select*from Product1;