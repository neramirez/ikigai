CREATE TABLE IF NOT EXISTS `home_tutor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `home_id` INT NOT NULL,
  `tutor_id` INT NOT NULL,
  PRIMARY KEY (`id`, `home_id`, `tutor_id`),
  INDEX `fk_home_tutor_home1_idx` (`home_id` ASC) VISIBLE,
  INDEX `fk_home_tutor_tutor1_idx` (`tutor_id` ASC) VISIBLE,
  CONSTRAINT `fk_home_tutor_home1`
    FOREIGN KEY (`home_id`)
    REFERENCES `home` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_home_tutor_tutor1`
    FOREIGN KEY (`tutor_id`)
    REFERENCES `tutor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
