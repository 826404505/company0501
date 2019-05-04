SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for zk_company
-- ----------------------------
DROP TABLE IF EXISTS `0501company`;
CREATE TABLE `0501company`
(
  `company_id`            int(11)      NOT NULL auto_increment,
  `code`           varchar(255) NOT NULL,
  `name`           varchar(255) NOT NULL,
  `shortcut`           varchar(255),
  `type`           int(11),
  `phone`           varchar(255),
  `mp_id`           varchar(255),
  `auth_code`           varchar(255),
  `auth_date`           datetime,
  `description`           varchar(255),
  `area_id` int(11),
  `contracted`               bit,
  PRIMARY KEY (`company_id`),
  unique `idx_code` (`code`),
  unique `idx_name` (`name`),
  index `idx_type` (`type`),
  index `idx_area_id` (`area_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
