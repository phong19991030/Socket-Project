-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bywind_3_sso
-- ------------------------------------------------------
-- Server version	5.5.5-10.11.2-MariaDB

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
-- Table structure for table `tsst_user`
--

DROP TABLE IF EXISTS `tsst_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tsst_user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(50) NOT NULL DEFAULT '0',
  `ADDRESS` text DEFAULT NULL,
  `CELL_PHONE` varchar(11) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `EMAIL_VERIFY_KEY` varchar(255) DEFAULT NULL,
  `FULL_NAME` varchar(255) DEFAULT NULL,
  `GENDER` bit(1) DEFAULT NULL,
  `IMG_PATH` varchar(255) DEFAULT NULL,
  `ORGANIZATION` varchar(255) DEFAULT NULL,
  `REMARK` varchar(255) DEFAULT NULL,
  `2FA_ENABLE` bit(1) DEFAULT b'0',
  `PASSWORD` varchar(50) DEFAULT NULL,
  `2FA_KEY` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tsst_user`
--

LOCK TABLES `tsst_user` WRITE;
/*!40000 ALTER TABLE `tsst_user` DISABLE KEYS */;
INSERT INTO `tsst_user` VALUES (1,'phong',NULL,'0123987456',NULL,'again@gmail.com','AOMV7LFVT4XIOUB4ZIWRY6GA674WXTMT','again',NULL,NULL,NULL,'again',_binary '\0','123456','6V7OYIAC34EEZ2ALNLWIIOFV3R2H4DYD'),(2,'thanh',NULL,'0987654321',NULL,'update@gmail.com','MD5NJA46DE3KDYMWG3PBHVRIQL3V3GRO','update test',NULL,NULL,NULL,NULL,_binary '\0','123456','UM6WX66FDSDDOPLGRFLLQQ7NOTHTBYRJ'),(3,'thong','13561 경기 성남시 분당구 불정로 6 (정자동) 그린팩토리','012345677','1979-05-16','a2m.emarket@gmail.com',NULL,'administrator',_binary '','f0c80e5c-59c3-47da-9353-4fe480d97856.png','orga',NULL,_binary '\0','123456','WDD7JKBWUAHI66P2RJHRZQXWKSMT2WAU'),(4,'long',NULL,'0396923299',NULL,'hailong9011@gmail.com','KE3T7TUPS3WVF6Y4KWLU4FXHQS4KCTMU','Long test 1',NULL,NULL,NULL,'Long remark 1',_binary '\0','123456','UNHW6ARURETRN5DHYSRTOXEQT6LFSKKO'),(5,'nam',NULL,'0123456789',NULL,'hailong9011@gmail.com','ZUDUP6QRYHZOHRRGX2RTKKPK2BXYP4XB','Long test 3',NULL,NULL,NULL,NULL,_binary '\0','123456','VLJTCHJX3XS6FKW7HT73WWBRG7NEBDJU'),(6,'tien',NULL,'0123456789',NULL,'demo@gmail.com','TEYLENP3LBXPQJX5EDISRIGXWR3KM6HY','demo',NULL,NULL,NULL,NULL,_binary '\0','123456','3QMCFLGUF3HYKL6VSKW7LRLKVAD3DPYZ');
/*!40000 ALTER TABLE `tsst_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-20 14:17:04
