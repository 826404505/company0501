SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for zk_admin
-- ----------------------------
DROP TABLE IF EXISTS `0501admin`;
CREATE TABLE `0501admin`
(
  `admin_id`            int(11)      NOT NULL auto_increment,
  `name`           varchar(255) NOT NULL,
  `gender` int(11),
  `level` int(11),
  `area_id`               int(11),
  `company_id` int(11),
  PRIMARY KEY (`admin_id`),
  index `idx_area_id` (`area_id`),
  index `idx_company_id` (`company_id`),
  index `idx_level` (`level`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
