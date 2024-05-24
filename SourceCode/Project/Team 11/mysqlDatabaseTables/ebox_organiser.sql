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
-- Table structure for table `organiser`
--

DROP TABLE IF EXISTS `organiser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `organiser` (
  `OrganizerID` int DEFAULT NULL,
  `personName` text,
  `Contact Info` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organiser`
--

LOCK TABLES `organiser` WRITE;
/*!40000 ALTER TABLE `organiser` DISABLE KEYS */;
INSERT INTO `organiser` VALUES (1,'John Smith        ','john@example.com         '),(2,'Emily Johnson     ','emily@example.com        '),(3,'Michael Williams  ','michael@example.com      '),(4,'Jessica Brown     ','jessica@example.com      '),(5,'Daniel Jones      ','daniel@example.com       '),(6,'Sarah Davis       ','sarah@example.com        '),(7,'Christopher Wilson','chris@example.com        '),(8,'Lisa Miller       ','lisa@example.com         '),(9,'Matthew Taylor    ','matthew@example.com      '),(10,'Ashley Anderson   ','ashley@example.com       '),(11,'David Thomas      ','david@example.com        '),(12,'Jennifer Moore    ','jennifer@example.com     '),(13,'James Jackson     ','james@example.com        '),(14,'Amanda White      ','amanda@example.com       '),(15,'Robert Harris     ','robert@example.com       '),(16,'Mary Martin       ','mary@example.com         '),(17,'William Thompson  ','william@example.com      '),(18,'Jessica Garcia    ','jessica.g@example.com    '),(19,'Christopher Martinez','chris.m@example.com     '),(20,'Linda Robinson    ','linda@example.com        '),(21,'Thomas Clark      ','thomas@example.com       '),(22,'Patricia Rodriguez','patricia@example.com     '),(23,'Charles Lewis     ','charles@example.com      '),(24,'Karen Lee         ','karen@example.com        '),(25,'Mark Walker       ','mark@example.com         '),(26,'Brenda Hall       ','brenda@example.com       '),(27,'Richard Young     ','richard@example.com      '),(28,'Megan King        ','megan@example.com        '),(29,'Timothy Scott     ','timothy@example.com      '),(30,'Laura Green       ','laura@example.com        '),(31,'Kevin Hill        ','kevin@example.com        '),(32,'Pamela Adams      ','pamela@example.com       '),(33,'Steven Baker      ','steven@example.com       '),(34,'Elizabeth Cook    ','elizabeth@example.com    '),(35,'Anthony Brooks    ','anthony@example.com      '),(36,'Ruth Rivera       ','ruth@example.com         '),(37,'Larry Nelson      ','larry@example.com        '),(38,'Helen Carter      ','helen@example.com        '),(39,'Joshua Mitchell   ','joshua@example.com       '),(40,'Deborah Perez     ','deborah@example.com      '),(41,'Samuel Roberts    ','samuel@example.com       '),(42,'Sandra Turner     ','sandra@example.com       '),(43,'Ryan Phillips     ','ryan@example.com         '),(44,'Diane Evans       ','diane@example.com        '),(45,'Pamela Murphy     ','pamela.m@example.com     '),(46,'Gary Morris       ','gary@example.com         '),(47,'Kathleen James    ','kathleen@example.com     '),(48,'Frank Nelson      ','frank@example.com        '),(49,'Christina Hill    ','christina@example.com    '),(50,'Samuel Hughes     ','samuel.h@example.com     ');
/*!40000 ALTER TABLE `organiser` ENABLE KEYS */;
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
