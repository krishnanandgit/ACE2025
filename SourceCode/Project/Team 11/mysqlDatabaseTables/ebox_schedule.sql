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
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedule` (
  `ScheduleID` int NOT NULL,
  `TimeSlot` varchar(20) NOT NULL,
  `Activity` varchar(20) NOT NULL,
  PRIMARY KEY (`ScheduleID`),
  CONSTRAINT `schedule_ibfk_1` FOREIGN KEY (`ScheduleID`) REFERENCES `event` (`EventID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule`
--

LOCK TABLES `schedule` WRITE;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
INSERT INTO `schedule` VALUES (1,'09:00 - 10:00 ','Registration        '),(2,'10:00 - 11:30 ','Keynote Address     '),(3,'11:30 - 12:30 ','Panel Discussion    '),(4,'12:00 - 13:00 ','Lunch Break         '),(5,'13:00 - 14:30 ','Music Performance   '),(6,'09:30 - 10:30 ','Workshop Session    '),(7,'10:45 - 12:00 ','Networking Session  '),(8,'12:00 - 13:00 ','Lunch Break         '),(9,'10:00 - 11:00 ','Seminar             '),(10,'11:15 - 12:30 ','Panel Discussion    '),(11,'12:30 - 13:30 ','Break               '),(12,'14:00 - 15:00 ','Workshop Session    '),(14,'16:45 - 17:45 ','Q&A Session         '),(15,'09:00 - 10:00 ','Check-in            '),(16,'10:15 - 11:30 ','Interactive Workshop'),(17,'11:45 - 12:45 ','Lunch Break         '),(18,'10:30 - 11:30 ','Networking Session  '),(20,'13:00 - 14:00 ','Lunch Break         '),(22,'10:45 - 12:00 ','Workshop Session    '),(23,'12:00 - 13:00 ','Lunch Break         '),(24,'09:00 - 10:00 ','Welcome Address     '),(25,'10:15 - 11:30 ','Panel Discussion    '),(26,'11:45 - 12:45 ','Lunch Break         '),(27,'09:30 - 10:30 ','Keynote Address     '),(28,'10:45 - 12:00 ','Workshop Session    '),(29,'12:00 - 13:00 ','Lunch Break         '),(31,'10:15 - 11:30 ','Networking Session  '),(32,'11:45 - 12:45 ','Lunch Break         '),(34,'10:45 - 12:00 ','Workshop Session    '),(35,'12:00 - 13:00 ','Lunch Break         '),(36,'09:00 - 10:00 ','Check-in            '),(37,'10:15 - 11:30 ','Interactive Session '),(38,'11:45 - 12:45 ','Lunch Break         '),(39,'09:30 - 10:30 ','Workshop Session    '),(40,'10:45 - 12:00 ','Panel Discussion    '),(41,'12:00 - 13:00 ','Lunch Break         '),(42,'09:00 - 10:00 ','Keynote Address     '),(44,'11:45 - 12:45 ','Lunch Break         '),(45,'09:30 - 10:30 ','Workshop Session    '),(46,'10:45 - 12:00 ','Networking Session  '),(47,'12:00 - 13:00 ','Lunch Break         '),(48,'09:00 - 10:00 ','Seminar             '),(49,'10:15 - 11:30 ','Panel Discussion    '),(50,'11:45 - 12:45 ','Lunch Break         ');
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;
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
