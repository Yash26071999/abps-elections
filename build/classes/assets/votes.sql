-- SOURCE C:\...\votes.sql


DROP DATABASE if exists `elections`;

CREATE DATABASE IF NOT EXISTS `elections`;

USE `elections`;

CREATE TABLE IF NOT EXISTS `votes` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `classname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `schno` int(10) unsigned NOT NULL,
  `voted_girl` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `voted_boy` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `schno` (`schno`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;
