DROP DATABASE IF EXISTS AIRLINE_RESERVATION;
CREATE DATABASE AIRLINE_RESERVATION;
USE AIRLINE_RESERVATION;

#
# TABLE STRUCTURE FOR: Locations
#

DROP TABLE IF EXISTS `Locations`;

CREATE TABLE `Locations` (
  `locID` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `country` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`locID`)
) ENGINE=InnoDB AUTO_INCREMENT=1050 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1000, 'Muellerhaven', 'Myanmar');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1001, 'West Shanny', 'Saint Martin');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1002, 'Port Jacynthe', 'New Caledonia');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1003, 'New Loyce', 'Zambia');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1004, 'East Zackeryfurt', 'Qatar');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1005, 'Bernhardchester', 'Norway');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1006, 'New Noelialand', 'Finland');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1007, 'Lake Carley', 'Falkland Islands (Malvinas)');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1008, 'Lake Gaetanoborough', 'Netherlands Antilles');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1009, 'Port Judge', 'Cape Verde');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1010, 'Johnsonchester', 'South Georgia and the South Sa');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1011, 'Mercedesbury', 'Cuba');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1012, 'East Evalynport', 'Morocco');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1013, 'South Denis', 'Thailand');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1014, 'Gutmannborough', 'Anguilla');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1015, 'Lebsackshire', 'Liechtenstein');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1016, 'Balistreriview', 'Bermuda');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1017, 'Consueloview', 'Iran');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1018, 'Jacobsonburgh', 'Liechtenstein');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1019, 'Monahanville', 'Cambodia');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1020, 'West Dangeloshire', 'Marshall Islands');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1021, 'Laneyside', 'Wallis and Futuna');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1022, 'North Karinamouth', 'Nepal');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1023, 'Mariaton', 'Holy See (Vatican City State)');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1024, 'Skileston', 'Brunei Darussalam');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1025, 'North Kirstinhaven', 'Suriname');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1026, 'North Ilaport', 'Iceland');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1027, 'Douglasmouth', 'France');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1028, 'Irwintown', 'Tanzania');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1029, 'New Verlie', 'Namibia');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1030, 'Ryleeland', 'Belarus');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1031, 'South Camila', 'Finland');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1032, 'Bartolettiside', 'Lebanon');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1033, 'Port Payton', 'Jordan');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1034, 'Goyettehaven', 'Sudan');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1035, 'Port Westley', 'Vietnam');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1036, 'Lake Colby', 'Cocos (Keeling) Islands');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1037, 'Noramouth', 'Gibraltar');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1038, 'East Izabella', 'Tokelau');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1039, 'Lake Adamouth', 'British Virgin Islands');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1040, 'New Kyliehaven', 'Zimbabwe');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1041, 'West Vergie', 'Philippines');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1042, 'Lake Daron', 'United States Virgin Islands');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1043, 'West Alfonso', 'Cote d\'Ivoire');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1044, 'New Raina', 'Saint Vincent and the Grenadin');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1045, 'Kemmerborough', 'Saint Barthelemy');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1046, 'Carterfurt', 'Mali');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1047, 'Abshiretown', 'Georgia');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1048, 'East Jedview', 'Mexico');
INSERT INTO `Locations` (`locID`, `city`, `country`) VALUES (1049, 'East Nat', 'Tunisia');

#
# TABLE STRUCTURE FOR: Airline
#

DROP TABLE IF EXISTS `Airline`;

