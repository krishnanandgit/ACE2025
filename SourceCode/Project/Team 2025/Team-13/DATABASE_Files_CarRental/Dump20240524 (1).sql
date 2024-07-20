-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: carrental
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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `CustomerID` int NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `PhoneNumber` int DEFAULT NULL,
  PRIMARY KEY (`CustomerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'John Doe','123 Main Street',5555123),(2,'Jane Smith','456 Elm Avenue',5555678),(3,'David Johnson','789 Oak Lane',5559101),(4,'Sarah Williams','321 Pine Road',5552345),(5,'Michael Brown','654 Cedar Court',5556789),(6,'Emily Davis','987 Birch Drive',5550123),(7,'Robert Wilson','135 Maple Street',5553456),(8,'Jessica Martinez','246 Walnut Avenue',5557890),(9,'William Anderson','357 Cherry Lane',5551234),(10,'Amanda Taylor','468 Sycamore Road',5555678),(11,'Daniel Thomas','579 Willow Lane',5559101),(12,'Olivia Garcia','680 Ash Avenue',5552345),(13,'James Rodriguez','791 Birch Drive',5556789),(14,'Sophia Hernandez','802 Pine Road',5550123),(15,'Matthew Gonzalez','913 Oak Lane',5553456),(16,'Isabella Lopez','124 Main Street',5557890),(17,'Ethan Perez','235 Elm Avenue',5551234),(18,'Amelia Torres','346 Oak Lane',5555678),(19,'Oliver Flores','457 Pine Road',5559101),(20,'Charlotte Adams','568 Cedar Court',5552345),(21,'Benjamin Nguyen','679 Birch Drive',5556789),(22,'Mia Kim','780 Maple Street',5550123),(23,'Elijah Patel','891 Walnut Avenue',5553456),(24,'Harper Lee','902 Cherry Lane',5557890),(25,'Logan Smith','113 Sycamore Road',5551234),(26,'Evelyn Johnson','224 Willow Lane',5555678),(27,'Liam Williams','335 Ash Avenue',5559101),(28,'Aria Brown','446 Birch Drive',5552345),(29,'Noah Davis','557 Pine Road',5556789),(30,'Amelia Wilson','668 Oak Lane',5550123),(31,'Lucas Martinez','779 Maple Street',5553456),(32,'Ava Anderson','880 Walnut Avenue',5557890),(33,'Ethan Taylor','991 Cherry Lane',5551234),(34,'Sophia Thomas','102 Sycamore Road',5555678),(35,'Mason Garcia','213 Willow Lane',5559101),(36,'Isabella Rodriguez','324 Ash Avenue',5552345),(37,'Oliver Hernandez','435 Birch Drive',5556789),(38,'Amelia Gonzalez','546 Pine Road',5550123),(39,'William Lopez','657 Oak Lane',5553456),(40,'Ella Adams','768 Cedar Court',5557890),(41,'James Nguyen','879 Birch Drive',5551234),(42,'Scarlett Kim','980 Maple Street',5555678),(43,'Henry Patel','101 Cherry Lane',5559101),(44,'Luna Lee','212 Sycamore Road',5552345),(45,'Jack Smith','323 Willow Lane',5556789),(46,'Olivia Martinez','656 Oak Lane',5557890),(47,'Alexander Brown','767 Cedar Court',5551234),(48,'Charlotte Davis','878 Birch Drive',5555678),(49,'Emma Wilson','545 Pine Road',5553456),(50,'Emmal','526 Pine Street',5455457);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insurance`
--

DROP TABLE IF EXISTS `insurance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `insurance` (
  `InsuranceID` int NOT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Cost` int DEFAULT NULL,
  PRIMARY KEY (`InsuranceID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insurance`
--

LOCK TABLES `insurance` WRITE;
/*!40000 ALTER TABLE `insurance` DISABLE KEYS */;
INSERT INTO `insurance` VALUES (101,'Compact Car Rental Insurance Collision Damage Waiver',1500),(102,'SUV Rental Insurance Theft Protection Coverage',2000),(103,'Luxury Car Rental Insurance Comprehensive Coverage',3000),(104,'Minivan Rental Insurance Additional Driver Coverage',1000),(105,'Convertible Car Rental Insurance Roadside Assistance',500),(106,'Economy Car Rental Insurance Personal Accident Insurance',800),(107,'Truck Rental Insurance Cargo Protection Coverage',2500),(108,'Sports Car Rental Insurance Excess Insurance',1200),(109,'Electric Car Rental Insurance Battery Replacement Coverage',1800),(110,'Vintage Car Rental Insurance Restoration Coverage',4000),(111,'Hybrid Car Rental Insurance - Environmental Damage Waiver',2200),(112,'Family Car Rental Insurance - Child Seat Protection',500),(113,'Off-Road Vehicle Rental Insurance - Off-Road Coverage',3000),(114,'Budget Car Rental Insurance - Basic Coverage',1000),(115,'Long-Term Car Rental Insurance - Extended Rental Protection',5000),(116,'One-Way Car Rental Insurance - Drop-Off Fee Waiver',1500),(117,'Business Car Rental Insurance - Commercial Use Coverage',2000),(118,'Student Car Rental Insurance - Underage Driver Fee Waiver',5000),(119,'Airport Car Rental Insurance - Airport Surcharge Waiver',8000),(120,'Senior Citizen Car Rental Insurance - Senior Discount Coverage',300),(121,'Foreign Visitor Car Rental Insurance - International License Coverage',100),(122,'Leisure Car Rental Insurance - Weekend Special Coverage',2000),(123,'Winter Car Rental Insurance - Snow Tire Protection',1500),(124,'Group Car Rental Insurance - Group Discount Coverage',500),(125,'Adventure Car Rental Insurance - Off-Grid Navigation Coverage',2500),(126,'Pet-Friendly Car Rental Insurance - Pet Damage Protection',1000),(127,'City Car Rental Insurance - Parking Ticket Forgiveness',500),(128,'Camping Car Rental Insurance - Campsite Reservation Assistance',800),(129,'Rideshare Car Rental Insurance - Ride-Hailing Coverage',1500),(130,'Solo Traveler Car Rental Insurance - Single Supplement Waiver',700),(131,'Family Reunion Car Rental Insurance - Multi-Car Discount',1200),(132,'Beach Vacation Car Rental Insurance - Sand and Saltwater Protection',1000),(133,'Music Festival Car Rental Insurance - Event Parking Pass',500),(134,'Business Trip Car Rental Insurance - Business Traveler Coverage',2000),(135,'National Park Car Rental Insurance - Park Entry Fee Waiver',800),(136,'Summer Road Trip Car Rental Insurance - Unlimited Mileage',1500),(137,'Historical Site Car Rental Insurance - Historical Tour Guide',1000),(138,'Mountain Adventure Car Rental Insurance - Roof Rack Included',1200),(139,'Coastal Drive Car Rental Insurance - Scenic Route Recommendation',500),(140,'Fishing Trip Car Rental Insurance - Tackle Box Rental',800),(141,'Golfing Weekend Car Rental Insurance - Golf Club Storage',500),(142,'Wine Tasting Tour Car Rental Insurance - Wine Country Map',1000),(143,'Skiing Vacation Car Rental Insurance - Ski Rack Provided',1500),(144,'Surfing Getaway Car Rental Insurance - Surfboard Roof Straps',1000),(145,'Photography Expedition Car Rental Insurance - Camera Gear Storage',1200),(146,'Hiking Adventure Car Rental Insurance - Trailhead Shuttle Service',800),(147,'Winter Wonderland Car Rental Insurance - Snow Chains Provided',1000),(148,'Luxury Getaway Car Rental Insurance - VIP Concierge Service',2000),(149,'Desert Safari Car Rental Insurance - Sand Dune Driving Permit',1500),(150,'Cultural Tour Car Rental Insurance - Local Tour Guide Included',800);
/*!40000 ALTER TABLE `insurance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory` (
  `InventoryID` int NOT NULL,
  `VehicleID` int DEFAULT NULL,
  `LocationID` int DEFAULT NULL,
  `Quantity` int DEFAULT NULL,
  PRIMARY KEY (`InventoryID`),
  KEY `VehicleID` (`VehicleID`),
  KEY `LocationID` (`LocationID`),
  CONSTRAINT `inventory_ibfk_1` FOREIGN KEY (`VehicleID`) REFERENCES `vehicle` (`VehicleID`),
  CONSTRAINT `inventory_ibfk_2` FOREIGN KEY (`LocationID`) REFERENCES `location` (`LocationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (301,501,51,3),(302,502,52,2),(303,503,53,5),(304,504,54,4),(305,505,55,3),(306,506,56,2),(307,507,57,6),(308,508,58,1),(309,509,59,4),(310,510,60,2),(311,511,61,3),(312,512,62,5),(313,513,63,2),(314,514,64,3),(315,515,65,4),(316,516,66,1),(317,517,67,3),(318,518,68,2),(319,519,69,5),(320,520,70,2),(321,521,71,3),(322,522,72,2),(323,523,73,5),(324,524,74,4),(325,525,75,3),(326,526,76,2),(327,527,77,6),(328,528,78,1),(329,529,79,4),(330,530,80,2),(331,531,81,3),(332,532,82,5),(333,533,83,2),(334,534,84,3),(335,535,85,4),(336,536,86,1),(337,537,87,3),(338,538,88,2),(339,539,89,5),(340,540,90,2),(341,541,91,2),(342,542,92,1),(343,543,93,3),(344,544,94,4),(345,545,95,2),(346,546,96,3),(347,547,97,1),(348,548,98,2),(349,549,99,4),(350,550,100,3);
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location` (
  `LocationId` int NOT NULL,
  `Address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`LocationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (51,'Starlight Street, Moonbeam City, Galaxy 12345'),(52,'Enchanted Forest, Fairyland Avenue, Magic Kingdom 67890'),(53,'Rainbow Road, Sunshine Valley, Dreamland 13579'),(54,'Whispering Winds Lane, Serenity Hills, Tranquility Bay 24680'),(55,'Mystic Meadows, Secret Garden Lane, Wonderland 97531'),(56,'Aurora Avenue, Celestial Heights, Stardust City 86420'),(57,'Mermaid Cove, Ocean Breeze Boulevard, Atlantis 75319'),(58,'Dragons Lair, Firecrest Lane, Mythical Kingdom 64208'),(59,'Pirates Cove, Treasure Island Street, Adventure Bay 53197'),(60,'Unicorn Way, Magic Meadows, Fantasy Land 42086'),(61,'Pixie Hollow, Sparkle Lane, Enchantment Village 31975'),(62,'Galactic Gardens, Comet Street, Star Cluster 20864'),(63,'Lunar Landing, Spacewalk Avenue, Astral City 97531'),(64,'Wonder Wharf, Fun Street, Joyville 86420'),(65,'Crystal Caverns, Gemstone Lane, Jewel City 75319'),(66,'Pixie Dust Plaza, Rainbow Lane, Fairyland 64208'),(67,'Dragonfly Drive, Butterfly Avenue, Natures Haven'),(68,'Whimsical Woods, Enchanted Lane, Magic Forest 42086'),(69,'Moonlit Bay, Starlight Street, Galaxy Bluff 31975'),(70,'Serenity Springs, Harmony Lane, Peaceful Valley 20864'),(71,'Dreamy Dunes, Seashell Boulevard, Paradise Cove 97531'),(72,'Majestic Mountains, Sunrise Street, Zen Peak 86420'),(73,'Whale Watch Way, Oceanfront Drive, Marine Bay 75319'),(74,'Safari Trail, Wildlife Avenue, Jungle Haven'),(75,'Crystal Clear Lake, Reflection Road, Tranquil Waterside 64208'),(76,'Whispering Willow Lane, Serene Valley, Peaceful Haven 53197'),(77,'Mystical Moonrise, Starry Night Street, Twilight Town 42086'),(78,'Golden Grove, Sunflower Avenue, Radiant Meadows 31975'),(79,'Whimsy Way, Enchantment Lane, Fantasy Falls 20864'),(80,'Rainbow Ridge, Sunny Side Street, Joyful Junction 97531'),(81,'Whale Song Way, Coral Reef Road, Ocean Symphony 86420'),(82,'Majestic Manor, Regal Road, Royal Heights 75319'),(83,'Emerald Enclave, Ivy Lane, Enchanted Garden 64208'),(84,'Silver Springs, Crystal Cove, Shimmering Waters 53197'),(85,'Twilight Terrace, Moonlight Lane, Starlit Skyline 42086'),(86,'Whispering Pines, Harmony Hill, Serenity Springs 31975'),(87,'Glimmering Glade, Luminous Lane, Radiant Ridge 20864'),(88,'Tranquil Trail, Peaceful Pathway, Serene Summit 97531'),(89,'Golden Gate, Sunshine Street, Blissful Boulevard 86420'),(90,'Mystic Manor, Magic Lane, Enchanted Estate 75319'),(91,'Whispering Waters, Tranquil Tide, Serene Shoreline 64208'),(92,'Moonlit Meadows, Stardust Street, Celestial Court 53197'),(93,'Dreamy Drive, Fantasy Lane, Wonderland Way 42086'),(94,'Serenity Street, Harmony Hill, Peaceful Place 31975'),(95,'Tranquil Terrace, Serene Lane, Calm Corner 20864'),(96,'Whispering Winds, Serenity Street, Peaceful Path 97531'),(97,'Mystic Moonlight, Enchanted Avenue, Magical Meadow 86420'),(98,'Sparkling Stream, Sunbeam Street, Radiant Riviera 75319'),(99,'Tranquility Trail, Harmony Avenue, Peaceful Park 64208'),(100,'Whispering Woods, Serene Street, Calm Cove 53197');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maintenance`
--

DROP TABLE IF EXISTS `maintenance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maintenance` (
  `MaintenanceID` int NOT NULL,
  `VehicleID` int DEFAULT NULL,
  `MaintenanceDate` date DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`MaintenanceID`),
  KEY `VehicleID` (`VehicleID`),
  CONSTRAINT `maintenance_ibfk_1` FOREIGN KEY (`VehicleID`) REFERENCES `vehicle` (`VehicleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maintenance`
--

LOCK TABLES `maintenance` WRITE;
/*!40000 ALTER TABLE `maintenance` DISABLE KEYS */;
INSERT INTO `maintenance` VALUES (201,501,'2024-05-01','Scheduled maintenance check'),(202,502,'2024-04-15','Tire inspection and rotation'),(203,503,'2024-03-20','Oil change and filter replacement'),(204,504,'2024-02-10','Brake pad replacement'),(205,505,'2024-01-05','Fluid level check and top-up'),(206,506,'2023-12-25','Battery health check'),(207,507,'2023-11-30','Air conditioning system inspection'),(208,508,'2023-10-15','Spark plug check and replacement if needed'),(209,509,'2023-09-20','Wheel alignment and balancing'),(210,510,'2023-08-10','Transmission fluid check and refill if necessary'),(211,511,'2023-07-05','Fuel system inspection and cleaning'),(212,512,'2023-06-15','Headlight and taillight inspection and bulb replacement'),(213,513,'2023-05-20','Windshield wiper blade replacement'),(214,514,'2023-04-10','Cabin air filter replacement'),(215,515,'2023-03-05','Radiator and cooling system check'),(216,516,'2023-02-25','Power steering system check and fluid top-up'),(217,517,'2023-01-30','Brake fluid check and replacement if needed'),(218,518,'2022-12-15','Suspension system inspection and maintenance'),(219,519,'2022-11-20','Exhaust system check and repair if necessary'),(220,520,'2022-10-10','Thermostat inspection and replacement if needed'),(221,521,'2022-09-05','Air filter replacement'),(222,522,'2022-08-01','Coolant system check and refill if needed'),(223,523,'2022-07-10','Steering system inspection'),(224,524,'2022-06-15','Fuel filter replacement'),(225,525,'2022-05-20','Catalytic converter check'),(226,526,'2022-04-25','Oxygen sensor inspection and replacement'),(227,527,'2022-03-30','Ignition system check'),(228,528,'2022-02-15','Timing belt inspection and replacement if needed'),(229,529,'2022-01-10','PCV valve replacement'),(230,530,'2021-12-05','Emissions system check'),(231,531,'2021-10-15','Transmission fluid check and replacement if necessary'),(232,532,'2021-09-20','Suspension system inspection and maintenance'),(233,533,'2021-08-25','Battery check and replacement if needed'),(234,534,'2021-07-30','Tire pressure check and rotation'),(235,535,'2021-06-05','Air conditioning system check and maintenance'),(236,536,'2021-05-10','Windshield wiper replacement'),(237,537,'2021-04-15','Exhaust system inspection and repair'),(238,538,'2021-03-20','Radiator flush and coolant replacement'),(239,539,'2021-02-25','Spark plug replacement'),(240,540,'2021-01-30','Wheel alignment and balancing'),(241,541,'2020-12-05','Power steering fluid check and top-up'),(242,542,'2020-11-10','Engine air filter replacement'),(243,543,'2020-10-15','Brake fluid flush and replacement'),(244,544,'2020-09-20','Fuel system cleaning'),(245,545,'2020-08-25','Throttle body cleaning'),(246,546,'2020-07-30','Cabin air filter replacement'),(247,547,'2020-06-05','Wheel bearing inspection and greasing'),(248,548,'2020-05-10','Check and adjust drive belts tension'),(249,549,'2020-04-15','Inspect and replace serpentine belt if necessary'),(250,550,'2021-11-10','Brake system inspection and maintenance');
/*!40000 ALTER TABLE `maintenance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `PaymentID` int NOT NULL,
  `CustomerID` int DEFAULT NULL,
  `Amount` int DEFAULT NULL,
  `PaymentDate` date DEFAULT NULL,
  PRIMARY KEY (`PaymentID`),
  KEY `CustomerID` (`CustomerID`),
  CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (151,1,1000,'2024-05-23'),(152,2,7525,'2024-05-22'),(153,3,1275,'2024-05-21'),(154,4,9030,'2024-05-20'),(155,5,6020,'2024-05-19'),(156,6,4575,'2024-05-18'),(157,7,8890,'2024-05-17'),(158,8,1160,'2024-05-16'),(159,9,7040,'2024-05-15'),(160,10,5580,'2024-05-14'),(161,11,1345,'2024-05-13'),(162,12,9570,'2024-05-12'),(163,13,7820,'2024-05-11'),(164,14,8590,'2024-05-10'),(165,15,10530,'2024-05-09'),(166,16,6540,'2024-05-08'),(167,17,4060,'2024-05-07'),(168,18,11520,'2024-05-06'),(169,19,8210,'2024-05-05'),(170,20,7580,'2024-05-04'),(171,21,9525,'2024-05-03'),(172,22,7050,'2024-05-02'),(173,23,1175,'2024-05-01'),(174,24,8060,'2024-04-30'),(175,25,5040,'2024-04-29'),(176,26,3575,'2024-04-28'),(177,27,6890,'2024-04-27'),(178,28,9060,'2024-04-26'),(179,29,6040,'2024-04-25'),(180,30,4580,'2024-04-24'),(181,31,1245,'2024-04-23'),(182,32,9070,'2024-04-22'),(183,33,7320,'2024-04-21'),(184,34,8090,'2024-04-20'),(185,35,1030,'2024-04-19'),(186,36,6040,'2024-04-18'),(187,37,3560,'2024-04-17'),(188,38,1220,'2024-04-16'),(189,39,8710,'2024-04-15'),(190,40,7080,'2024-04-14'),(191,41,1025,'2024-04-13'),(192,42,8050,'2024-04-12'),(193,43,1275,'2024-04-15'),(194,44,9560,'2024-04-07'),(195,45,7020,'2024-04-06'),(196,46,8530,'2024-04-05'),(197,47,1140,'2024-04-04'),(198,48,7580,'2024-04-03'),(199,49,7550,'2024-04-02'),(200,50,7980,'2024-04-01');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rental`
--

DROP TABLE IF EXISTS `rental`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rental` (
  `RentalID` int NOT NULL,
  `ReservationID` int DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  PRIMARY KEY (`RentalID`),
  KEY `ReservationID` (`ReservationID`),
  CONSTRAINT `rental_ibfk_1` FOREIGN KEY (`ReservationID`) REFERENCES `reservation` (`ReservationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rental`
--

LOCK TABLES `rental` WRITE;
/*!40000 ALTER TABLE `rental` DISABLE KEYS */;
INSERT INTO `rental` VALUES (351,251,'2024-06-01','2024-06-10'),(352,252,'2024-06-02','2024-06-11'),(353,253,'2024-06-03','2024-06-12'),(354,254,'2024-06-04','2024-06-13'),(355,255,'2024-06-05','2024-06-14'),(356,256,'2024-06-06','2024-06-15'),(357,257,'2024-06-07','2024-06-16'),(358,258,'2024-06-08','2024-06-17'),(359,259,'2024-06-09','2024-06-18'),(360,260,'2024-06-10','2024-06-19'),(361,261,'2024-06-11','2024-06-20'),(362,262,'2024-06-12','2024-06-21'),(363,263,'2024-06-13','2024-06-22'),(364,264,'2024-06-14','2024-06-23'),(365,265,'2024-06-15','2024-06-24'),(366,266,'2024-06-16','2024-06-25'),(367,267,'2024-06-17','2024-06-26'),(368,268,'2024-06-18','2024-06-27'),(369,269,'2024-06-19','2024-06-28'),(370,270,'2024-06-20','2024-06-29'),(371,271,'2024-08-20','2024-08-29'),(372,272,'2024-06-21','2024-06-30'),(373,273,'2024-06-22','2024-07-01'),(374,274,'2024-06-23','2024-07-02'),(375,275,'2024-06-24','2024-07-03'),(376,276,'2024-06-25','2024-07-04'),(377,277,'2024-06-26','2024-07-05'),(378,278,'2024-06-27','2024-07-06'),(379,279,'2024-06-28','2024-07-07'),(380,280,'2024-06-29','2024-07-08'),(381,281,'2024-06-30','2024-07-09'),(382,282,'2024-07-01','2024-07-10'),(383,283,'2024-07-02','2024-07-11'),(384,284,'2024-07-03','2024-07-12'),(385,285,'2024-07-04','2024-07-13'),(386,286,'2024-07-05','2024-07-14'),(387,287,'2024-07-06','2024-07-15'),(388,288,'2024-07-07','2024-07-16'),(389,289,'2024-07-08','2024-07-17'),(390,290,'2024-07-09','2024-07-18'),(391,291,'2024-07-10','2024-07-19'),(392,292,'2024-07-11','2024-07-20'),(393,293,'2024-07-12','2024-07-21'),(394,294,'2024-07-13','2024-07-22'),(395,295,'2024-07-14','2024-07-23'),(396,296,'2024-07-15','2024-07-24'),(397,297,'2024-07-16','2024-07-25'),(398,298,'2024-07-17','2024-07-26'),(399,299,'2024-07-18','2024-07-27'),(400,300,'2024-07-19','2024-07-28');
/*!40000 ALTER TABLE `rental` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservation` (
  `ReservationID` int NOT NULL,
  `CustomerID` int DEFAULT NULL,
  `VehicleID` int DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  PRIMARY KEY (`ReservationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
INSERT INTO `reservation` VALUES (251,1,501,'2024-06-01','2024-06-10'),(252,2,502,'2024-06-02','2024-06-11'),(253,3,503,'2024-06-03','2024-06-12'),(254,4,504,'2024-06-04','2024-06-13'),(255,5,505,'2024-06-05','2024-06-14'),(256,6,506,'2024-06-06','2024-06-15'),(257,7,507,'2024-06-07','2024-06-16'),(258,8,508,'2024-06-08','2024-06-17'),(259,9,509,'2024-06-09','2024-06-18'),(260,10,510,'2024-06-10','2024-06-19'),(261,11,511,'2024-06-11','2024-06-20'),(262,12,512,'2024-06-12','2024-06-21'),(263,13,513,'2024-06-13','2024-06-22'),(264,14,514,'2024-06-14','2024-06-23'),(265,15,515,'2024-06-15','2024-06-24'),(266,16,516,'2024-06-16','2024-06-25'),(267,17,517,'2024-06-17','2024-06-26'),(268,18,518,'2024-06-18','2024-06-27'),(269,19,519,'2024-06-22','2024-07-01'),(270,20,520,'2024-06-23','2024-07-02'),(271,21,521,'2024-06-24','2024-07-03'),(272,22,522,'2024-06-25','2024-07-04'),(273,23,523,'2024-06-26','2024-07-05'),(274,24,524,'2024-06-27','2024-07-06'),(275,25,525,'2024-06-28','2024-07-07'),(276,26,526,'2024-06-29','2024-07-08'),(277,27,527,'2024-06-30','2024-07-09'),(278,28,528,'2024-07-01','2024-07-10'),(279,29,529,'2024-07-02','2024-07-11'),(280,30,530,'2024-07-03','2024-07-12'),(281,31,531,'2024-07-04','2024-07-13'),(282,32,532,'2024-07-05','2024-07-14'),(283,33,533,'2024-07-06','2024-07-15'),(284,34,534,'2024-07-07','2024-07-16'),(285,35,535,'2024-07-08','2024-07-17'),(286,36,536,'2024-07-09','2024-07-18'),(287,37,537,'2024-06-01','2024-06-10'),(288,38,538,'2024-06-02','2024-06-11'),(289,39,539,'2024-06-03','2024-06-12'),(290,40,540,'2024-06-04','2024-06-13'),(291,41,541,'2024-06-05','2024-06-14'),(292,42,542,'2024-06-06','2024-06-15'),(293,43,543,'2024-06-07','2024-06-16'),(294,44,544,'2024-06-08','2024-06-17'),(295,45,545,'2024-06-09','2024-06-18'),(296,46,546,'2024-06-10','2024-06-19'),(297,47,547,'2024-06-11','2024-06-20'),(298,48,548,'2024-06-12','2024-06-21'),(299,49,549,'2024-06-13','2024-06-22'),(300,50,550,'2024-06-14','2024-06-23');
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `review` (
  `ReviewID` int NOT NULL,
  `CustomerID` int DEFAULT NULL,
  `Rating` int DEFAULT NULL,
  `Comments` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ReviewID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (401,1,5,'Smooth ride, excellent service!'),(402,2,4,'Clean car, easy process'),(403,3,5,'Great vehicle, very reliable'),(404,4,4,'Decent car, could use a bit more maintenance'),(405,5,5,'Comfortable drive, good fuel efficiency'),(406,6,4,'Enjoyed the car, spacious and comfortable'),(407,7,5,'Excellent car condition, friendly staff'),(408,8,4,'Good value for the rental, clean interior'),(409,9,5,'Outstanding car, smooth handling'),(410,10,5,'Lovely car, great features'),(411,11,4,'Satisfactory ride, average performance'),(412,12,5,'Impressed by the car amenities, convenient for travel'),(413,13,5,'Reliable vehicle, perfect for road trips'),(414,14,5,'Top-notch car, will rent again in the future'),(415,15,4,'Comfortable drive, good sound system'),(416,16,4,'Average experience with the car, could be improved'),(417,17,4,'Nice car, enjoyed the ride'),(418,18,5,'Pleasant car rental, would recommend to others'),(419,19,5,'Great value for the price, satisfied with the car'),(420,20,5,'Fantastic car, smooth performance'),(421,21,4,'Efficient car, easy to drive'),(422,22,5,'Luxurious ride, great for special occasions'),(423,23,5,'Solid car, reliable for long journeys'),(424,24,4,'Decent rental, could use better cleaning'),(425,25,5,'Smooth handling, fuel-efficient'),(426,26,5,'Impressive car features, exceeded expectations'),(427,27,4,'Fair rental, average performance'),(428,28,5,'Comfortable seating, good legroom'),(429,29,4,'Enjoyable drive, responsive steering'),(430,30,5,'Great customer service, hassle-free rental'),(431,31,5,'Exceptional vehicle, top-notch maintenance'),(432,32,5,'Well-maintained car, smooth ride'),(433,33,5,'Reliable rental, perfect for family trips'),(434,34,4,'Average car, could be cleaner'),(435,35,5,'Sleek design, comfortable interior'),(436,36,4,'Good value for money, reliable car'),(437,37,5,'High-quality vehicle, excellent performance'),(438,38,4,'Basic car, met basic needs'),(439,39,5,'Spacious trunk, good for luggage'),(440,40,5,'Smooth drive, well-maintained engine'),(441,41,5,'Convenient rental process, friendly staff'),(442,42,4,'Decent mileage, average features'),(443,43,4,'Comfortable seats, easy to navigate controls'),(444,44,5,'Great audio system'),(445,45,5,'Smooth ride, good fuel efficiency'),(446,46,5,'Luxurious interior, advanced technology features'),(447,47,4,'Responsive acceleration, great handling'),(448,48,5,'Well-maintained vehicle, clean interior'),(449,49,4,'Decent rental experience, average performance'),(450,50,5,'Reliable car, suitable for daily commute');
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle` (
  `VehicleID` int NOT NULL,
  `Model` varchar(255) DEFAULT NULL,
  `Year` int DEFAULT NULL,
  `Color` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`VehicleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES (501,'Spectra',2022,'Silver'),(502,'RapidX',2023,'Red'),(503,'Thunderbolt',2021,'B,lack'),(504,'Aurora',2024,'Blue'),(505,'Phoenix',2020,'White'),(506,'Vortex',2023,'Green'),(507,'Blaze',2022,'Yellow'),(508,'Neptune',2021,'Purple'),(509,'Shadow',2024,'Gray'),(510,'Nova',2020,'Orange'),(511,'Eclipse',2023,'Turquoise'),(512,'Titan',2022,'Brown'),(513,'Zenith',2021,'Magenta'),(514,'Velocity',2024,'Teal'),(515,'Pulse',2020,'Pink'),(516,'Inferno',2023,'Gold'),(517,'Avalanche',2022,'Bronze'),(518,'Horizon',2021,'Cyan'),(519,'Raptor',2024,'Lime'),(520,'Thunder',2020,'Maroon'),(521,'Zenon',2022,'Silver'),(522,'Jupiter',2023,'Red'),(523,'Orbit',2021,'Black'),(524,'Cosmo',2024,'Blue'),(525,'Solaris',2020,'White'),(526,'Galaxy',2023,'Green'),(527,'Nebula',2022,'Yellow'),(528,'Supernova',2021,'Purple'),(529,'Stellar',2024,'Gray'),(530,'Celestial',2020,'Orange'),(531,'Lunar',2023,'Turquoise'),(532,'Comet',2022,'Brown'),(533,'Asteroid',2021,'Magenta'),(534,'Meteor',2024,'Teal'),(535,'Pluto',2020,'Pink'),(536,'Saturn',2023,'Gold'),(537,'Mercury',2022,'Bronze'),(538,'Venus',2021,'Cyan'),(539,'Mars',2024,'Lime'),(540,'Uranus',2020,'Maroon'),(541,'Neptune',2022,'Silver'),(542,'PlutoX',2023,'Red'),(543,'Astro',2021,'Black'),(544,'Stardust',2024,'Blue'),(545,'Nighthawk',2020,'White'),(546,'Moonlight',2023,'Green'),(547,'Starlight',2022,'Yellow'),(548,'Sunrise',2021,'Purple'),(549,'Daybreak',2024,'Gray'),(550,'Twilight',2021,'blue');
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-24 16:10:31
