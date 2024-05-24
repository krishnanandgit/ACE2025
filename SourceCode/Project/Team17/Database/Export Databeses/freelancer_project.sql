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
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
  `project_id` int NOT NULL,
  `title` varchar(255) NOT NULL,
  `description` varchar(245) NOT NULL,
  `deadline` varchar(245) NOT NULL,
  `category_id` varchar(225) NOT NULL,
  `client_id` varchar(225) NOT NULL,
  PRIMARY KEY (`project_id`),
  UNIQUE KEY `project_id_UNIQUE` (`project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (1,'E-commerce Website Development','Develop an e-commerce website with user-friendly interface and payment integration.','2024-07-15','101','201'),(2,'Mobile App Design','Design a user-friendly mobile app for both iOS and Android platforms.','2024-07-20','102','202'),(3,'Content Writing for Blog','Write SEO-optimized articles for a blog covering various topics.','2024-07-25','103','203'),(4,'Social Media Marketing Campaign','Plan and execute a social media marketing campaign to increase brand awareness.','2024-07-30','104','204'),(5,'Data Analysis for Sales Report','Analyze sales data to identify trends and opportunities for improvement.','2024-08-05','105','205'),(6,'Video Editing for YouTube Channel','Edit and enhance video content for a YouTube channel.','2024-08-10','106','206'),(7,'Photography Project','Capture high-quality photographs for a marketing campaign.','2024-08-15','107','207'),(8,'Virtual Assistance for Administrative Tasks','Provide virtual assistance for scheduling and organizing tasks.','2024-08-20','108','208'),(9,'Software Development for CRM System','Develop a custom CRM system tailored to the clients needs.','2024-08-25','109','209'),(10,'Project Management for Product Launch','Coordinate and manage tasks for the successful launch of a new product.','2024-08-30','110','210'),(11,'Technical Writing for User Manuals','Create user manuals and technical documentation for a software product.','2024-09-05','111','211'),(12,'SEO Optimization for Website','Optimize website content and structure for better search engine rankings.','2024-09-10','112','212'),(13,'Web Design for Online Store','Design a visually appealing and user-friendly website for an online store.','2024-09-15','113','213'),(14,'Content Strategy for Marketing Campaign','Develop a content strategy to engage and attract the target audience.','2024-09-20','114','214'),(15,'Video Production for Advertisement','Produce a promotional video for an upcoming product launch.','2024-09-25','115','215'),(16,'Translation of Documents','Translate documents from English to Spanish for a global audience.','2024-09-30','116','216'),(17,'Data Entry and Analysis','Enter and analyze data for a market research project.','2024-10-05','117','217'),(18,'Social Media Management for Brand','Manage social media accounts and engage with followers.','2024-10-10','118','218'),(19,'Game Development for Mobile','Develop a mobile game with engaging gameplay and attractive graphics.','2024-10-15','119','219'),(20,'Graphic Design for Branding','Design logos, banners, and graphics for brand identity.','2024-10-20','120','220'),(21,'Mobile App Design for Travel','Design a mobile app for booking flights and hotels.','2024-10-25','121','221'),(22,'Voice Over for Advertisement','Record voice-overs for radio and television advertisements.','2024-10-30','122','222'),(23,'Data Science for Predictive Analytics','Apply data science techniques to predict future trends.','2024-11-05','123','223'),(24,'Illustration for Children\'s Book','Create illustrations for a children\'s book project.','2024-11-10','124','224'),(25,'Editing and Proofreading of Documents','Edit and proofread documents for grammar and style.','2024-11-15','125','225'),(26,'Virtual Reality Application Development','Develop virtual reality applications for training purposes.','2024-11-20','126','226'),(27,'Market Research and Analysis','Conduct market research and analyze market trends.','2024-11-25','127','227'),(28,'Web Development for Corporate Website','Develop a corporate website with modern design and functionality.','2024-11-30','128','228'),(29,'Content Writing for Website','Write compelling content for website pages and blog posts.','2024-12-05','129','229'),(30,'Video Editing for Social Media','Edit videos for social media platforms to increase engagement.','2024-12-10','130','230'),(31,'Social Media Advertising Campaign','Run targeted advertising campaigns on social media platforms.','2024-12-15','131','231'),(32,'Data Analysis and Statistical Modeling','Analyze data and create statistical models for business insights.','2024-12-20','132','232'),(33,'SEO and SEM Optimization','Optimize websites for search engines and run SEM campaigns.','2024-12-25','133','233'),(34,'Game Design for PC','Design a PC game with immersive gameplay and captivating story.','2024-12-30','134','234'),(35,'UI/UX Design for Mobile App','Design intuitive user interfaces and seamless user experiences for mobile apps.','2025-01-05','135','235'),(36,'Print Design for Marketing Materials','Design brochures, flyers, and posters for marketing campaigns.','2025-01-10','136','236'),(37,'Content Strategy for Blog','Develop a content strategy to increase traffic and engagement on a blog.','2025-01-15','137','237'),(38,'Web Development for E-commerce','Develop an e-commerce website with secure payment integration.','2025-01-20','138','238'),(39,'Mobile App Development for iOS','Develop a mobile app specifically for the iOS platform.','2025-01-25','139','239'),(40,'Copywriting and Editing Services','Provide copywriting and editing services for marketing materials.','2025-01-30','140','240'),(41,'Video Production for Corporate Event','Produce videos for a corporate event including highlights and testimonials.','2025-02-05','141','241'),(42,'Social Media Management for Small Businesses','Manage social media accounts for small businesses to increase visibility.','2025-02-10','142','242'),(43,'Web Design and Responsive Design','Design websites with responsive layouts for optimal viewing on all devices.','2025-02-15','143','243'),(44,'SEO and Content Optimization','Optimize website content and structure for better search engine rankings.','2025-02-20','144','244'),(45,'Data Entry for Research Project','Enter and organize data for a research project.','2025-02-25','145','245'),(46,'Graphic Design for Marketing Campaign','Design graphics and visual elements for marketing campaigns.','2025-03-02','146','246'),(47,'Software Development for Web Applications','Develop web applications with custom features and functionalities.','2025-03-07','147','247'),(48,'Game Development and Testing for Console','Develop and test a game for a gaming console platform.','2025-03-12','148','248'),(49,'UI Design for Web Application','Design user interfaces for web applications with focus on usability.','2025-03-17','149','249'),(50,'Web Development for Content Management System','Develop websites with content management systems for easy content updates.','2025-03-22','150','250');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
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