CREATE TABLE `Airline` (
  `idAirline` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idAirline`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `Airline` (`idAirline`, `name`) VALUES (1, ' JetBlue');
INSERT INTO `Airline` (`idAirline`, `name`) VALUES (2, ' Virgin America');
INSERT INTO `Airline` (`idAirline`, `name`) VALUES (3, ' Delta');
INSERT INTO `Airline` (`idAirline`, `name`) VALUES (4, ' Frontier');
INSERT INTO `Airline` (`idAirline`, `name`) VALUES (5, ' Hawaiian');
INSERT INTO `Airline` (`idAirline`, `name`) VALUES (6, 'Southwest');


#
# TABLE STRUCTURE FOR: Airport
#

DROP TABLE IF EXISTS `Airport`;

CREATE TABLE `Airport` (
  `idAirport` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `locID` int(11) NOT NULL,
  PRIMARY KEY (`idAirport`),
  KEY `locID` (`locID`),
  CONSTRAINT `Airport_ibfk_1` FOREIGN KEY (`locID`) REFERENCES `Locations` (`locID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (1, ' San Diego Intl', 1035);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (2, ' Dallas Fort Worth Intl', 1043);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (3, ' Deadhorse', 1034);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (4, 'Aniak', 1038);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (5, ' Miami Intl', 1024);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (6, ' Denver Intl', 1027);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (7, ' McCarran Intl', 1004);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (8, ' LAX', 1032);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (9, ' SFO Intl', 1021);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (10, ' Hartsfield-Jackson ATL Intl', 1000);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (11, ' Minneapolis Intl', 1018);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (12, ' Logan Intl', 1000);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (13, ' Midway Intl', 1010);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (14, ' O\'Hare Intl', 1019);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (15, ' JFK', 1047);
INSERT INTO `Airport` (`idAirport`, `name`, `locID`) VALUES (16, ' Bethel', 1024);

#
# TABLE STRUCTURE FOR: PlaneModel
#

DROP TABLE IF EXISTS `PlaneModel`;

CREATE TABLE `PlaneModel` (
  `idModel` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `capacity` int(11) NOT NULL,
  PRIMARY KEY (`idModel`)
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `PlaneModel` (`idModel`, `name`, `capacity`) VALUES (1000, ' Boeing 747', 187);
INSERT INTO `PlaneModel` (`idModel`, `name`, `capacity`) VALUES (1001, ' Boeing 737 Max', 156);
INSERT INTO `PlaneModel` (`idModel`, `name`, `capacity`) VALUES (1002, 'Boeing 737', 184);

#
# TABLE STRUCTURE FOR: Plane
#

DROP TABLE IF EXISTS `Plane`;

CREATE TABLE `Plane` (
  `planeID` int(11) NOT NULL AUTO_INCREMENT,
  `idAirline` int(11) NOT NULL,
  `idModel` int(11) NOT NULL,
  PRIMARY KEY (`planeID`),
  KEY `idAirline` (`idAirline`),
  KEY `idModel` (`idModel`),
  CONSTRAINT `Plane_ibfk_1` FOREIGN KEY (`idAirline`) REFERENCES `Airline` (`idAirline`) ON DELETE CASCADE,
  CONSTRAINT `Plane_ibfk_2` FOREIGN KEY (`idModel`) REFERENCES `PlaneModel` (`idModel`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1050 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1000, 6, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1001, 4, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1002, 5, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1003, 5, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1004, 5, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1005, 2, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1006, 5, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1007, 3, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1008, 1, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1009, 5, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1010, 6, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1011, 3, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1012, 1, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1013, 5, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1014, 1, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1015, 1, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1016, 5, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1017, 1, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1018, 5, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1019, 1, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1020, 6, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1021, 3, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1022, 3, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1023, 5, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1024, 4, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1025, 4, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1026, 5, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1027, 1, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1028, 2, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1029, 2, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1030, 1, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1031, 3, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1032, 1, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1033, 3, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1034, 3, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1035, 3, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1036, 6, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1037, 6, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1038, 3, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1039, 1, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1040, 2, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1041, 3, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1042, 4, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1043, 1, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1044, 3, 1000);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1045, 2, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1046, 4, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1047, 2, 1001);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1048, 2, 1002);
INSERT INTO `Plane` (`planeID`, `idAirline`, `idModel`) VALUES (1049, 3, 1001);

#
# TABLE STRUCTURE FOR: ArchiveFlights
#

DROP TABLE IF EXISTS `ArchiveFlights`;

CREATE TABLE `ArchiveFlights` (
  `flightID` int(11) NOT NULL AUTO_INCREMENT,
  `planeID` int(11) NOT NULL,
  `departAirportID` int(11) NOT NULL,
  `arriveAirportID` int(11) NOT NULL,
  `departDate` date NOT NULL,
  `arriveDate` date NOT NULL,
  PRIMARY KEY (`flightID`),
  KEY `planeID` (`planeID`),
  KEY `departAirportID` (`departAirportID`),
  KEY `arriveAirportID` (`arriveAirportID`),
  CONSTRAINT `ArchiveFlights_ibfk_1` FOREIGN KEY (`planeID`) REFERENCES `Plane` (`planeID`) ON DELETE CASCADE,
  CONSTRAINT `ArchiveFlights_ibfk_2` FOREIGN KEY (`departAirportID`) REFERENCES `Airport` (`idAirport`) ON DELETE CASCADE,
  CONSTRAINT `ArchiveFlights_ibfk_3` FOREIGN KEY (`arriveAirportID`) REFERENCES `Airport` (`idAirport`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# TABLE STRUCTURE FOR: Flight
#

DROP TABLE IF EXISTS `Flight`;

CREATE TABLE `Flight` (
  `flightID` int(11) NOT NULL AUTO_INCREMENT,
  `planeID` int(11) NOT NULL,
  `departAirportID` int(11) NOT NULL,
  `arriveAirportID` int(11) NOT NULL,
  `departDate` date NOT NULL,
  `arriveDate` date NOT NULL,
  PRIMARY KEY (`flightID`),
  KEY `planeID` (`planeID`),
  KEY `departAirportID` (`departAirportID`),
  KEY `arriveAirportID` (`arriveAirportID`),
  CONSTRAINT `Flight_ibfk_1` FOREIGN KEY (`planeID`) REFERENCES `Plane` (`planeID`) ON DELETE CASCADE,
  CONSTRAINT `Flight_ibfk_2` FOREIGN KEY (`departAirportID`) REFERENCES `Airport` (`idAirport`) ON DELETE CASCADE,
  CONSTRAINT `Flight_ibfk_3` FOREIGN KEY (`arriveAirportID`) REFERENCES `Airport` (`idAirport`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1100 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1050, 1021, 13, 14, '2011-08-26', '1982-05-03');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1051, 1000, 13, 2, '2015-11-02', '1975-06-19');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1052, 1022, 2, 4, '1992-01-04', '2004-05-04');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1053, 1000, 7, 10, '1991-06-26', '2006-01-16');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1054, 1014, 1, 7, '2012-04-12', '1989-02-09');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1055, 1021, 5, 5, '2003-10-25', '2000-10-04');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1056, 1002, 2, 7, '1979-02-17', '1995-07-30');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1057, 1026, 10, 9, '1986-11-07', '2012-11-07');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1058, 1023, 15, 14, '1994-12-11', '1986-02-04');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1059, 1027, 4, 16, '2014-09-26', '1995-10-22');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1060, 1046, 10, 13, '1982-02-22', '2010-11-14');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1061, 1037, 10, 9, '1987-02-12', '1989-06-11');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1062, 1043, 2, 10, '1992-10-28', '1997-10-07');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1063, 1003, 2, 1, '1998-10-11', '2005-06-21');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1064, 1033, 6, 2, '1979-06-17', '1982-10-28');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1065, 1004, 13, 6, '2011-03-23', '1985-04-10');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1066, 1018, 14, 8, '1978-10-20', '1972-07-11');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1067, 1039, 7, 1, '2007-10-07', '1972-06-19');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1068, 1015, 14, 16, '1972-03-24', '1995-08-09');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1069, 1008, 7, 3, '2012-06-08', '1995-08-03');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1070, 1007, 6, 13, '1988-01-26', '1989-06-30');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1071, 1045, 2, 7, '1977-03-08', '2007-04-23');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1072, 1022, 16, 8, '2013-09-17', '1987-01-08');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1073, 1003, 1, 9, '2002-08-28', '1990-08-02');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1074, 1005, 12, 15, '1975-11-30', '2007-05-05');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1075, 1008, 13, 11, '1978-06-20', '1974-08-06');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1076, 1026, 3, 9, '1999-09-05', '1999-12-28');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1077, 1000, 16, 15, '1972-09-01', '1970-10-01');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1078, 1001, 5, 13, '2013-09-16', '1993-04-22');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1079, 1049, 7, 3, '2001-12-14', '2012-06-18');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1080, 1007, 10, 8, '2002-06-15', '2017-07-01');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1081, 1045, 8, 10, '1986-05-10', '1976-05-22');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1082, 1013, 15, 9, '2015-04-10', '1994-11-19');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1083, 1036, 1, 10, '1977-09-28', '2007-11-05');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1084, 1012, 2, 5, '2002-04-07', '1998-03-22');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1085, 1006, 5, 2, '1973-10-11', '2017-01-06');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1086, 1040, 14, 4, '1992-04-05', '2006-06-29');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1087, 1016, 14, 3, '1996-03-28', '1986-11-23');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1088, 1012, 15, 7, '2006-10-26', '2015-10-09');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1089, 1049, 15, 14, '2001-03-19', '1992-05-02');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1090, 1007, 1, 7, '1999-07-03', '1976-08-13');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1091, 1032, 15, 15, '1990-11-30', '1980-07-13');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1092, 1011, 4, 14, '1987-05-21', '2001-03-18');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1093, 1039, 15, 14, '1994-07-20', '2011-12-23');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1094, 1017, 3, 16, '1976-03-10', '1998-08-08');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1095, 1031, 5, 5, '1974-07-13', '2007-04-18');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1096, 1035, 2, 2, '1981-12-24', '1981-12-05');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1097, 1046, 8, 16, '1982-08-09', '1970-05-26');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1098, 1005, 12, 14, '1977-02-02', '1983-07-24');
