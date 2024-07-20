
DROP TABLE IF EXISTS `driver`;

CREATE TABLE `driver` (
  `DriverID` int NOT NULL,
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  `LicenseNumber` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`DriverID`)
) 
LOCK TABLES `driver` WRITE;
INSERT INTO `driver` VALUES (1,'John','Doe','johndoe@example.com','123-456-7890','DL123456'),(2,'Jane','Smith','janesmith@example.com','987-654-3210','DL987654'),(3,'Bob','Johnson','bobjohnson@example.com','555-123-4567','DL555123'),(4,'Alice','Williams','alicewilliams@example.com','321-987-6543','DL321987'),(5,'Mike','Davis','mikedavis@example.com','901-555-1234','DL901555');

UNLOCK TABLES;
