
DROP TABLE IF EXISTS order;
CREATE TABLE order (
  OrderID int NOT NULL,
  CustomerID int DEFAULT NULL,
  RestaurantID int DEFAULT NULL,
  OrderDate date DEFAULT NULL,
  TotalAmount decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (OrderID),
  FOREIGN KEY (CustomerID) REFERENCES customer (CustomerID),
  FOREIGN KEY (RestaurantID) REFERENCES restaurant (RestaurantID)
); 

INSERT INTO order VALUES (1,1,1,'2024-05-01',20.00);
INSERT INTO order VALUES(2,2,2,'2024-05-02',30.00);
INSERT INTO order VALUES(3,3,3,'2024-05-03',25.00);
INSERT INTO order VALUES(4,4,4,'2024-05-04',18.00);
INSERT INTO order VALUES(5,5,5,'2024-05-05',22.00);

