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
-- Table structure for table `venue`
--

DROP TABLE IF EXISTS `venue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venue` (
  `VenueID` int NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Address` varchar(20) NOT NULL,
  PRIMARY KEY (`VenueID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venue`
--

LOCK TABLES `venue` WRITE;
/*!40000 ALTER TABLE `venue` DISABLE KEYS */;
INSERT INTO `venue` VALUES (1,'Convention Center  ','123 Main Street     '),(2,'Civic Hall         ','456 Park Avenue     '),(3,'Grand Ballroom     ','789 Broadway        '),(4,'Exhibition Center  ','1010 Elm Street     '),(5,'Conference Hall    ','1313 Oak Lane       '),(6,'Auditorium         ','1515 Maple Drive    '),(7,'Banquet Hall       ','1717 Pine Road      '),(8,'Stadium            ','1919 Cedar Boulevard'),(9,'Arena              ','2121 Walnut Avenue  '),(10,'Amphitheater       ','2323 Cherry Lane    '),(11,'Community Center   ','2525 Birch Street   '),(12,'Clubhouse          ','2727 Willow Court   '),(14,'Theater            ','3131 Oakwood Circle '),(15,'Pavilion           ','3333 Elmwood Drive  '),(16,'Sports Complex     ','3535 Maple Avenue   '),(17,'Gallery            ','3737 Birch Lane     '),(18,'Recital Hall       ','3939 Cedar Road     '),(19,'Resort             ','4141 Walnut Lane    '),(20,'Hotel Ballroom     ','4343 Cherry Street  '),(21,'Conference Center  ','4545 Pine Avenue    '),(22,'Banquet Facility   ','4747 Elm Boulevard  '),(23,'Event Space        ','4949 Maple Lane     '),(24,'Convention Hall    ','5151 Birch Avenue   '),(25,'Plaza              ','5353 Willow Street  '),(26,'Garden             ','5555 Oakcrest Drive '),(27,'Mansion            ','5757 Cedar Lane     '),(29,'Beach Resort       ','6161 Elmwood Road   '),(30,'Ballroom           ','6363 Maple Boulevard'),(31,'Banquet Center     ','6565 Birch Court    '),(32,'Conference Room    ','6767 Willow Avenue  '),(33,'Pavilion           ','6969 Cherry Lane    '),(34,'Lakeside Venue     ','7171 Pine Street    '),(35,'Skyline Hall       ','7373 Oak Avenue     '),(36,'Retreat Center     ','7575 Cedar Drive    '),(37,'Barn               ','7777 Birch Road     '),(38,'Vineyard           ','7979 Willow Lane    '),(39,'Ranch              ','8181 Maple Street   '),(41,'Mansion            ','8585 Pinecrest Court'),(42,'Manor House        ','8787 Elmwood Avenue '),(43,'Hall               ','8989 Cedar Lane     '),(44,'Terrace            ','9191 Birch Drive    '),(45,'Courtyard          ','9393 Willow Court   '),(46,'Garden Venue       ','9595 Maple Road     '),(47,'Reception Hall     ','9797 Cherry Avenue  '),(48,'Function Room      ','9999 Pine Lane      '),(49,'Lounge             ','10101 Elm Street    '),(50,'Hotel Venue        ','10303 Oak Avenue    ');
/*!40000 ALTER TABLE `venue` ENABLE KEYS */;
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
