use sys;

CREATE TABLE Sales (
  id integer,
  product_id integer,
  product_name VARCHAR(255),
  unit_price DECIMAL(10, 2),
  quantity_sold integer,
  discount_amount DECIMAL(10, 2),
  tax_rate DECIMAL(5, 2),
  shipping_cost DECIMAL(10, 2),
  handling_fee  DECIMAL(10, 2)
);

insert into Sales value (1,1,'Laptop',999.99,2,0.00,5,10.50,5.25);
insert into Sales value (2,2,'Smartphone',599.50,5,25.75,7.5,5.75,3.25),
(3,3,'Headphones',79.99,10,5.00,5,2.99,1.50);

SELECT *FROM Sales;