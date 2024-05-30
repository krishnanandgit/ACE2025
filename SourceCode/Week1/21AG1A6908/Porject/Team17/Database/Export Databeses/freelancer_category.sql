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
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `category_id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Web Development'),(2,'Mobile App Development'),(3,'Graphic Design'),(4,'UI/UX Design'),(5,'Writing & Translation'),(6,'Digital Marketing'),(7,'Video & Animation'),(8,'Music & Audio'),(9,'Photography'),(10,'Illustration'),(11,'Social Media Management'),(12,'SEO'),(13,'Content Writing'),(14,'Copywriting'),(15,'Blogging'),(16,'Voice Over'),(17,'Logo Design'),(18,'E-commerce Development'),(19,'Game Development'),(20,'Data Entry'),(21,'Virtual Assistant'),(22,'Transcription'),(23,'3D Modeling & Rendering'),(24,'Architectural Design'),(25,'Legal Consulting'),(26,'Financial Consulting'),(27,'Business Planning'),(28,'Market Research'),(29,'Email Marketing'),(30,'Branding Services'),(31,'Resume Writing'),(32,'Proofreading & Editing'),(33,'Technical Support'),(34,'IT & Networking'),(35,'Software Testing'),(36,'Animation'),(37,'Whiteboard & Explainer Videos'),(38,'Illustration & Art'),(39,'Packaging Design'),(40,'T-shirt Design'),(41,'Legal Writing'),(42,'Medical Writing'),(43,'Academic Writing'),(44,'Scriptwriting'),(45,'Voice Talent'),(46,'Audio Production'),(47,'Sound Design'),(48,'Mixing & Mastering'),(49,'Photo Editing'),(50,'Product Photography');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
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
