CREATE TABLE IF NOT EXISTS `membership` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  `payment_range` VARCHAR(45) NULL,
  `payment_value` VARCHAR(45) NULL,
  `allowed_students` INT NULL,
  `evaluator_included` TINYINT NULL,
  `currently_offered` TINYINT NULL,
  PRIMARY KEY (`id`))