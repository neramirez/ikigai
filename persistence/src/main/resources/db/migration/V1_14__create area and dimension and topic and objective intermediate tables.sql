CREATE TABLE IF NOT EXISTS `topic_dimension` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `topic_id` INT NOT NULL,
  `dimension_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_topic_dimension_topic1_idx` (`topic_id` ASC) VISIBLE,
  INDEX `fk_topic_dimension_dimension1_idx` (`dimension_id` ASC) VISIBLE,
  CONSTRAINT `fk_topic_dimension_topic1`
    FOREIGN KEY (`topic_id`)
    REFERENCES `topic` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_topic_dimension_dimension1`
    FOREIGN KEY (`dimension_id`)
    REFERENCES `dimension` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS `objective_activity` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `activity_id` INT NOT NULL,
  `objective_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_objective_activity_activity1_idx` (`activity_id` ASC) VISIBLE,
  INDEX `fk_objective_activity_objective1_idx` (`objective_id` ASC) VISIBLE,
  CONSTRAINT `fk_objective_activity_activity1`
    FOREIGN KEY (`activity_id`)
    REFERENCES `activity` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_objective_activity_objective1`
    FOREIGN KEY (`objective_id`)
    REFERENCES `objective` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);