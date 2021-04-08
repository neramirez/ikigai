CREATE TABLE IF NOT EXISTS `area` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `area` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `area_UNIQUE` (`area` ASC) VISIBLE);
CREATE TABLE IF NOT EXISTS `dimension` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dimension` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `dimension_UNIQUE` (`dimension` ASC) VISIBLE);
CREATE TABLE IF NOT EXISTS `topic` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `topic` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `topic_UNIQUE` (`topic` ASC) VISIBLE);
CREATE TABLE IF NOT EXISTS `objective` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `objective` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `objective_UNIQUE` (`objective` ASC) VISIBLE);