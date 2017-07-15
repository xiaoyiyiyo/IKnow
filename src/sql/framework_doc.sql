CREATE TABLE `framework_doc` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `doc_name` varchar(100) NOT NULL DEFAULT '',
  `doc_url` varchar(500) NOT NULL DEFAULT '',
  `last_modified_time` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_doc_name` (`doc_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;