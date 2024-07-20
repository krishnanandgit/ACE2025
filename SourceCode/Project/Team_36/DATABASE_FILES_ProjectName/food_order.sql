
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `OrderID` int NOT NULL,
  `CustomerID` int DEFAULT NULL,
  `RestaurantID` int DEFAULT NULL,
  `OrderDate` date DEFAULT NULL,
  `TotalAmount` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`OrderID`),
  KEY `CustomerID` (`CustomerID`),
  KEY `RestaurantID` (`RestaurantID`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`),
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`RestaurantID`) REFERENCES `restaurant` (`RestaurantID`)
) 
LOCK TABLES `order` WRITE;

INSERT INTO `order` VALUES (1,1,1,'2024-05-01',20.00),(2,2,2,'2024-05-02',30.00),(3,3,3,'2024-05-03',25.00),(4,4,4,'2024-05-04',18.00),(5,5,5,'2024-05-05',22.00);

UNLOCK TABLES;
