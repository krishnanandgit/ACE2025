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
-- Table structure for table `skill`
--

DROP TABLE IF EXISTS `skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `skill` (
  `skill_id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`skill_id`),
  UNIQUE KEY `skill_id_UNIQUE` (`skill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skill`
--

LOCK TABLES `skill` WRITE;
/*!40000 ALTER TABLE `skill` DISABLE KEYS */;
INSERT INTO `skill` VALUES (1,'Programming'),(2,'Graphic Design'),(3,'Data Entry'),(4,'Web Development'),(5,'Copywriting'),(6,'Digital Marketing'),(7,'Video Editing'),(8,'Translation'),(9,'Mobile App Development'),(10,'SEO Optimization'),(11,'Illustration'),(12,'Content Writing'),(13,'Social Media Management'),(14,'Database Management'),(15,'UI/UX Design'),(16,'Customer Support'),(17,'3D Modeling'),(18,'Photography'),(19,'Virtual Assistance'),(20,'E-commerce Management'),(21,'Animation'),(22,'Transcription'),(23,'Voiceover'),(24,'Game Development'),(25,'Audio Production'),(26,'Illustrator'),(27,'Excel'),(28,'PowerPoint'),(29,'Adobe Photoshop'),(30,'Wordpress Development'),(31,'Data Analysis'),(32,'Financial Consulting'),(33,'Legal Writing'),(34,'Illustrator'),(35,'Video Production'),(36,'Blockchain Development'),(37,'Logo Design'),(38,'Article Writing'),(39,'Project Management'),(40,'Salesforce Development'),(41,'Network Administration'),(42,'Script Writing'),(43,'Proofreading'),(44,'Amazon Web Services (AWS)'),(45,'React Native Development'),(46,'Game Design'),(47,'Machine Learning'),(48,'UI Design'),(49,'SEO Writing'),(50,'Social Media Marketing');
/*!40000 ALTER TABLE `skill` ENABLE KEYS */;
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
