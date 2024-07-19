
DROP TABLE IF EXISTS `delivery`;
CREATE TABLE `delivery` (
  `DeliveryID` int NOT NULL,
  `OrderID` int DEFAULT NULL,
  `DriverID` int DEFAULT NULL,
  `DeliveryDate` date DEFAULT NULL,
  `DeliveryTime` time DEFAULT NULL,
  PRIMARY KEY (`DeliveryID`),
  KEY `OrderID` (`OrderID`),
  KEY `DriverID` (`DriverID`),
  FOREIGN KEY (`OrderID`) REFERENCES `order` (`OrderID`),
  FOREIGN KEY (`DriverID`) REFERENCES `driver` (`DriverID`)
) 
INSERT INTO `delivery` VALUES (1,1,1,'2024-05-01','12:00:00'),(2,2,2,'2024-05-02','13:00:00'),(3,3,3,'2024-05-03','14:00:00');

