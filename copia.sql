-- MySQL dump 10.13  Distrib 5.1.50, for Win64 (unknown)
--
-- Host: localhost    Database: Concord_Cabos
-- ------------------------------------------------------
-- Server version	5.1.50-community

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `ID_Client` varchar(5) NOT NULL,
  `Nombre` varchar(40) NOT NULL,
  `Ap_Pat` varchar(30) NOT NULL,
  `Ap_Mat` varchar(30) DEFAULT NULL,
  `TEL` varchar(12) NOT NULL,
  `Calle` varchar(40) DEFAULT NULL,
  `No_Ext` varchar(5) DEFAULT NULL,
  `No_Int` varchar(5) DEFAULT NULL,
  `Colonia` varchar(20) DEFAULT NULL,
  `Municipio` varchar(20) DEFAULT NULL,
  `CP` varchar(10) DEFAULT NULL,
  `Estado` varchar(20) NOT NULL,
  `Pais` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_Client`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('23','asda','sdfsdf','dsf','2343','cvx','34','34','sdgs','gfdfg','2323','dfgdfg','dfggd'),('263','gatha','sfhjsyj','shjyj','246373457','ganatha','463','3573','fjyswyuw','swtyjsryj','246357','stysjsy','yjsyujstry'),('3456','Vic','sfhjsyj','shjyj','246373457','ganatha','463','3573','fjyswyuw','swtyjsryj','246357','stysjsy','yjsyujstry');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitacion`
--

DROP TABLE IF EXISTS `habitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habitacion` (
  `No_Hab` int(11) NOT NULL,
  `Cap_Per` int(11) NOT NULL,
  `Tipo_Hab` varchar(15) NOT NULL,
  `Status` varchar(15) NOT NULL,
  `Costo` float NOT NULL,
  PRIMARY KEY (`No_Hab`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitacion`
--

LOCK TABLES `habitacion` WRITE;
/*!40000 ALTER TABLE `habitacion` DISABLE KEYS */;
INSERT INTO `habitacion` VALUES (1,2,'Sencilla','Disponible',320),(2,2,'Sencilla','Disponible',320),(3,2,'Sencilla','Disponible',320),(4,2,'Sencilla','Disponible',320),(5,2,'Sencilla','Disponible',320),(6,2,'Sencilla','Disponible',320),(7,2,'Sencilla','Disponible',320),(8,2,'Sencilla','Disponible',320),(9,2,'Sencilla','Disponible',320),(10,2,'Sencilla','Disponible',320),(11,4,'Doble','Disponible',620),(12,4,'Doble','Disponible',620),(13,4,'Doble','Disponible',620),(14,4,'Doble','Disponible',620),(15,4,'Doble','Disponible',620),(16,4,'Doble','Disponible',620),(17,4,'Doble','Disponible',620),(18,4,'Doble','Disponible',620),(19,4,'Doble','Disponible',620),(20,4,'Doble','Disponible',620),(21,6,'Suite','Disponible',970),(22,6,'Suite','Disponible',970),(23,6,'Suite','Disponible',970),(24,6,'Suite','Disponible',970),(25,6,'Suite','Disponible',970);
/*!40000 ALTER TABLE `habitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reserva` (
  `Cod_Reser` varchar(5) NOT NULL,
  `Cant_Hab` int(11) NOT NULL,
  `No_Hab` int(11) NOT NULL,
  `Fec_Ini` date NOT NULL,
  `Dias_Hos` int(11) NOT NULL,
  `ID_Client` varchar(5) NOT NULL,
  `Status` varchar(15) NOT NULL,
  `Costo` float NOT NULL,
  PRIMARY KEY (`Cod_Reser`),
  KEY `FK_1` (`ID_Client`),
  KEY `FK_2` (`No_Hab`),
  CONSTRAINT `FK_1` FOREIGN KEY (`ID_Client`) REFERENCES `cliente` (`ID_Client`),
  CONSTRAINT `FK_2` FOREIGN KEY (`No_Hab`) REFERENCES `habitacion` (`No_Hab`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` VALUES ('34',2,2,'2020-03-12',3,'3456','Ocupado',320);
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ventas` (
  `ID_Ven` int(11) NOT NULL,
  `ID_Client` varchar(5) NOT NULL,
  `No_Hab` int(11) NOT NULL,
  `Cod_Reser` varchar(5) NOT NULL,
  `Costo` float NOT NULL,
  `IVA` decimal(10,0) NOT NULL,
  `Dias_Hos` int(11) NOT NULL,
  `Total` decimal(10,0) NOT NULL,
  PRIMARY KEY (`ID_Ven`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (235,'245',234,'245',344,'1',23,'15033'),(335,'34',4,'357',370,'0',4,'1820');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-17 14:23:39
