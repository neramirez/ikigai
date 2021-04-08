CREATE TABLE IF NOT EXISTS `home` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `active` TINYINT NULL,
  `last_payment` DATETIME NULL,
  `next_payment` DATETIME NULL,
  `membership_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_home_membership1_idx` (`membership_id` ASC) VISIBLE,
  CONSTRAINT `fk_home_membership1`
    FOREIGN KEY (`membership_id`)
    REFERENCES `membership` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
