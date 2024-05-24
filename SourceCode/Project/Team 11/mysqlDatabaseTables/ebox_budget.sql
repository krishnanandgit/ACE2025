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
-- Table structure for table `budget`
--

DROP TABLE IF EXISTS `budget`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `budget` (
  `budgetid` int NOT NULL,
  `ExpenseCategory` varchar(45) NOT NULL,
  `amount` int NOT NULL,
  PRIMARY KEY (`budgetid`),
  CONSTRAINT `eventid` FOREIGN KEY (`budgetid`) REFERENCES `event` (`EventID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `budget`
--

LOCK TABLES `budget` WRITE;
/*!40000 ALTER TABLE `budget` DISABLE KEYS */;
INSERT INTO `budget` VALUES (1,' Venue Rental    ',5000),(2,' Catering        ',3000),(3,' Marketing       ',2000),(4,' Speaker Fees    ',4000),(5,' Printing        ',2500),(6,' Transportation  ',3500),(7,' Equipment       ',1500),(8,' Insurance       ',2000),(9,' Venue Rental    ',4500),(10,' Catering        ',2800),(11,' Marketing       ',2200),(12,' Speaker Fees    ',4200),(13,' Printing        ',2600),(14,' Transportation  ',3200),(15,' Equipment       ',4000),(16,' Insurance       ',2700),(17,' Venue Rental    ',3800),(18,' Catering        ',4300),(19,' Marketing       ',2900),(20,' Speaker Fees    ',3300),(21,' Printing        ',2200),(22,' Transportation  ',3600),(23,' Equipment       ',1800),(24,' Insurance       ',2500),(25,' Venue Rental    ',4700),(26,' Catering        ',3100),(27,' Marketing       ',2400),(28,' Speaker Fees    ',3900),(29,' Printing        ',2000),(30,' Transportation  ',2800),(31,' Equipment       ',4200),(32,' Insurance       ',3300),(33,' Venue Rental    ',5000),(34,' Catering        ',3400),(35,' Marketing       ',2600),(36,' Speaker Fees    ',4100),(37,' Printing        ',2300),(38,' Transportation  ',3700),(39,' Equipment       ',2800),(40,' Insurance       ',2000),(41,' Venue Rental    ',4800),(42,' Catering        ',3500),(43,' Marketing       ',2700),(44,' Speaker Fees    ',4000),(45,' Printing        ',2100),(46,' Transportation  ',3800),(47,' Equipment       ',1900),(48,' Insurance       ',2600),(49,' Venue Rental    ',4900),(50,' Catering        ',3200);
/*!40000 ALTER TABLE `budget` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-24 17:50:21
