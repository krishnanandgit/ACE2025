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
-- Table structure for table `sponsor`
--

DROP TABLE IF EXISTS `sponsor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sponsor` (
  `sponsorid` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `contribution` int NOT NULL,
  PRIMARY KEY (`sponsorid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sponsor`
--

LOCK TABLES `sponsor` WRITE;
/*!40000 ALTER TABLE `sponsor` DISABLE KEYS */;
INSERT INTO `sponsor` VALUES (1,' Global Enterprises         ',5000),(2,' International Industries   ',3000),(3,' Worldwide Solutions        ',7000),(4,' Universal Technologies     ',4500),(5,' Intercontinental Group     ',6000),(6,' Transnational Corporation  ',5500),(7,' Multinational Ventures     ',4000),(8,' Globalization Partners    ',6500),(9,' International Conglomerate ',4800),(10,' Worldwide Enterprises      ',5200),(11,' Global Holdings            ',7500),(12,' International Consortium  ',4200),(13,' Global Outreach            ',6800),(14,' Multinational Corporation ',4300),(15,' Universal Holdings         ',5700),(16,' International Alliance     ',3800),(17,' Global Solutions           ',7200),(18,' Transglobal Enterprises    ',4900),(19,' Worldwide Group            ',5400),(20,' Global Innovations         ',6600),(21,' International Ventures    ',4600),(22,' Global Enterprises         ',5100),(23,' Worldwide Corporation     ',7300),(24,' Multinational Holdings     ',4400),(25,' Universal Conglomerate     ',5800),(26,' International Partners     ',3700),(27,' Global Investment Group    ',7000),(28,' Transnational Enterprises  ',5000),(29,' Multinational Alliance     ',7100),(30,' Worldwide Holdings         ',5300),(31,' International Innovations ',6700),(32,' Global Corporation         ',4500),(33,' Universal Ventures         ',5900),(34,' International Holdings     ',3600),(35,' Global Conglomerate        ',6900),(36,' Worldwide Solutions        ',5200),(37,' Transglobal Group          ',7100),(38,' Multinational Innovations  ',4800),(39,' Global Holdings            ',7400),(40,' International Corporation ',4300),(41,' Universal Enterprises      ',6000),(42,' International Holdings    ',3700),(43,' Global Ventures            ',7100),(44,' Worldwide Innovations     ',5400),(45,' Multinational Solutions    ',6900),(46,' Transnational Holdings     ',4800),(47,' Global Group               ',7300),(48,' International Ventures    ',4400),(49,' Universal Corporation      ',5700),(50,' International Enterprises ',6800);
/*!40000 ALTER TABLE `sponsor` ENABLE KEYS */;
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
