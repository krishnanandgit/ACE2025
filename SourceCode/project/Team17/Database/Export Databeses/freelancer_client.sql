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
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `client_id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`client_id`),
  UNIQUE KEY `client_id_UNIQUE` (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'John Doe','john.doe@gmail.com'),(2,'Jane Smith','jane.smith@gmail.com'),(3,'Michael Johnson','michael.johnson@gmail.com'),(4,'Emily Brown','emily.brown@gmail.com'),(5,'William Taylor','william.taylor@gmail.com'),(6,'Olivia Anderson','olivia.anderson@gmail.com'),(7,'James Martinez','james.martinez@gmail.com'),(8,'Sophia Wilson','sophia.wilson@gmail.com'),(9,'Alexander Lee','alexander.lee@gmail.com'),(10,'Isabella Lopez','isabella.lopez@gmail.com'),(11,'Daniel Gonzalez','daniel.gonzalez@gmail.com'),(12,'Charlotte Harris','charlotte.harris@gmail.com'),(13,'Liam Clark','liam.clark@gmail.com'),(14,'Ava Lewis','ava.lewis@gmail.com'),(15,'Mason Walker','mason.walker@gmail.com'),(16,'Amelia Hall','amelia.hall@gmail.com'),(17,'Ethan Green','ethan.green@gmail.com'),(18,'Harper Adams','harper.adams@gmail.com'),(19,'Michaela Baker','michaela.baker@gmail.com'),(20,'Noah Hill','noah.hill@gmail.com'),(21,'Sophia Allen','sophia.allen@gmail.com'),(22,'Benjamin Young','benjamin.young@gmail.com'),(23,'Avery Garcia','avery.garcia@gmail.com'),(24,'Emma Martinez','emma.martinez@gmail.com'),(25,'Jackson Rodriguez','jackson.rodriguez@gmail.com'),(26,'Olivia Martinez','olivia.martinez@gmail.com'),(27,'Lucas Smith','lucas.smith@gmail.com'),(28,'Sophia Johnson','sophia.johnson@gmail.com'),(29,'Mia Brown','mia.brown@gmail.com'),(30,'Aiden Davis','aiden.davis@gmail.com'),(31,'Isabella Rodriguez','isabella.rodriguez@gmail.com'),(32,'Liam Wilson','liam.wilson@gmail.com'),(33,'Harper Moore','harper.moore@gmail.com'),(34,'Elijah Perez','elijah.perez@gmail.com'),(35,'Amelia Martin','amelia.martin@gmail.com'),(36,'Mason Thompson','mason.thompson@gmail.com'),(37,'Charlotte White','charlotte.white@gmail.com'),(38,'Ethan Taylor','ethan.taylor@gmail.com'),(39,'Aria Wilson','aria.wilson@gmail.com'),(40,'Logan Anderson','logan.anderson@gmail.com'),(41,'Avery Wilson','avery.wilson@gmail.com'),(42,'Ella Martinez','ella.martinez@gmail.com'),(43,'Grayson Brown','grayson.brown@gmail.com'),(44,'Mia Lee','mia.lee@gmail.com'),(45,'Liam Jackson','liam.jackson@gmail.com'),(46,'Charlotte Smith','charlotte.smith@gmail.com'),(47,'William Clark','william.clark@gmail.com'),(48,'Aria Taylor','aria.taylor@gmail.com'),(49,'James Thomas','james.thomas@gmail.com'),(50,'Ava Thompson','ava.thompson@gmail.com');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
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
