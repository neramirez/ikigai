CREATE TABLE IF NOT EXISTS `activity_topic` (
  `id` INT NOT NULL,
  `topic_id` INT NOT NULL,
  `activity_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_activity_topic_topic1_idx` (`topic_id` ASC) VISIBLE,
  INDEX `fk_activity_topic_activity1_idx` (`activity_id` ASC) VISIBLE,
  CONSTRAINT `fk_activity_topic_topic1`
    FOREIGN KEY (`topic_id`)
    REFERENCES `topic` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_activity_topic_activity1`
    FOREIGN KEY (`activity_id`)
    REFERENCES `activity` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
