CREATE TABLE IF NOT EXISTS `student_activity` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `finished` TINYINT NULL DEFAULT 0,
  `tutor_id` INT NOT NULL,
  `student_id` INT NOT NULL,
  `activity_id` INT NOT NULL,
  `comments` TEXT(200) NULL,
  `responsible_relative_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_student_activity_tutor1_idx` (`tutor_id` ASC) VISIBLE,
  INDEX `fk_student_activity_student1_idx` (`student_id` ASC) VISIBLE,
  INDEX `fk_student_activity_activity1_idx` (`activity_id` ASC) VISIBLE,
  INDEX `fk_student_activity_relative1_idx` (`responsible_relative_id` ASC) VISIBLE,
  CONSTRAINT `fk_student_activity_tutor1`
    FOREIGN KEY (`tutor_id`)
    REFERENCES `tutor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_activity_student1`
    FOREIGN KEY (`student_id`)
    REFERENCES `student` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_activity_activity1`
    FOREIGN KEY (`activity_id`)
    REFERENCES `activity` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_activity_relative1`
    FOREIGN KEY (`responsible_relative_id`)
    REFERENCES `relative` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
