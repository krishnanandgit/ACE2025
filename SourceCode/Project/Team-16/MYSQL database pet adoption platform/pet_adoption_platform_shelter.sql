-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: pet_adoption_platform
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
-- Table structure for table `shelter`
--

DROP TABLE IF EXISTS `shelter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shelter` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `contact_info` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shelter`
--

LOCK TABLES `shelter` WRITE;
/*!40000 ALTER TABLE `shelter` DISABLE KEYS */;
INSERT INTO `shelter` VALUES (1,'Hyderabad Animal Haven','12A Banjara Hills, Hyderabad, India','Phone: +91 98765 43210, Email: info@hyderabadanimalhaven.org'),(2,'Hyderabad Paw Prints Rescue','34 Jubilee Hills, Hyderabad, India','Phone: +91 87654 32109, Email: rescue@hyderabadpawprints.org'),(3,'Hyderabad Pet Palace','56 Kondapur, Hyderabad, India','Phone: +91 76543 21098, Email: adopt@hyderabadpetpalace.org'),(4,'Hyderabad Furry Friends Sanctuary','78 Hitech City, Hyderabad, India','Phone: +91 65432 10987, Email: sanctuary@hyderabadfurryfriends.org'),(5,'Hyderabad Paws for Love','90 Gachibowli, Hyderabad, India','Phone: +91 54321 09876, Email: love@hyderabadpaws.org'),(6,'Hyderabad Animal Rescue Society','101 Madhapur, Hyderabad, India','Phone: +91 43210 98765, Email: rescue@hyderabadanimalrescue.org'),(7,'Hyderabad Feline Friends Haven','112 Ameerpet, Hyderabad, India','Phone: +91 32109 87654, Email: info@hyderabadfelinefriends.org'),(8,'Hyderabad Woof & Whisker Shelter','124 Manikonda, Hyderabad, India','Phone: +91 21098 76543, Email: shelter@hyderabadwoofwhisker.org'),(9,'Hyderabad Pet Haven','136 Habsiguda, Hyderabad, India','Phone: +91 10987 65432, Email: info@hyderabadpethaven.org'),(10,'Hyderabad Animal Aid','148 Kukatpally, Hyderabad, India','Phone: +91 98765 43210, Email: help@hyderabadanimalaid.org');
/*!40000 ALTER TABLE `shelter` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-24 16:49:05
