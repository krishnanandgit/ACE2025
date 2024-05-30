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
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `payment_id` int NOT NULL,
  `amount` varchar(45) NOT NULL,
  `date` date NOT NULL,
  `status` varchar(45) NOT NULL,
  `client_id` varchar(45) NOT NULL,
  `freelancer_id` varchar(45) NOT NULL,
  PRIMARY KEY (`payment_id`),
  UNIQUE KEY `payment_id_UNIQUE` (`payment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (1,'100.00','2024-05-01','Completed','101','201'),(2,'150.00','2024-05-02','Completed','102','202'),(3,'200.00','2024-05-03','Completed','103','203'),(4,'120.00','2024-05-04','Completed','104','204'),(5,'180.00','2024-05-05','Completed','105','205'),(6,'250.00','2024-05-06','Completed','106','206'),(7,'300.00','2024-05-07','Completed','107','207'),(8,'90.00','2024-05-08','Completed','108','208'),(9,'180.00','2024-05-09','Completed','109','209'),(10,'150.00','2024-05-10','Completed','110','210'),(11,'200.00','2024-05-11','Completed','111','211'),(12,'120.00','2024-05-12','Completed','112','212'),(13,'140.00','2024-05-13','Completed','113','213'),(14,'160.00','2024-05-14','Completed','114','214'),(15,'220.00','2024-05-15','Completed','115','215'),(16,'90.00','2024-05-16','Completed','116','216'),(17,'110.00','2024-05-17','Completed','117','217'),(18,'130.00','2024-05-18','Completed','118','218'),(19,'240.00','2024-05-19','Completed','119','219'),(20,'190.00','2024-05-20','Completed','120','220'),(21,'170.00','2024-05-21','Completed','121','221'),(22,'200.00','2024-05-22','Completed','122','222'),(23,'220.00','2024-05-23','Completed','123','223'),(24,'130.00','2024-05-24','Completed','124','224'),(25,'160.00','2024-05-25','Completed','125','225'),(26,'190.00','2024-05-26','Completed','126','226'),(27,'220.00','2024-05-27','Completed','127','227'),(28,'110.00','2024-05-28','Completed','128','228'),(29,'130.00','2024-05-29','Completed','129','229'),(30,'150.00','2024-05-30','Completed','130','230'),(31,'170.00','2024-05-31','Completed','131','231'),(32,'200.00','2024-06-01','Completed','132','232'),(33,'220.00','2024-06-02','Completed','133','233'),(34,'120.00','2024-06-03','Completed','134','234'),(35,'140.00','2024-06-04','Completed','135','235'),(36,'160.00','2024-06-05','Completed','136','236'),(37,'180.00','2024-06-06','Completed','137','237'),(38,'200.00','2024-06-07','Completed','138','238'),(39,'220.00','2024-06-08','Completed','139','239'),(40,'240.00','2024-06-09','Completed','140','240'),(41,'260.00','2024-06-10','Completed','141','241'),(42,'280.00','2024-06-11','Completed','142','242'),(43,'300.00','2024-06-12','Completed','143','243'),(44,'320.00','2024-06-13','Completed','144','244'),(45,'340.00','2024-06-14','Completed','145','245'),(46,'360.00','2024-06-15','Completed','146','246'),(47,'380.00','2024-06-16','Completed','147','247'),(48,'400.00','2024-06-17','Completed','148','248'),(49,'420.00','2024-06-18','Completed','149','249'),(50,'440.00','2024-06-19','Completed','150','250');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
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