INSERT INTO `Flight` (`flightID`, `planeID`, `departAirportID`, `arriveAirportID`, `departDate`, `arriveDate`) VALUES (1099, 1026, 12, 12, '1988-10-21', '2015-12-27');

#
# TABLE STRUCTURE FOR: Person
#

DROP TABLE IF EXISTS `Person`;

CREATE TABLE `Person` (
  `pID` int(11) NOT NULL AUTO_INCREMENT,
  `pFirst` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `pLast` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `pAge` int(11) NOT NULL,
  `phoneNum` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`pID`)
) ENGINE=InnoDB AUTO_INCREMENT=1050 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1000, 'Miss Frida Hegmann', 'Metz', 6, '02592669603', 'nathanael.bogan@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1001, 'Martina Smitham', 'Kreiger', 59, '505.745.3749x211', 'mitchell.verda@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1002, 'Ms. Desiree Gottlieb', 'Franecki', 8, '+39(4)1103256779', 'lori53@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1003, 'Jayda Kerluke', 'Friesen', 50, '115.334.7676', 'moen.kiarra@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1004, 'Noel Pagac', 'Paucek', 87, '146-926-7742', 'chase.koch@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1005, 'Jayson Kuhic I', 'Klocko', 71, '09651012934', 'jennyfer.windler@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1006, 'Dr. Lance Schuster', 'Cruickshank', 53, '1-511-641-1624', 'gwendolyn.padberg@example.com');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1007, 'Sandy Olson', 'Sporer', 32, '1-678-580-5780', 'adelle16@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1008, 'Ayden Orn', 'Swaniawski', 96, '(325)131-2423', 'boris.corwin@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1009, 'Isobel Okuneva', 'Huel', 8, '(978)910-3403x45', 'aylin.langworth@example.com');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1010, 'Mrs. Zula Herman', 'Lang', 83, '1-099-194-1515', 'nola33@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1011, 'Leonora Schmitt', 'Carter', 19, '(560)248-2477x29', 'turcotte.troy@example.com');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1012, 'Adela Ryan', 'Nitzsche', 47, '02809947341', 'owelch@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1013, 'Prof. Elvie Kub I', 'Hand', 36, '1-430-487-2687x7', 'murphy20@example.com');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1014, 'Ms. Zita Klein MD', 'Braun', 19, '1-689-577-1987x8', 'carley63@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1015, 'Bernadine Lowe MD', 'Altenwerth', 46, '1-962-058-7092', 'lilian.schulist@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1016, 'Gwen Murphy Jr.', 'Schaden', 53, '02239417876', 'kstracke@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1017, 'Prof. Phoebe Trantow I', 'Schiller', 86, '(818)466-1345x65', 'jblick@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1018, 'Dulce Bailey', 'Barrows', 61, '356-916-8686x234', 'samir08@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1019, 'Avis Daugherty', 'Kovacek', 36, '04284040012', 'haylee.terry@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1020, 'Elmira Nikolaus I', 'Okuneva', 35, '(025)520-0989', 'kstrosin@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1021, 'Prof. Javon Waters IV', 'Johnston', 31, '1-715-386-6193x8', 'barbara.wehner@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1022, 'Kiarra DuBuque', 'Wilkinson', 29, '1-511-254-0755x5', 'cicero43@example.com');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1023, 'Zachery VonRueden', 'Corkery', 86, '1-709-381-1864', 'jmurray@example.com');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1024, 'Mr. Jovan Beier Sr.', 'Robel', 53, '(267)486-9531', 'taryn.brakus@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1025, 'Immanuel Weissnat', 'Block', 91, '06943916130', 'wisozk.hal@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1026, 'Prof. Matteo Jerde IV', 'Marks', 20, '1-997-348-2165x8', 'mable87@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1027, 'Vivienne Hand', 'Schulist', 19, '04593549796', 'fgibson@example.com');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1028, 'Tiara Morissette', 'Padberg', 47, '(185)815-9153', 'dustin.collins@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1029, 'Concepcion Rodriguez', 'Rath', 41, '782.125.4852', 'saul85@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1030, 'Faye Larkin', 'Denesik', 24, '314.306.2710', 'nfriesen@example.com');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1031, 'Chelsea Streich', 'Considine', 69, '(604)874-1769', 'mayra31@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1032, 'Lauretta Roberts', 'Bogan', 52, '993-837-0613x044', 'rasheed.lubowitz@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1033, 'Dr. Aric McDermott', 'Dickens', 64, '1-737-689-9644x0', 'amuller@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1034, 'Avis Braun', 'Russel', 89, '07481852283', 'darren70@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1035, 'Jayda Prohaska', 'Schuster', 22, '026.085.0850', 'schmidt.dylan@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1036, 'Miss Shyann Ankunding III', 'Gislason', 24, '626-159-1552', 'macejkovic.edyth@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1037, 'Vergie D\'Amore', 'Spencer', 4, '053-603-7339x076', 'terrence38@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1038, 'Lorenz Howe', 'Nicolas', 100, '1-444-451-1902', 'otho78@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1039, 'Pansy Stiedemann', 'Heathcote', 88, '463.626.9538', 'howard.rosenbaum@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1040, 'Akeem McKenzie Jr.', 'Donnelly', 59, '704-226-3552x447', 'shyanne95@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1041, 'Matt Kuvalis', 'Walter', 20, '158-321-8175x537', 'conor.schaefer@example.com');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1042, 'Odie Erdman', 'Runolfsson', 67, '(168)847-4882x73', 'enoch.aufderhar@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1043, 'Raina Legros', 'DuBuque', 66, '097-830-8026x837', 'mlehner@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1044, 'Nayeli Ryan', 'Towne', 51, '1-345-773-4546x7', 'ed.towne@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1045, 'Marilie Schroeder', 'Johnson', 70, '860-946-7651', 'reichel.beaulah@example.net');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1046, 'Oceane Emard', 'Monahan', 77, '334.908.3716x878', 'yprice@example.org');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1047, 'Prof. Shemar Mueller', 'Emmerich', 51, '574-381-1343x334', 'geovanny.schroeder@example.com');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1048, 'Marielle Gusikowski', 'Kulas', 73, '569-473-8865', 'layla.wehner@example.com');
INSERT INTO `Person` (`pID`, `pFirst`, `pLast`, `pAge`, `phoneNum`, `email`) VALUES (1049, 'Orin Reilly', 'Murazik', 7, '555-460-1386', 'vada.gerhold@example.net');

