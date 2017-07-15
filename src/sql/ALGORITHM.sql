CREATE TABLE `algorithm` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `algorithm_value` varchar(3000) NOT NULL DEFAULT '',
  `last_modified_time` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_algorithm_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;