CREATE TABLE IF NOT EXISTS `student_tutor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `student_id` INT NOT NULL,
  `tutor_id` INT NOT NULL,
  `active_tutor` TINYINT NULL,
   PRIMARY KEY (`id`),
  INDEX `fk_student_tutor_student1_idx` (`student_id` ASC) VISIBLE,
  INDEX `fk_student_tutor_tutor1_idx` (`tutor_id` ASC) VISIBLE,
  CONSTRAINT `fk_student_tutor_student1`
    FOREIGN KEY (`student_id`)
    REFERENCES `student` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_tutor_tutor1`
    FOREIGN KEY (`tutor_id`)
    REFERENCES `tutor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
