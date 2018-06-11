-- MySQL dump 10.13  Distrib 5.7.19, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: jcimas
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `v_good`
--

DROP TABLE IF EXISTS `v_good`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `v_good` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `img` varchar(255) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `v_good`
--

LOCK TABLES `v_good` WRITE;
/*!40000 ALTER TABLE `v_good` DISABLE KEYS */;
INSERT INTO `v_good` VALUES (2,'【王者游戏套装】小鸟看看 Pico Goblin小怪兽 ','https://img12.360buyimg.com/n7/jfs/t16381/327/499557836/154392/b4f201cf/5a33496dNefcdca44.jpg',1699),(3,'爱奇艺','https://img14.360buyimg.com/n7/jfs/t10951/271/58749316/68713/5700433/59c4b42fNfd26562c.jpg',49),(4,'爱奇艺1','https://img11.360buyimg.com/n7/jfs/t10246/97/212575734/60308/5d37d561/59c916a8Na127094f.jpg',149),(5,'暴风魔镜 S1','https://img11.360buyimg.com/n7/jfs/t19204/64/2367595538/64205/76db0e19/5af10f94N3bbcda69.jpg',169),(6,'【新包装】HTC VIVE 智能','https://img11.360buyimg.com/n7/jfs/t5755/333/6908057589/98960/4f63c297/596d9eb1N27bcc28c.jpg',4888),(7,'千幻魔镜9代 ','https://img13.360buyimg.com/n7/jfs/t19207/327/1519686540/419333/362b5592/5acc7fc4Ncb367161.jpg',168),(8,'千幻魔镜 ','https://img10.360buyimg.com/n7/jfs/t3223/149/6276433537/89435/7c0f016e/58a2b197N2162e826.jpg',79),(9,'三星Gear ','https://img11.360buyimg.com/n7/jfs/t11113/200/496978024/180071/df12c84/59f1b82bNdfd2befa.jpg',699),(10,'小鸟看看 Pico U ','https://img13.360buyimg.com/n7/jfs/t7330/344/520650708/131106/485abd5f/5993e0a0Nd54e753f.jpg',99),(11,'千幻魔镜G04E 虚拟现实智能','https://img13.360buyimg.com/n7/jfs/t18604/280/1821749603/280389/c5b2c97a/5adb625aNc0aeb9f7.jpg',128),(12,'暴风魔镜 小D 虚拟现实智能','https://img12.360buyimg.com/n7/jfs/t10657/159/2657546286/69670/77dcf731/59fc1a11N0fc3b031.jpg',49),(13,'爱奇艺2','https://img14.360buyimg.com/n7/jfs/t17395/31/2317613854/160656/289832c1/5af00838N2a7f67be.jpg',3699),(14,'小鸟看看 Pico Neo ','https://img13.360buyimg.com/n7/jfs/t15112/209/1049302961/134343/f2bbb3a0/5a4222e8Nf08ee9f7.jpg',3439),(15,'暴风魔镜 S1 智能 ','https://img13.360buyimg.com/n7/jfs/t10675/278/2684420975/78967/70b8fb17/59fc2c39Nb03138e9.jpg',169),(16,'暴风魔镜 S11','https://img13.360buyimg.com/n7/jfs/t9655/270/234483835/94140/43595f34/59c9e757N5bd95edf.jpg',129),(17,'千幻魔镜旗舰之作 3D虚拟现实','https://img11.360buyimg.com/n7/jfs/t17275/234/1179611390/194377/bdca70de/5abe62ffN2778b79a.jpg',118),(18,'千幻魔镜G04E','https://img11.360buyimg.com/n7/jfs/t20932/34/558396363/376923/fb4bc89f/5b10a5d9N1029396c.jpg',148),(19,'小鸟看看 Pico Goblin小怪兽 ','https://img14.360buyimg.com/n7/jfs/t8206/348/924168260/171079/d762c2a8/59b0eabbN5b2f65d5.jpg',1499),(20,'千幻魔镜6代 ','https://img14.360buyimg.com/n7/jfs/t11845/142/1075286942/215181/89ba6fb7/59fdbd08Na6e71caf.jpg',158),(21,'HTC Vive Focus ','https://img11.360buyimg.com/n7/jfs/t12379/33/1796040464/145156/b67211f8/5a28aa22N768f7ab7.jpg',3699),(22,'小派','https://img12.360buyimg.com/n7/jfs/t8800/316/894067902/137606/b784ea78/59b0ab5dNb40ec6a4.jpg',1499),(23,'爱奇艺3','https://img14.360buyimg.com/n7/jfs/t5758/164/7487016322/189611/7fb4b698/59718a2eNef9024ba.jpg',2999),(24,'暴风魔镜 小D 虚拟现实智能1','https://img11.360buyimg.com/n7/jfs/t10408/344/2717747951/89487/46212532/59fc19f5Nf88f816d.jpg',49),(25,'【360°套装】大朋','https://img14.360buyimg.com/n7/jfs/t15673/231/1760236791/119148/ef0b0b6b/5a606b30N83ce72e1.jpg',3899),(26,'千幻魔镜 1','https://img11.360buyimg.com/n7/jfs/t3835/259/3833358594/37368/bbc372ae/58a2b197Nab1c2756.jpg',79),(27,'蔡司Zeiss ONE PLUS ','https://img14.360buyimg.com/n7/jfs/t9475/42/1998368098/80145/e89d5b79/59c23733N74ad22c5.jpg',99),(28,'暴风魔镜 小D2 智能 ','https://img12.360buyimg.com/n7/jfs/t11605/239/1317214709/84634/668db1e4/5a000af1N9ea0c793.jpg',89),(29,'千幻魔镜G04E 虚拟现实智能1','https://img13.360buyimg.com/n7/jfs/t15559/83/1403421879/361130/2e69d7c0/5a50a714N46083cc7.jpg',268),(30,'暴风魔镜 S12','https://img14.360buyimg.com/n7/jfs/t17989/329/2614905431/293775/b34b78b2/5afeaba4N34145258.jpg',168),(31,'小鸟看看 Pico 终结者单头盔','https://img10.360buyimg.com/n7/jfs/t14857/356/646098953/145769/840998c5/5a338d95N0829f4e0.jpg',499),(32,'小鸟看看 Pico 终结者单头盔','https://img10.360buyimg.com/n7/jfs/t14857/356/646098953/145769/840998c5/5a338d95N0829f4e0.jpg',499);
/*!40000 ALTER TABLE `v_good` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `v_order`
--

DROP TABLE IF EXISTS `v_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `v_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `good` bigint(20) NOT NULL,
  `num` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `v_order`
--

LOCK TABLES `v_order` WRITE;
/*!40000 ALTER TABLE `v_order` DISABLE KEYS */;
INSERT INTO `v_order` VALUES (2,1,2,1),(3,1,2,1),(4,1,2,1),(5,1,2,1),(6,1,2,1),(7,1,2,1),(8,1,2,1),(9,1,2,1),(10,1,2,1),(11,1,2,1),(12,1,2,1),(13,1,2,1),(14,1,2,1),(15,1,2,1),(16,1,2,1),(17,1,2,1),(18,1,2,1),(19,1,2,1),(20,1,2,1),(21,1,2,1),(22,1,2,1),(23,1,2,1),(24,1,2,1),(25,1,2,1),(26,1,2,1),(27,1,2,1),(28,1,2,1),(29,1,2,1),(30,1,2,1),(31,1,2,1),(32,1,2,1),(33,1,2,1),(34,1,2,1),(35,1,2,1),(36,1,2,1),(37,1,2,1),(38,1,2,1),(39,1,2,1),(40,1,2,1),(41,1,2,1),(42,1,2,1),(43,1,2,1),(44,1,2,1),(45,1,2,1),(46,1,2,1),(47,1,2,1),(48,1,2,1),(49,1,2,1),(50,1,2,1),(51,1,2,1),(52,1,4,1),(53,1,5,1),(54,1,5,1),(55,1,6,1),(56,1,4,1),(57,1,3,1),(58,1,4,1),(59,1,4,1),(60,1,4,1),(61,1,4,1),(62,1,4,1),(63,1,4,1),(64,1,4,1),(65,1,5,1),(66,1,5,1),(67,1,5,1),(68,1,6,1),(69,1,6,1),(70,1,6,1),(71,1,6,1),(72,1,6,1),(73,1,6,1),(74,1,6,1),(75,1,5,1),(76,1,6,1),(77,1,6,1),(78,1,6,1),(79,1,2,1),(80,1,2,1),(81,1,2,1),(82,1,2,1),(83,1,2,1),(84,1,2,1),(85,1,2,1),(86,1,3,1),(87,1,5,1),(88,1,5,1),(89,1,5,1),(90,1,5,1),(91,1,5,1),(92,1,5,1),(93,1,5,1),(94,1,5,1),(95,1,5,1),(96,1,5,1),(97,1,5,1),(98,1,6,1),(99,1,6,1),(100,1,6,1),(101,1,6,1),(102,1,6,1),(103,1,6,1),(104,1,6,1),(105,1,6,1),(106,1,6,1),(107,1,5,1),(108,1,2,1),(109,1,3,1),(110,1,4,1),(111,1,5,1),(112,1,6,1),(113,1,11,1),(114,1,16,1),(115,1,15,1),(116,1,14,1),(117,1,32,1),(118,1,11,1);
/*!40000 ALTER TABLE `v_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `v_role`
--

DROP TABLE IF EXISTS `v_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `v_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `v_role`
--

LOCK TABLES `v_role` WRITE;
/*!40000 ALTER TABLE `v_role` DISABLE KEYS */;
INSERT INTO `v_role` VALUES (1,'admin'),(2,'user');
/*!40000 ALTER TABLE `v_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `v_user`
--

DROP TABLE IF EXISTS `v_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `v_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `status` bigint(20) NOT NULL DEFAULT '1',
  `email` varchar(20) NOT NULL,
  `tel` varchar(15) NOT NULL,
  `gender` enum('male','female','both','other') NOT NULL DEFAULT 'other',
  PRIMARY KEY (`id`),
  KEY `v_user_id_index` (`id`),
  KEY `v_user_user_name_id_index` (`user_name`,`id`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `v_user`
--

LOCK TABLES `v_user` WRITE;
/*!40000 ALTER TABLE `v_user` DISABLE KEYS */;
INSERT INTO `v_user` VALUES (1,'admin','admin',1,'test@geniusver.com','1234567890','female'),(51,'user23','test',1,'test@geniusver.com','12345678901','other'),(54,'user26','test',1,'test@geniusver.com','12345678901','other'),(55,'user27','test',1,'test@geniusver.com','12345678901','other'),(56,'user28','test',1,'test@geniusver.com','12345678901','other'),(57,'user29','test',1,'test@geniusver.com','12345678901','other'),(58,'user30','test',1,'test@geniusver.com','12345678901','other'),(59,'user31','test',1,'test@geniusver.com','12345678901','other'),(60,'user32','test',1,'test@geniusver.com','12345678901','other'),(61,'user33','test',1,'test@geniusver.com','12345678901','other'),(62,'user34','test',1,'test@geniusver.com','12345678901','other'),(63,'user35','test',1,'test@geniusver.com','12345678901','other'),(64,'user36','test',1,'test@geniusver.com','12345678901','other'),(65,'user37','test',1,'test@geniusver.com','12345678901','other'),(66,'user38','test',1,'test@geniusver.com','12345678901','other'),(67,'user39','test',1,'test@geniusver.com','12345678901','other'),(68,'user40','test',1,'test@geniusver.com','12345678901','other'),(69,'user41','test',1,'test@geniusver.com','12345678901','other'),(70,'user42','test',1,'test@geniusver.com','12345678901','other'),(71,'user43','test',1,'test@geniusver.com','12345678901','other'),(72,'user44','test',1,'test@geniusver.com','12345678901','other'),(73,'user45','test',1,'test@geniusver.com','12345678901','other'),(74,'user46','test',1,'test@geniusver.com','12345678901','other'),(75,'user47','test',1,'test@geniusver.com','12345678901','other'),(76,'user48','test',1,'test@geniusver.com','12345678901','other'),(77,'user49','test',1,'test@geniusver.com','12345678901','other'),(78,'user50','test',1,'test@geniusver.com','12345678901','other'),(79,'user51','test',1,'test@geniusver.com','12345678901','other'),(80,'user52','test',1,'test@geniusver.com','12345678901','other'),(81,'user53','test',1,'test@geniusver.com','12345678901','other'),(82,'user54','test',1,'test@geniusver.com','12345678901','other'),(83,'user55','test',1,'test@geniusver.com','12345678901','other'),(84,'user56','test',1,'test@geniusver.com','12345678901','other'),(85,'user57','test',1,'test@geniusver.com','12345678901','other'),(86,'user58','test',1,'test@geniusver.com','12345678901','other'),(87,'user59','test',1,'test@geniusver.com','12345678901','other'),(88,'user60','test',1,'test@geniusver.com','12345678901','other'),(89,'user61','test',1,'test@geniusver.com','12345678901','other'),(90,'user62','test',1,'test@geniusver.com','12345678901','other'),(91,'user63','test',1,'test@geniusver.com','12345678901','other'),(92,'user64','test',1,'test@geniusver.com','12345678901','other'),(93,'user65','test',1,'test@geniusver.com','12345678901','other'),(94,'user66','test',1,'test@geniusver.com','12345678901','other'),(95,'user67','test',1,'test@geniusver.com','12345678901','other'),(96,'user68','test',1,'test@geniusver.com','12345678901','other'),(97,'user69','test',1,'test@geniusver.com','12345678901','other'),(98,'user70','test',1,'test@geniusver.com','12345678901','other'),(99,'user71','test',1,'test@geniusver.com','12345678901','other'),(100,'user72','test',1,'test@geniusver.com','12345678901','other'),(101,'user73','test',1,'test@geniusver.com','12345678901','other'),(102,'user74','test',1,'test@geniusver.com','12345678901','other'),(103,'user75','test',1,'test@geniusver.com','12345678901','other'),(104,'user76','test',1,'test@geniusver.com','12345678901','other'),(105,'user77','test',1,'test@geniusver.com','12345678901','other'),(106,'user78','test',1,'test@geniusver.com','12345678901','other'),(107,'user79','test',1,'test@geniusver.com','12345678901','other'),(108,'user80','test',1,'test@geniusver.com','12345678901','other'),(109,'user81','test',1,'test@geniusver.com','12345678901','other'),(110,'user82','test',1,'test@geniusver.com','12345678901','other'),(111,'user83','test',1,'test@geniusver.com','12345678901','other'),(112,'user84','test',1,'test@geniusver.com','12345678901','other'),(113,'user85','test',1,'test@geniusver.com','12345678901','other'),(114,'user86','test',1,'test@geniusver.com','12345678901','other'),(115,'user87','test',1,'test@geniusver.com','12345678901','other'),(116,'user88','test',1,'test@geniusver.com','12345678901','other'),(117,'user89','test',1,'test@geniusver.com','12345678901','other'),(118,'user90','test',1,'test@geniusver.com','12345678901','other'),(119,'user91','test',1,'test@geniusver.com','12345678901','other'),(120,'user92','test',1,'test@geniusver.com','12345678901','other'),(121,'user93','test',1,'test@geniusver.com','12345678901','other'),(122,'user94','test',1,'test@geniusver.com','12345678901','other'),(123,'user95','test',1,'test@geniusver.com','12345678901','other');
/*!40000 ALTER TABLE `v_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `v_user_role`
--

DROP TABLE IF EXISTS `v_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `v_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `v_user_role_user_id_role_id_index` (`user_id`,`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `v_user_role`
--

LOCK TABLES `v_user_role` WRITE;
/*!40000 ALTER TABLE `v_user_role` DISABLE KEYS */;
INSERT INTO `v_user_role` VALUES (1,1,1),(2,1,2);
/*!40000 ALTER TABLE `v_user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-11 10:59:51
