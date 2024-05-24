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
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `review` (
  `review_id` int NOT NULL,
  `rating` varchar(45) NOT NULL,
  `review_text` varchar(225) NOT NULL,
  `client_id` varchar(45) NOT NULL,
  `freelancer_id` varchar(45) NOT NULL,
  PRIMARY KEY (`review_id`),
  UNIQUE KEY `review_id_UNIQUE` (`review_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (1,'4','Great work, very satisfied with the results.','101','201'),(2,'5','Excellent freelancer, highly recommend!','102','202'),(3,'3','Good job overall, but could be improved.','103','203'),(4,'2','Disappointed with the quality of work.','104','204'),(5,'4','Impressed with the professionalism.','105','205'),(6,'5','Exceeded expectations, will hire again.','106','206'),(7,'3','Satisfactory work, met the requirements.','107','207'),(8,'4','Great communication throughout the project.','108','208'),(9,'2','Not satisfied with the outcome.','109','209'),(10,'5','Outstanding work, delivered ahead of schedule.','110','210'),(11,'4','The freelancer was very cooperative.','111','211'),(12,'3','Average quality, could be better.','112','212'),(13,'5','Highly skilled freelancer, delivered exceptional work.','113','213'),(14,'2','Below expectations, needs improvement.','114','214'),(15,'4','Very responsive and attentive to details.','115','215'),(16,'5','Absolutely fantastic work, exceeded all expectations.','116','216'),(17,'3','Met the basic requirements but lacked creativity.','117','217'),(18,'4','Impressed with the speed of delivery.','118','218'),(19,'2','Poor communication and late delivery.','119','219'),(20,'5','Exceptional quality, highly recommended!','120','220'),(21,'4','The freelancer demonstrated great expertise.','121','221'),(22,'3','Average work, met the minimum standards.','122','222'),(23,'5','Exceeded my expectations, very satisfied.','123','223'),(24,'2','Disappointed with the final outcome.','124','224'),(25,'4','Professional attitude and quality work.','125','225'),(26,'5','Highly recommended freelancer, great experience!','126','226'),(27,'3','Satisfactory performance but room for improvement.','127','227'),(28,'4','Excellent communication and timely delivery.','128','228'),(29,'2','Did not meet the requirements as expected.','129','229'),(30,'5','Outstanding performance, exceeded my expectations.','130','230'),(31,'4','Great job, delivered on time.','131','231'),(32,'3','Fair quality work, could be better.','132','232'),(33,'5','Very impressed with the professionalism.','133','233'),(34,'2','Not satisfied with the results.','134','234'),(35,'4','Excellent service, highly recommended.','135','235'),(36,'5','Exceptional work, will definitely hire again.','136','236'),(37,'3','Met the requirements but lacked attention to detail.','137','237'),(38,'4','Good communication and quality work.','138','238'),(39,'2','Poor quality work, not worth the investment.','139','239'),(40,'5','Brilliant work, exceeded expectations.','140','240'),(41,'4','Very satisfied with the outcome.','141','241'),(42,'3','Average performance, could be improved.','142','242'),(43,'5','Highly skilled freelancer, delivered exceptional results.','143','243'),(44,'2','Disappointed with the quality of work.','144','244'),(45,'4','Impressed with the professionalism.','145','245'),(46,'5','Exceeded expectations, will hire again.','146','246'),(47,'3','Satisfactory work, met the requirements.','147','247'),(48,'4','Great communication throughout the project.','148','248'),(49,'2','Not satisfied with the outcome.','149','249'),(50,'5','Outstanding work, delivered ahead of schedule.','150','250');
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
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
