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
-- Table structure for table `freelancer`
--

DROP TABLE IF EXISTS `freelancer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `freelancer` (
  `freelancer_id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `portfolio_id` int NOT NULL,
  `skills` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`freelancer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `freelancer`
--

LOCK TABLES `freelancer` WRITE;
/*!40000 ALTER TABLE `freelancer` DISABLE KEYS */;
INSERT INTO `freelancer` VALUES (1,'John Doe','john.doe@gmail.com',101,'Web Development, Graphic Design'),(2,'Jane Smith','jane.smith@gmail.com',102,'Copywriting, SEO'),(3,'Michael Johnson','michael.johnson@gmail.com',103,'Mobile App Development, UI/UX Design'),(4,'Emily Brown','emily.brown@gmail.com',104,'Social Media Marketing, Content Writing'),(5,'David Wilson','david.wilson@gmail.com',105,'Data Analysis, Machine Learning'),(6,'Sarah Taylor','sarah.taylor@gmail.com',106,'Video Editing, Animation'),(7,'James Martinez','james.martinez@gmail.com',107,'Photography, Illustration'),(8,'Jessica Anderson','jessica.anderson@gmail.com',108,'Virtual Assistance, Customer Support'),(9,'Daniel Thomas','daniel.thomas@gmail.com',109,'Software Development, Database Management'),(10,'Olivia Garcia','olivia.garcia@gmail.com',110,'Project Management, Business Analysis'),(11,'William Rodriguez','william.rodriguez@gmail.com',111,'Technical Writing, Proofreading'),(12,'Sophia Hernandez','sophia.hernandez@gmail.com',112,'SEO, Digital Marketing'),(13,'Ethan Lopez','ethan.lopez@gmail.com',113,'Web Design, E-commerce'),(14,'Ava Martinez','ava.martinez@gmail.com',114,'Content Strategy, Blogging'),(15,'Alexander Gonzalez','alexander.gonzalez@gmail.com',115,'Video Production, Sound Design'),(16,'Mia Perez','mia.perez@example.com',116,'Translation, Localization'),(17,'Benjamin Lee','benjamin.lee@gmail.com',117,'Data Entry, Administrative Support'),(18,'Charlotte Lewis','charlotte.lewis@gmail.com',118,'Social Media Management, Influencer Marketing'),(19,'Jackson Walker','jackson.walker@gmail.com',119,'Game Development, Unity 3D'),(20,'Madison Hall','madison.hall@gmail.com',120,'Graphic Design, Branding'),(21,'Aiden Young','aiden.young@gmail.com',121,'Mobile App Design, Wireframing'),(22,'Chloe Scott','chloe.scott@gmail.com',122,'Voice Over, Narration'),(23,'Sebastian King','sebastian.king@gmail.com',123,'Data Science, Predictive Analytics'),(24,'Zoe Green','zoe.green@gmail.com',124,'Illustration, Concept Art'),(25,'Gabriel Adams','gabriel.adams@gmail.com',125,'Copyediting, Proofreading'),(26,'Avery Hill','avery.hill@gmail.com',126,'Virtual Reality, Augmented Reality'),(27,'Sofia Baker','sofia.baker@gmail.com',127,'Market Research, Survey Design'),(28,'Matthew Campbell','matthew.campbell@gmail.com',128,'Web Development, Frontend Frameworks'),(29,'Emma Cook','emma.cook@gmail.com',129,'Content Writing, Technical Documentation'),(30,'Ryan Mitchell','ryan.mitchell@gmail.com',130,'Video Editing, Motion Graphics'),(31,'Ella Nelson','ella.nelson@gmail.com',131,'Social Media Advertising, PPC Management'),(32,'Nathan Martinez','nathan.martinez@gmail.com',132,'Data Analysis, Statistical Modeling'),(33,'Lily White','lily.white@gmail.com',133,'SEO, SEM'),(34,'Christopher Thompson','christopher.thompson@gmail.com',134,'Game Design, Level Design'),(35,'Addison Harris','addison.harris@gmail.com',135,'UI/UX Design, Prototyping'),(36,'Grace Carter','grace.carter@gmail.com',136,'Graphic Design, Print Design'),(37,'Lucas Robinson','lucas.robinson@gmail.com',137,'Content Strategy, Content Marketing'),(38,'Aria Hall','aria.hall@gmail.com',138,'Web Development, Backend Programming'),(39,'Samuel Young','samuel.young@gmail.com',139,'Mobile App Development'),(40,'Aubrey Wright','aubrey.wright@gmail.com',140,'Copywriting, Editing'),(41,'Brooklyn King','brooklyn.king@gmail.com',141,'Video Production, Cinematography'),(42,'Evelyn Adams','evelyn.adams@gmail.com',142,'Social Media Management, Community Engagement'),(43,'Dominic Hernandez','dominic.hernandez@gmail.com',143,'Web Design, Responsive Design'),(44,'Penelope Nelson','penelope.nelson@gmail.com',144,'SEO, Content Optimization'),(45,'Henry Roberts','henry.roberts@gmail.com',145,'Data Entry, Excel'),(46,'Mila Morris','mila.morris@gmail.com',146,'Graphic Design, Illustration'),(47,'Eli Turner','eli.turner@gmail.com',147,'Software Development, DevOps'),(48,'Levi Hill','levi.hill@gmail.com',148,'Game Development, Game Testing'),(49,'Willow Cox','willow.cox@gmail.com',149,'UI Design, Interaction Design'),(50,'Hudson Cooper','hudson.cooper@gmail.com',150,'Web Development, CMS Integration');
/*!40000 ALTER TABLE `freelancer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-24 11:01:12
