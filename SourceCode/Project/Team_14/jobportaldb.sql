CREATE DATABASE  IF NOT EXISTS `jobportal` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `jobportal`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: jobportal
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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`),
  CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`username`) REFERENCES `person` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=316 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (301,'adarsh','adarsh@gmail.com','hyd','adarsh1'),(302,'anish','anish@gmail.com','hyd','anish2'),(303,'akhila','akhila@gmail.com','hyd','akhila3'),(304,'shekar','shekar@gmail.com','hyd','shekar4'),(305,'pavan','pavan@gmail.com','hyd','pavan5'),(306,'sanjay','sanjay@gmail.com','hyd','sanjay6'),(307,'sathwika','sathwika@gmail.com','hyd','sathwika7'),(308,'siddharth','siddharth@gmail.com','hyd','siddharth8'),(309,'swaraj','swaraj@gmail.com','hyd','swaraj9'),(310,'durga','durga@gmail.com','hyd','durga10'),(311,'rahul','rahul@gmail.com','hyd','rahul11'),(312,'praveen','praveen@gmail.com','hyd','praveen12'),(313,'venkanna','venkanna@gmail.com','hyd','venkanna13'),(314,'bhagyalakshmi','bhagyalakshmi@gmail.com','hyd','bhagyalakshmi14'),(315,'giridhar','giridhar@gmail.com','hyd','giridhar15');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company` (
  `c_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=405 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` VALUES (401,'Amazon','hyd','Develop and execute Amazon strategies aligned with overall business goals, focusing on driving sales and increasing visibility'),(402,'Flipkart','hyd','Provide quotes and information to customers related to their products. Provide information including Delivery time and other queries related to the product'),(403,'Oracle','hyd','The roles and responsibilities of Oracle developers include designing, developing, testing and maintaining Oracle databases and applications to ensure they meet industry standards and user requirements'),(404,'TCS','hyd','Process and manage customer requests, inquiries, and transactions. Adhere to standard operating procedures (SOPs) for efficient workflow');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `feedback_id` int NOT NULL AUTO_INCREMENT,
  `description` text,
  `jobseeker_id` int DEFAULT NULL,
  PRIMARY KEY (`feedback_id`),
  KEY `jobseeker_id` (`jobseeker_id`),
  CONSTRAINT `feedback_ibfk_1` FOREIGN KEY (`jobseeker_id`) REFERENCES `jobseeker` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=716 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (701,'good',101),(702,'very good',102),(703,'excellent',103),(704,'verygood',104),(705,'good',105),(706,'bad',106),(707,'good',107),(708,'good',108),(709,'good',109),(710,'poor',110),(711,'fair',111),(712,'excellent',112),(713,'fair',113),(714,'poor',114),(715,'good',115);
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job`
--

DROP TABLE IF EXISTS `job`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `job` (
  `job_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `description` text,
  `company_id` int DEFAULT NULL,
  PRIMARY KEY (`job_id`),
  KEY `company_id` (`company_id`),
  CONSTRAINT `job_ibfk_1` FOREIGN KEY (`company_id`) REFERENCES `company` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=504 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job`
--

LOCK TABLES `job` WRITE;
/*!40000 ALTER TABLE `job` DISABLE KEYS */;
INSERT INTO `job` VALUES (501,'Junior software developer','We are an edtech startup that trains candidates for sales roles, gets them placed, and coaches them until they start making 1,00,000 per month',401),(502,'Python developer','Develop and maintain Python-based applications Assist in designing and implementing software solutions',402),(503,'Full stack web developer','Develop and execute strategies for business growth in new and existing markets',403);
/*!40000 ALTER TABLE `job` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobapplications`
--

DROP TABLE IF EXISTS `jobapplications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jobapplications` (
  `jobseeker_id` int NOT NULL,
  `job_id` int NOT NULL,
  PRIMARY KEY (`jobseeker_id`,`job_id`),
  KEY `job_id` (`job_id`),
  CONSTRAINT `jobapplications_ibfk_1` FOREIGN KEY (`jobseeker_id`) REFERENCES `jobseeker` (`id`),
  CONSTRAINT `jobapplications_ibfk_2` FOREIGN KEY (`job_id`) REFERENCES `job` (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobapplications`
--

LOCK TABLES `jobapplications` WRITE;
/*!40000 ALTER TABLE `jobapplications` DISABLE KEYS */;
INSERT INTO `jobapplications` VALUES (101,501),(104,501),(106,501),(109,501),(110,501),(111,501),(112,501),(115,501),(102,502),(107,502),(113,502),(103,503),(105,503),(108,503),(110,503),(114,503);
/*!40000 ALTER TABLE `jobapplications` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobseeker`
--

DROP TABLE IF EXISTS `jobseeker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jobseeker` (
  `id` int NOT NULL AUTO_INCREMENT,
  `j_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contact_no` varchar(15) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`),
  CONSTRAINT `jobseeker_ibfk_1` FOREIGN KEY (`username`) REFERENCES `person` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobseeker`
--

LOCK TABLES `jobseeker` WRITE;
/*!40000 ALTER TABLE `jobseeker` DISABLE KEYS */;
INSERT INTO `jobseeker` VALUES (101,'adarsh','adarsh@gmail.com','hyd','9398355679','adarsh1'),(102,'anish','anish@gmail.com','hyd','9344444678','anish2'),(103,'akhila','akhila@gmail.com','hyd','6688933756','akhila3'),(104,'shekar','shekar@gmail.com','hyd','9800006101','shekar4'),(105,'pavan','pavan@gmail.com','hyd','956006098','pavan5'),(106,'sanjay','sanjay@gmail.com','hyd','9006509689','sanjay6'),(107,'sathwika','sathwika@gmail.com','hyd','8060536845','sathwika7'),(108,'siddharth','siddharth@gmail.com','hyd','9333333331','siddharth8'),(109,'swaraj','swaraj@gmail.com','hyd','9333333332','swaraj9'),(110,'durga','durga@gmail.com','hyd','9333333333','durga10'),(111,'rahul','rahul@gmail.com','hyd','9333333334','rahul11'),(112,'praveen','praveen@gmail.com','hyd','9333333335','praveen12'),(113,'venkanna','venkanna@gmail.com','hyd','9333333336','venkanna13'),(114,'bhagyalakshmi','bhagyalakshmi@gmail.com','hyd','9333333337','bhagyalakshmi14'),(115,'giridhar','giridhar@gmail.com','hyd','9333333338','giridhar15');
/*!40000 ALTER TABLE `jobseeker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES ('adarsh1','465','adarsh@gmail.com'),('akhila3','467','akhila@gmail.com'),('anish2','466','anish@gmail.com'),('aryan16','480','aryan@gmail.com'),('balakrishna28','492','balakrishna@gmail.com'),('bhagyalakshmi14','478','bhagyalakshmi@gmail.com'),('bhargavi31','495','bhargavi@gmail.com'),('chaitanya30','494','chaitanya@gmail.com'),('dorababu24','488','dorababu@gmail.com'),('durga10','474','durga@gmail.com'),('eshwarsai33','497','eshwarsai@gmail.com'),('ganesh34','498','ganesh@gmail.com'),('giridhar15','479','giridhar@gmail.com'),('hardik23','487','hardik@gmail.com'),('karthik27','491','karthik@gmail.com'),('karunya29','493','karunya@gmail.com'),('mahantesh35','499','mahantesh@gmail.com'),('manideep21','485','manideep@gmail.com'),('manohar32','496','manohar@gmail.com'),('naveen18','482','naveen@gmail.com'),('pavan5','469','pavan@gmail.com'),('pranay26','490','pranay@gmail.com'),('praveen12','476','praveen@gmail.com'),('rahul11','475','rahul@gmail.com'),('sangeetha25','489','sangeetha@gmail.com'),('sanjay6','470','sanjay@gmail.com'),('sathvika17','481','sathvika@gmail.com'),('sathwika7','471','sathwika@gmail.com'),('shekar4','468','shekar@gmail.com'),('shiva22','486','shiva@gmail.com'),('siddharth8','472','siddharth@gmail.com'),('swaraj9','473','swaraj@gmail.com'),('veerendar19','483','veerendar@gmail.com'),('venkanna13','477','venkanna@gmail.com'),('vinay20','484','vinay@gmail.com');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resume`
--

DROP TABLE IF EXISTS `resume`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resume` (
  `resume_id` int NOT NULL AUTO_INCREMENT,
  `academic_details` text,
  `personal_details` text,
  `jobseeker_id` int DEFAULT NULL,
  PRIMARY KEY (`resume_id`),
  KEY `jobseeker_id` (`jobseeker_id`),
  CONSTRAINT `resume_ibfk_1` FOREIGN KEY (`jobseeker_id`) REFERENCES `jobseeker` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=616 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resume`
--

LOCK TABLES `resume` WRITE;
/*!40000 ALTER TABLE `resume` DISABLE KEYS */;
INSERT INTO `resume` VALUES (601,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n7.33\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n7.92\n3.	\nS.S.C	Krishnaveni Talent  School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n8.0','Date of  Birth 		: 	21-01-2003\nLanguages known     	: 	Telugu, Hindi & English\nFather’s Name          	: 	Mr. M.Haribabu\nMother’s Name          	: 	Mrs. M.Swapna\nAddress 			: 	H.no – 13-1-112, seetharambagh,mehdipatnam, Hyderabad',101),(602,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n6.33\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n7.88\n3.	\nS.S.C	balaji high  School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n8.5','Date of  Birth 		: 	21-01-2003\nLanguages known     	: 	Telugu, Hindi & English\nFather’s Name          	: 	Mr. k.kondarao\nMother’s Name          	: 	Mrs. k.swetha\nAddress 			: 	H.no – 12-1-112, seetharambagh,mehdipatnam, Hyderabad',102),(603,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n8.45\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n7.67\n3.	\nS.S.C	Goodwill HIGH School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n9.0','Date of  Birth 		: 	21-08-2003\nLanguages known     	: 	Telugu, Hindi & English\nFather’s Name          	: 	Mr. D.Hanumanthu\nMother’s Name          	: 	Mrs. D.Barathi\nAddress 			: 	H.no – 13-1-112, seetharambagh,mehdipatnam, Hyderabad',103),(604,'1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n7.56\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n8.0\n3.	\nS.S.C	Goodwill model HIGH School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n7,5','Date of  Birth 		: 	21-06-2003\nLanguages known     	: 	Telugu, Hindi & English\nFather’s Name          	: 	Mr. D.Hanumanthu\nMother’s Name          	: 	Mrs. D.Barathi\nAddress 			: 	H.no – 13-1-113/a/1 , alwal,secunderabad, Hyderabad',104),(605,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n8.45\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n7.67\n3.	\nS.S.C	Goodwill HIGH School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n9.0','Date of  Birth 		: 	18-05-2003\nLanguages known     	: 	Telugu, Hindi, English & malyalam \nFather’s Name          	: 	Mr. S.Bharath\nMother’s Name          	: 	Mrs.S.Lakshmi\nAddress 			: 	H.no – 13-1-112a21, chilkur,moinabad, Hyderabad',105),(606,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n7.97\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n7.44\n3.	\nS.S.C	st joseph HIGH School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n9.0','Date of  Birth 		: 	12-02-2003\nLanguages known     	: 	Telugu, Hindi, English\nFather’s Name          	: 	Mr. ms.subbramaniyam\nMother’s Name          	: 	Mrs.mS.subbaLakshmi\nAddress 			: 	H.no – 12-1-112a21, suncity,aziznagar, Hyderabad',106),(607,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n8.55\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n7.77\n3\nS.S.C	Goodwill HIGH School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n9.5','Date of  Birth 		: 	18-02-2004\nLanguages known     	: 	Telugu, Hindi, English & malyalam \nFather’s Name          	: 	Mr. MS.subbu\nMother’s Name          	: 	Mrs.MS.subbaLakshmi\nAddress 			: 	H.no – 13-1-112a21, chilkur,moinabad, Hyderabad',107),(608,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n8.45\n(Till Date)\n\n2.	Intermediate	Narayana\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n9.0\n3.	\nS.S.C	Goodwill HIGH School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n9.8','Date of  Birth 		: 	15-04-2004\nLanguages known     	: 	Telugu, Hindi, English & malyalam \nFather’s Name          	: 	Mr. M.Eshwarsai\nMother’s Name          	: 	Mrs.M.Kalyani\nAddress 			: 	H.no – 13-1-112a21, bodduppal, Hyderabad',108),(609,'1.	B.Tech\n(Pursuing)	ACE Engineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n8.45\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n7.79\n3.	\nS.S.C	sentence HIGH School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n9.4','Date of  Birth 		: 	19-09-2004\nLanguages known     	: 	Telugu, Hindi, English  \nFather’s Name          	: 	Mr. S.Jai\nMother’s Name          	: 	Mrs.S.sai\nAddress 			: 	H.no – 13-1-112a21, mallapur, Hyderabad',109),(610,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n9.33\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n8.67\n3.	\nS.S.C	Goodwill HIGH School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n7.33','Date of  Birth 		: 	18-05-2004\nLanguages known     	: 	Telugu, Hindi, English \nFather’s Name          	: 	Mr. M.Ganesh\nMother’s Name          	: 	Mrs.M.Sindhuri\nAddress 			: 	H.no – 13-1-112a21, chilkur,moinabad, Hyderabad',110),(611,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n7.45\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n6.67\n3.	\nS.S.C	Goodwill HIGH School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n8.98','Date of  Birth 		: 	10-01-2004\nLanguages known     	: 	Telugu, Hindi, English & malyalam \nFather’s Name          	: 	Mr. k.chaitanya\nMother’s Name          	: 	Mrs.K.chetana\nAddress 			: 	H.no – 13-1-112a21, chilkur,moinabad, Hyderabad',111),(612,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n7.45\n(Till Date)\n\n2.	Intermediate	Sri medhavi\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n6.67\n3.	\nS.S.C	loyola School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n8.98','Date of  Birth 		: 	10-01-2004\nLanguages known     	: 	Telugu, Hindi, English \nFather’s Name          	: 	Mr. G.Dorababu\nMother’s Name          	: 	Mrs.G.sowmya\nAddress 			: 	H.no – 13-3-411/a/1, bhongir, Hyderabad',112),(613,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n7.45\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n6.67\n3.	\nS.S.C	Goodwill HIGH School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n8.98','Date of  Birth 		: 	10-06-2004\nLanguages known     	: 	Telugu, Hindi, English & malyalam \nFather’s Name          	: 	Mr. N.govind raju\nMother’s Name          	: 	Mrs.N.roja\nAddress 			: 	H.no – 13-1-112a21, chilkur,moinabad, Hyderabad',113),(614,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n7.77\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n6.99\n3.	\nS.S.C	krishnaveni Talent HIGH School, Hyderabad.	Maths, Science, Social Studies	March, 2019	\n8.0','Date of  Birth 		: 	28-08-2003\nLanguages known     	: 	Telugu, Hindi, English\nFather’s Name          	: 	Mr. k.chaitanya\nMother’s Name          	: 	Mrs.K.chetana\nAddress 			: 	H.no – 13-1-112a, uppal, nagole, Hyderabad',114),(615,'\n 1.	B.Tech\n(Pursuing)	ACE \nEngineering College,\nHyderabad	Electronics & Communication Engg.	March, 2025 \n7.33\n(Till Date)\n\n2.	Intermediate	Sri Chaitanya\nJunior kalasala, Hyderabad	Maths,  \nPhysics, Chemistry.	March, 2021	\n7.44\n3.	\nS.S.C	Banyan Tree HIHG school , Science, Social Studies	March, 2019	\n8.0','Date of  Birth 		: 	21-01-2003\nLanguages known     	: 	Telugu, Hindi, English\nFather’s Name          	: 	Mr. k.chaitanya\nMother’s Name          	: 	Mrs.K.chetana\nAddress 			: 	H.no – 13-1-1131, uppal,nagole Azizbagh,seetharambagh, Hyderabad',115);
/*!40000 ALTER TABLE `resume` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resume_selection`
--

DROP TABLE IF EXISTS `resume_selection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resume_selection` (
  `r_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `job_title` varchar(100) NOT NULL,
  `job_category` varchar(100) DEFAULT NULL,
  `resume_id` int DEFAULT NULL,
  PRIMARY KEY (`r_id`),
  KEY `resume_id` (`resume_id`),
  CONSTRAINT `resume_selection_ibfk_1` FOREIGN KEY (`resume_id`) REFERENCES `resume` (`resume_id`)
) ENGINE=InnoDB AUTO_INCREMENT=816 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resume_selection`
--

LOCK TABLES `resume_selection` WRITE;
/*!40000 ALTER TABLE `resume_selection` DISABLE KEYS */;
INSERT INTO `resume_selection` VALUES (801,'adarsh','developer','intern',601),(802,'anish','admin','intern',602),(803,'akhila','developer','intern',603),(804,'shekar','admin','intern',604),(805,'pavan','developer','intern',605),(806,'sanjay','admin','intern',606),(807,'sathwika','developer','intern',607),(808,'siddharth','developer','intern',608),(809,'swaraj','admin','intern',609),(810,'durga','developer','intern',610),(811,'rahul','developer','intern',611),(812,'praveen','admin','intern',612),(813,'venkanna','developer','intern',613),(814,'bhagyalakshmi','developer','intern',614),(815,'giridhar','admin','intern',615);
/*!40000 ALTER TABLE `resume_selection` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-25 22:26:44
