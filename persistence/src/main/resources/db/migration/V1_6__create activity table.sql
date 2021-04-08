CREATE TABLE IF NOT EXISTS `activity` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `published` TINYINT NOT NULL DEFAULT 0,
  `approval_status` VARCHAR(45) NOT NULL DEFAULT 'PENDING',
  `duration` VARCHAR(45) NULL,
  `download_url` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `approval_status_UNIQUE` (`approval_status` ASC) VISIBLE)
