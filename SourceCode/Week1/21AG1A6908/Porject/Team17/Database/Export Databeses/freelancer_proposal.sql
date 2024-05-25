-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: freelancer
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
-- Table structure for table `proposal`
--

DROP TABLE IF EXISTS `proposal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proposal` (
  `proposal_id` int NOT NULL,
  `bid_amount` varchar(45) NOT NULL,
  `Freelancer_id` varchar(45) NOT NULL,
  `project_id` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`proposal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proposal`
--

LOCK TABLES `proposal` WRITE;
/*!40000 ALTER TABLE `proposal` DISABLE KEYS */;
INSERT INTO `proposal` VALUES (1,'500.00','201','1','Submitted'),(2,'600.00','202','1','Submitted'),(3,'700.00','203','1','Submitted'),(4,'550.00','204','1','Submitted'),(5,'650.00','205','1','Submitted'),(6,'750.00','206','1','Submitted'),(7,'700.00','207','1','Submitted'),(8,'600.00','208','1','Submitted'),(9,'800.00','209','1','Submitted'),(10,'700.00','210','1','Submitted'),(11,'550.00','211','1','Submitted'),(12,'650.00','212','1','Submitted'),(13,'750.00','213','1','Submitted'),(14,'600.00','214','1','Submitted'),(15,'800.00','215','1','Submitted'),(16,'500.00','216','1','Submitted'),(17,'600.00','217','1','Submitted'),(18,'700.00','218','1','Submitted'),(19,'550.00','219','1','Submitted'),(20,'650.00','220','1','Submitted'),(21,'750.00','221','1','Submitted'),(22,'700.00','222','1','Submitted'),(23,'600.00','223','1','Submitted'),(24,'800.00','224','1','Submitted'),(25,'700.00','225','1','Submitted'),(26,'550.00','226','1','Submitted'),(27,'650.00','227','1','Submitted'),(28,'750.00','228','1','Submitted'),(29,'600.00','229','1','Submitted'),(30,'800.00','230','1','Submitted'),(31,'500.00','231','1','Submitted'),(32,'600.00','232','1','Submitted'),(33,'700.00','233','1','Submitted'),(34,'550.00','234','1','Submitted'),(35,'650.00','235','1','Submitted'),(36,'750.00','236','1','Submitted'),(37,'700.00','237','1','Submitted'),(38,'600.00','238','1','Submitted'),(39,'800.00','239','1','Submitted'),(40,'700.00','240','1','Submitted'),(41,'550.00','241','1','Submitted'),(42,'650.00','242','1','Submitted'),(43,'750.00','243','1','Submitted'),(44,'600.00','244','1','Submitted'),(45,'800.00','245','1','Submitted'),(46,'500.00','246','1','Submitted'),(47,'600.00','247','1','Submitted'),(48,'700.00','248','1','Submitted'),(49,'550.00','249','1','Submitted'),(50,'650.00','250','1','Submitted');
/*!40000 ALTER TABLE `proposal` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-24 11:01:13
