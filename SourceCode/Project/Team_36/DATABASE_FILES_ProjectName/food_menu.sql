
CREATE TABLE `menu` (
  `MenuID` int NOT NULL,
  `RestaurantID` int DEFAULT NULL,
  `ItemName` varchar(50) DEFAULT NULL,
  `Price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`MenuID`),
  KEY `RestaurantID` (`RestaurantID`),
  CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`RestaurantID`) REFERENCES `restaurant` (`RestaurantID`)
) 
LOCK TABLES `menu` WRITE;

INSERT INTO `menu` VALUES (1,1,'Burger',5.00),(2,1,'Fries',3.00),(3,2,'Pizza',12.00),(4,3,'McNuggets',6.00),(5,4,'Sub Sandwich',8.00);

UNLOCK TABLES;
