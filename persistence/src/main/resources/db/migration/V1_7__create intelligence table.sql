CREATE TABLE IF NOT EXISTS `intelligence` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `intelligence` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `intelligence_UNIQUE` (`intelligence` ASC) VISIBLE,
  UNIQUE INDEX `description_UNIQUE` (`description` ASC) VISIBLE)
