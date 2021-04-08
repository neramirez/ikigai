CREATE TABLE IF NOT EXISTS `activity_intelligence` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `activity_id` INT NOT NULL,
  `intelligence_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_activity_intelligence_activity1_idx` (`activity_id` ASC) VISIBLE,
  INDEX `fk_activity_intelligence_intelligence1_idx` (`intelligence_id` ASC) VISIBLE,
  CONSTRAINT `fk_activity_intelligence_activity1`
    FOREIGN KEY (`activity_id`)
    REFERENCES `activity` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_activity_intelligence_intelligence1`
    FOREIGN KEY (`intelligence_id`)
    REFERENCES `intelligence` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