#
# TABLE STRUCTURE FOR: Passenger
#

DROP TABLE IF EXISTS `Passenger`;

CREATE TABLE `Passenger` (
  `flightID` int(11) NOT NULL,
  `pID` int(11) NOT NULL,
  `firstClass` tinyint(1) NOT NULL,
  PRIMARY KEY (`flightID`,`pID`),
  KEY `pID` (`pID`),
  CONSTRAINT `Passenger_ibfk_1` FOREIGN KEY (`flightID`) REFERENCES `Flight` (`flightID`) ON DELETE CASCADE,
  CONSTRAINT `Passenger_ibfk_2` FOREIGN KEY (`pID`) REFERENCES `Person` (`pID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1050, 1032, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1051, 1010, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1053, 1031, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1054, 1021, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1060, 1007, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1060, 1025, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1060, 1028, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1061, 1003, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1061, 1019, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1061, 1030, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1062, 1000, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1062, 1041, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1063, 1020, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1064, 1014, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1065, 1039, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1066, 1027, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1068, 1045, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1073, 1028, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1073, 1046, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1074, 1000, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1074, 1005, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1075, 1019, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1076, 1002, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1076, 1022, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1079, 1006, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1080, 1007, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1080, 1040, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1081, 1006, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1081, 1041, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1083, 1011, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1083, 1024, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1085, 1020, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1087, 1019, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1087, 1044, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1087, 1046, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1088, 1015, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1088, 1036, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1089, 1002, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1091, 1020, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1091, 1031, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1092, 1003, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1093, 1030, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1094, 1012, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1095, 1041, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1095, 1042, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1096, 1018, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1096, 1033, 1);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1096, 1040, 0);
INSERT INTO `Passenger` (`flightID`, `pID`, `firstClass`) VALUES (1097, 1009, 1);

DELETE FROM Flight
WHERE departAirportID = arriveAirportID OR departDate > arriveDate;