SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for zk_contract
-- ----------------------------
DROP TABLE IF EXISTS `0501contract`;
CREATE TABLE `0501contract`
(
  `company_id`            int(11)    NOT NULL ,
  `bank_name`           varchar(255) NOT NULL,
  `email`           varchar(255) NOT NULL,
  `singer`           varchar(255) ,
  `tax_payer_id`           varchar(255) NOT NULL,
  `alipay_app_id`           varchar(255),
  `alipay_app_key`           varchar(255),
  `wechatpay_app_id`           varchar(255),
  `wechatpay_app_key`           varchar(255),
  PRIMARY KEY (`company_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
