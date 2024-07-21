
DROP TABLE IF EXISTS delivery;
CREATE TABLE delivery(
  DeliveryID int primary key NOT NULL,
  OrderID int,
  DriverID int,
  DeliveryDate date,
  DeliveryTime time,
  FOREIGN KEY (OrderID) REFERENCES order(OrderID),
  FOREIGN KEY (DriverID) REFERENCES driver(DriverID)
);
INSERT INTO delivery VALUES (1,1,1,'2024-05-01','12:00:00');
INSERT INTO delivery VALUES(2,2,2,'2024-05-02','13:00:00');
INSERT INTO delivery VALUES(3,3,3,'2024-05-03','14:00:00');

