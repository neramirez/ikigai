CREATE TABLE IF NOT EXISTS `student` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `date_of_birth` DATETIME NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `home_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_student_home1_idx` (`home_id` ASC) VISIBLE,
  CONSTRAINT `fk_student_home1`
    FOREIGN KEY (`home_id`)
    REFERENCES `home` (`id`)
    ON DELETE SET NULL
    ON UPDATE NO ACTION)
