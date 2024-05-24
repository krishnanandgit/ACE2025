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
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `feedbackid` int NOT NULL,
  `rating` int NOT NULL,
  `comment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`feedbackid`),
  CONSTRAINT `Attendeeid` FOREIGN KEY (`feedbackid`) REFERENCES `attendee` (`Attendeeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (1,4,' Great event overall!                  '),(2,5,' Excellent organization                '),(3,3,' Venue was too crowded                 '),(4,4,' Informative sessions                  '),(5,5,' Loved the keynote                     '),(6,2,' Speakers were difficult to understand '),(7,5,' Networking opportunities were great   '),(8,3,' Food could have been better           '),(9,4,' Interesting panel discussions         '),(10,5,' Well-organized event                  '),(11,3,' Schedule was too packed               '),(12,4,' Engaging workshops                    '),(13,5,' Valuable insights from speakers       '),(14,2,' Technical glitches in presentations   '),(15,4,' Enjoyed the hands-on activities       '),(16,5,' Useful resources provided              '),(17,3,' Difficulty finding event location     '),(18,4,' Networking with peers was beneficial  '),(19,5,' Inspirational keynote speaker         '),(20,3,' Organization could have been better   '),(21,4,' Good balance of topics covered        '),(22,5,' Will recommend to colleagues          '),(23,3,' Registration process was confusing    '),(24,4,' Interesting networking opportunities '),(25,5,' Helpful event staff                   '),(26,3,' Lack of variety in sessions           '),(27,4,' Relevant content                      '),(28,5,' Enjoyed the interactive sessions      '),(29,3,' Could improve speaker selection       '),(30,4,' Appreciated the event materials       '),(31,5,' Engaging panel discussions            '),(32,3,' Lack of vegetarian food options       '),(33,4,' Well-organized networking breaks      '),(34,5,' Valuable insights gained              '),(35,3,' Difficulty with event registration    '),(36,4,' Informative keynote presentations     '),(37,5,' Excellent venue facilities             '),(38,3,' More interactive sessions needed      '),(39,4,' Enjoyed the hands-on workshops        '),(40,5,' Useful networking opportunities       '),(41,3,' Schedule was too tight                '),(42,4,' Appreciated the event agenda          '),(43,5,' Well-coordinated event               '),(44,3,' Disorganized registration process     '),(45,4,' Relevant topics discussed            '),(46,5,' Easy access to event venue            '),(47,3,' More breaks needed                    '),(48,4,' Informative speaker sessions         '),(49,5,' Well-prepared event organizers        '),(50,3,' Lack of diverse speaker panel        ');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
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
