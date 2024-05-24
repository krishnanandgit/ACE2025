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
-- Table structure for table `attendee`
--

DROP TABLE IF EXISTS `attendee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendee` (
  `Attendeeid` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`Attendeeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendee`
--

LOCK TABLES `attendee` WRITE;
/*!40000 ALTER TABLE `attendee` DISABLE KEYS */;
INSERT INTO `attendee` VALUES (1,' Aarav Patel       ',' aarav.patel@contactInfo.com       '),(2,' Diya Sharma       ',' diya.sharma@contactInfo.com       '),(3,' Advait Singh      ',' advait.singh@contactInfo.com      '),(4,' Ishaan Gupta      ',' ishaan.gupta@contactInfo.com      '),(5,' Aanya Desai       ',' aanya.desai@contactInfo.com       '),(6,' Riya Verma        ',' riya.verma@contactInfo.com        '),(7,' Arjun Reddy       ',' arjun.reddy@contactInfo.com       '),(8,' Neha Kapoor       ',' neha.kapoor@contactInfo.com       '),(9,' Krish Mehta       ',' krish.mehta@contactInfo.com       '),(10,' Avani Singh       ',' avani.singh@contactInfo.com       '),(11,' Virat Kumar       ',' virat.kumar@contactInfo.com       '),(12,' Maya Patel        ',' maya.patel@contactInfo.com        '),(13,' Rohan Sharma      ',' rohan.sharma@contactInfo.com      '),(14,' Priya Gupta       ',' priya.gupta@contactInfo.com       '),(15,' Yashvi Desai      ',' yashvi.desai@contactInfo.com      '),(16,' Aditya Verma      ',' aditya.verma@contactInfo.com      '),(17,' Anaya Reddy       ',' anaya.reddy@contactInfo.com       '),(18,' Arnav Kapoor      ',' arnav.kapoor@contactInfo.com      '),(19,' Sanvi Mehta       ',' sanvi.mehta@contactInfo.com       '),(20,' Advik Singh       ',' advik.singh@contactInfo.com       '),(21,' Saanvi Kumar      ',' saanvi.kumar@contactInfo.com      '),(22,' Aaradhya Patel    ',' aaradhya.patel@contactInfo.com    '),(23,' Vihaan Sharma     ',' vihaan.sharma@contactInfo.com     '),(24,' Kiara Gupta       ',' kiara.gupta@contactInfo.com       '),(25,' Atharv Desai      ',' atharv.desai@contactInfo.com      '),(26,' Sia Verma         ',' sia.verma@contactInfo.com         '),(27,' Ved Reddy         ',' ved.reddy@contactInfo.com         '),(28,' Myra Kapoor       ',' myra.kapoor@contactInfo.com       '),(29,' Dev Mehta         ',' dev.mehta@contactInfo.com         '),(30,' Navya Singh       ',' navya.singh@contactInfo.com       '),(31,' Aadi Kumar        ',' aadi.kumar@contactInfo.com        '),(32,' Dia Patel         ',' dia.patel@contactInfo.com         '),(33,' Rehan Sharma      ',' rehan.sharma@contactInfo.com      '),(34,' Zoya Gupta        ',' zoya.gupta@contactInfo.com        '),(35,' Kabir Desai       ',' kabir.desai@contactInfo.com       '),(36,' Anvi Verma        ',' anvi.verma@contactInfo.com        '),(37,' Veer Reddy        ',' veer.reddy@contactInfo.com        '),(38,' Pari Kapoor       ',' pari.kapoor@contactInfo.com       '),(39,' Aarohi Mehta      ',' aarohi.mehta@contactInfo.com      '),(40,' Aryan Singh       ',' aryan.singh@contactInfo.com       '),(41,' Nisha Patel       ',' nisha.patel@contactInfo.com       '),(42,' Neel Sharma       ',' neel.sharma@contactInfo.com       '),(43,' Ishika Gupta      ',' ishika.gupta@contactInfo.com      '),(44,' Rishi Desai       ',' rishi.desai@contactInfo.com       '),(45,' Aahana Verma      ',' aahana.verma@contactInfo.com      '),(46,' Avyukt Reddy      ',' avyukt.reddy@contactInfo.com      '),(47,' Avisha Kapoor     ',' avisha.kapoor@contactInfo.com     '),(48,' Vedansh Mehta     ',' vedansh.mehta@contactInfo.com     '),(49,' Anika Singh       ',' anika.singh@contactInfo.com       '),(50,' Arin Kumar        ','arin.kumar@contactInfo.com');
/*!40000 ALTER TABLE `attendee` ENABLE KEYS */;
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
