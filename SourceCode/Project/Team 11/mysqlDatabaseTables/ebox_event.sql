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
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `event` (
  `EventID` int NOT NULL,
  `Name` varchar(10) NOT NULL,
  `Date` date NOT NULL,
  `Description` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`EventID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES (1,' Event A  ','2024-01-05',' Conference on AI            '),(2,' Event B  ','2024-02-10',' Music Festival              '),(3,' Event C  ','2024-03-15',' Charity Gala                '),(4,' Event D  ','2024-04-20',' Tech Expo                   '),(5,' Event E  ','2024-05-25',' Science Fair                '),(6,' Event F  ','2024-06-30',' Film Premiere               '),(7,' Event G  ','2024-07-05',' Food Festival               '),(8,' Event H  ','2024-08-10',' Fashion Show                '),(9,' Event I  ','2024-09-15',' Sports Tournament           '),(10,' Event J  ','2024-10-20',' Book Launch                 '),(11,' Event K  ','2024-11-25',' Business Summit             '),(12,' Event L  ','2024-12-30',' Art Exhibition              '),(13,' Event M  ','2025-01-05',' Technology Conference       '),(14,' Event N  ','2025-02-10',' Music Concert               '),(15,' Event O  ','2025-03-15',' Fundraising Dinner          '),(16,' Event P  ','2025-04-20',' Product Launch              '),(17,' Event Q  ','2025-05-25',' Robotics Expo               '),(18,' Event R  ','2025-06-30',' Health & Wellness Retreat   '),(19,' Event S  ','2025-07-05',' Cultural Festival           '),(20,' Event T  ','2025-08-10',' Startup Pitch Competition   '),(21,' Event U  ','2025-09-15',' Fashion Week                '),(22,' Event V  ','2025-10-20',' Environmental Conference    '),(23,' Event W  ','2025-11-25',' Film Festival               '),(24,' Event X  ','2025-12-30',' TEDx Event                  '),(25,' Event Y  ','2026-01-05',' Culinary Workshop           '),(26,' Event Z  ','2026-02-10',' Artisan Market              '),(27,' Event AA ','2026-03-15',' Science Symposium           '),(28,' Event BB ','2026-04-20',' Business Conference         '),(29,' Event CC ','2026-05-25',' Music Awards                '),(30,' Event DD ','2026-06-30',' Food Truck Festival         '),(31,' Event EE ','2026-07-05',' Charity Run                 '),(32,' Event FF ','2026-08-10',' Educational Seminar         '),(33,' Event GG ','2026-09-15',' Dance Competition           '),(34,' Event HH ','2026-10-20',' Literary Festival           '),(35,' Event II ','2026-11-25',' Tech Talk                   '),(36,' Event JJ ','2026-12-30',' Leadership Summit           '),(37,' Event KK ','2027-01-05',' Wine Tasting                '),(38,' Event LL ','2027-02-10',' Photography Exhibition      '),(39,' Event MM ','2027-03-15',' Gaming Convention           '),(40,' Event NN ','2027-04-20',' Comedy Show                 '),(41,' Event OO ','2027-05-25',' Hackathon                   '),(42,' Event PP ','2027-06-30',' Yoga Retreat                '),(43,' Event QQ ','2027-07-05',' Fashion Expo                '),(44,' Event RR ','2027-08-10',' Leadership Workshop         '),(45,' Event SS ','2027-09-15',' Art Workshop                '),(46,' Event TT ','2027-10-20',' Robotics Workshop           '),(47,' Event UU ','2027-11-25',' Culinary Tour               '),(48,' Event VV ','2027-12-30',' Music Workshop              '),(49,' Event WW ','2028-01-05',' Cultural Exchange Program   '),(50,' Event XX ','2028-02-10',' Entrepreneurship Bootcamp  ');
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
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
