CREATE DATABASE  IF NOT EXISTS `ebox` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ebox`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ebox
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `ticketid` int NOT NULL,
  `price` int DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ticketid`),
  CONSTRAINT `ticket_ibfk_1` FOREIGN KEY (`ticketid`) REFERENCES `event` (`EventID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (1,50,'Basic '),(2,100,'VIP   '),(3,30,'Basic '),(4,80,'VIP   '),(5,20,'Basic '),(6,70,'VIP   '),(7,40,'Basic '),(8,90,'VIP   '),(9,25,'Basic '),(10,60,'VIP   '),(11,35,'Basic '),(12,80,'VIP   '),(13,45,'Basic '),(14,100,'VIP   '),(15,30,'Basic '),(16,75,'VIP   '),(17,55,'Basic '),(18,110,'VIP   '),(19,60,'Basic '),(20,120,'VIP   '),(21,65,'Basic '),(22,130,'VIP   '),(23,70,'Basic '),(24,140,'VIP   '),(25,75,'Basic '),(26,150,'VIP   '),(27,80,'Basic '),(28,160,'VIP   '),(29,85,'Basic '),(30,170,'VIP   '),(31,90,'Basic '),(32,180,'VIP   '),(33,95,'Basic '),(34,190,'VIP   '),(35,100,'Basic '),(36,200,'VIP   '),(37,105,'Basic '),(38,210,'VIP   '),(39,110,'Basic '),(40,220,'VIP   '),(41,115,'Basic '),(42,230,'VIP   '),(43,120,'Basic '),(44,240,'VIP   '),(45,125,'Basic '),(46,250,'VIP   '),(47,130,'Basic '),(48,260,'VIP   '),(49,135,'Basic '),(50,270,'VIP   ');
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-24 17:50:20
