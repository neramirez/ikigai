CREATE TABLE IF NOT EXISTS `relative` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NULL,
  `home_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  INDEX `fk_relative_home1_idx` (`home_id` ASC) VISIBLE,
  CONSTRAINT `fk_relative_home1`
    FOREIGN KEY (`home_id`)
    REFERENCES `home` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)