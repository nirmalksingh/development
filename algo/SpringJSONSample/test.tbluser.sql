---------START (For creating table for holding uniq rows)-----

DROP TABLE IF EXISTS tbluser;

CREATE TABLE tbluser
(
userid int NOT NULL AUTO_INCREMENT,
firstname VARCHAR(255) NOT NULL,
lastname VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL,
PRIMARY KEY (userid),
CONSTRAINT unq_rw UNIQUE (firstname,lastname,email)
);

---------END (For creating table for holding uniq rows)-------

/*
SQLyog Community Edition- MySQL GUI v7.02 
MySQL - 5.0.51b-community-nt : Database - classicmodels
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`classicmodels` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `classicmodels`;

/*Table structure for table `customers` */

DROP TABLE IF EXISTS `tbluser`;
CREATE TABLE `tbluser` (`userid` INT AUTO_INCREMENT NOT NULL, `firstname` varchar(50),`lastname` varchar(50),`email` varchar(50), primary key(userid));