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
-- Table structure for table `promotion`
--

DROP TABLE IF EXISTS `promotion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotion` (
  `promotionid` int NOT NULL,
  `channel` varchar(45) DEFAULT NULL,
  `content` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`promotionid`),
  CONSTRAINT `promotion_ibfk_1` FOREIGN KEY (`promotionid`) REFERENCES `event` (`EventID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotion`
--

LOCK TABLES `promotion` WRITE;
/*!40000 ALTER TABLE `promotion` DISABLE KEYS */;
INSERT INTO `promotion` VALUES (1,'Social Media ','Exciting Event Coming Soon    '),(2,'Email        ','Exclusive Early Bird Offers   '),(3,'Website      ','Event Agenda and Speakers     '),(4,'Flyers       ','Event Date and Location       '),(5,'Radio        ','Interview with Keynote Speaker'),(6,'Social Media ','Hands-on Workshops             '),(7,'Email        ','Special Guest Announcements    '),(8,'Website      ','Panel Discussion Details       '),(9,'Flyers       ','Meet Our Expert Speakers       '),(10,'Radio        ','Interactive Q&A Sessions       '),(11,'Social Media ','Explore New Trends             '),(12,'Email        ','Limited-Time Discount Offers   '),(13,'Website      ','Keynote Speaker Bios          '),(14,'Flyers       ','Event Schedule                 '),(15,'Radio        ','Exclusive Networking Opportunities'),(16,'Social Media ','Behind-the-Scenes Previews     '),(17,'Email        ','Workshop Registration Details  '),(18,'Website      ','Venue Layout and Directions    '),(19,'Flyers       ','Special Performances Lineup    '),(20,'Radio        ','Event Highlights               '),(21,'Social Media ','Speaker Profiles               '),(22,'Email        ','Early Access Pass Information  '),(23,'Website      ','Workshop Topics and Descriptions'),(24,'Flyers       ','Networking Session Details     '),(25,'Radio        ','Exclusive Sponsorship Opportunities'),(26,'Social Media ','Event FAQs                     '),(27,'Email        ','VIP Package Details            '),(28,'Website      ','Keynote Speaker Highlights     '),(29,'Flyers       ','Registration Deadlines         '),(30,'Radio        ','Special Discount Codes         '),(31,'Social Media ','Sponsorship Package Options    '),(32,'Email        ','Early Bird Ticket Sales        '),(33,'Website      ','Venue Amenities                '),(34,'Flyers       ','Workshop Schedule              '),(35,'Radio        ','Panel Discussion Topics        '),(36,'Social Media ','Event Merchandise Catalog      '),(37,'Email        ','Volunteer Opportunities        '),(38,'Website      ','Special Guest Bios             '),(39,'Flyers       ','Event Logistics Information    '),(40,'Radio        ','Sponsor Recognition Details    '),(41,'Social Media ','Participant Testimonials       '),(42,'Email        ','Speaker Presentation Topics    '),(43,'Website      ','Accommodation Recommendations '),(44,'Flyers       ','Interactive Workshop Details   '),(45,'Radio        ','Keynote Speech Excerpts        '),(46,'Social Media ','Networking Opportunities       '),(47,'Email        ','Early Registration Benefits    '),(48,'Website      ','Travel Information             '),(49,'Flyers       ','Event Schedule Highlights      '),(50,'Radio        ','Keynote Speaker Interviews     ');
/*!40000 ALTER TABLE `promotion` ENABLE KEYS */;
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
