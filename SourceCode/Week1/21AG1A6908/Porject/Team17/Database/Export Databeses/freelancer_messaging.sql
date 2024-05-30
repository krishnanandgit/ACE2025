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
-- Table structure for table `messaging`
--

DROP TABLE IF EXISTS `messaging`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `messaging` (
  `message_id` int NOT NULL,
  `sender_id` int NOT NULL,
  `receiver_id` int NOT NULL,
  `message` varchar(445) NOT NULL,
  PRIMARY KEY (`message_id`),
  UNIQUE KEY `message_id_UNIQUE` (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messaging`
--

LOCK TABLES `messaging` WRITE;
/*!40000 ALTER TABLE `messaging` DISABLE KEYS */;
INSERT INTO `messaging` VALUES (1,101,201,'Hi there, Im interested in your services.'),(2,201,101,'Hello! Sure, Id be happy to help. What do you need?'),(3,102,202,'Ive reviewed your proposal and Im impressed.'),(4,202,102,'Thank you! Let me know if you have any questions.'),(5,103,203,'Could you provide more details about your experience?'),(6,203,103,'Certainly! Heres a summary of my skills and projects.'),(7,104,204,'I need this project completed urgently.'),(8,204,104,'Understood. Ill prioritize it and keep you updated.'),(9,105,205,'Can we schedule a call to discuss the project?'),(10,205,105,'Sure, let me know your availability.'),(11,106,206,'When do you need this project completed?'),(12,206,106,'I need it done by the end of next week.'),(13,107,207,'Your proposal looks good, but can you adjust the budget?'),(14,207,107,'I can adjust it slightly. Let me know your limit.'),(15,108,208,'Do you have any specific requirements for the project?'),(16,208,108,'Yes, here are the detailed requirements.'),(17,109,209,'Im not satisfied with the progress. Can we discuss?'),(18,209,109,'Sure, lets schedule a meeting to address your concerns.'),(19,110,210,'Your work has exceeded my expectations.'),(20,210,110,'Thank you! Im glad youre satisfied with the results.'),(21,111,211,'Im interested in collaborating on a project.'),(22,211,111,'That sounds great! Lets discuss the details.'),(23,112,212,'Can you provide examples of your previous work?'),(24,212,112,'Certainly! Here are some samples of my work.'),(25,113,213,'What is your availability for the next few weeks?'),(26,213,113,'Im available most weekdays. What works for you?'),(27,114,214,'I need this project completed urgently.'),(28,214,114,'Ill prioritize it and keep you updated on the progress.'),(29,115,215,'Could you provide a timeline for the project?'),(30,215,115,'Sure, heres an estimated timeline for the project.'),(31,116,216,'Your work is exceptional!'),(32,216,116,'Thank you! I appreciate your feedback.'),(33,117,217,'Can we discuss some changes to the project?'),(34,217,117,'Of course, let me know what changes you have in mind.'),(35,118,218,'Im impressed with the quality of your work.'),(36,218,118,'Thank you! I strive to deliver the best quality.'),(37,119,219,'I need an update on the progress of the project.'),(38,219,119,'Ill provide you with an update by the end of the day.'),(39,120,220,'When can we schedule a meeting to discuss the project?'),(40,220,120,'Im available tomorrow afternoon. Does that work for you?'),(41,121,221,'Your skills are exactly what Im looking for.'),(42,221,121,'Im glad to hear that! Lets discuss your project in detail.'),(43,122,222,'Can you provide references from previous clients?'),(44,222,122,'Sure, Ill provide you with references shortly.'),(45,123,223,'I need this project completed as soon as possible.'),(46,223,123,'Understood. Ill prioritize it and keep you updated.'),(47,124,224,'Your work is not up to the expected standard.'),(48,224,124,'I apologize for the inconvenience. Ill make the necessary adjustments.'),(49,125,225,'Can you provide an update on the project timeline?'),(50,225,125,'Sure, heres the updated timeline for the project.');
/*!40000 ALTER TABLE `messaging` ENABLE KEYS */;
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
