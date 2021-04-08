CREATE TABLE IF NOT EXISTS `area_intelligence` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `area_id` INT NOT NULL,
  `intelligence_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_area_intelligence_area1_idx` (`area_id` ASC) VISIBLE,
  INDEX `fk_area_intelligence_intelligence1_idx` (`intelligence_id` ASC) VISIBLE,
  CONSTRAINT `fk_area_intelligence_area1`
    FOREIGN KEY (`area_id`)
    REFERENCES `area` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_area_intelligence_intelligence1`
    FOREIGN KEY (`intelligence_id`)
    REFERENCES `intelligence` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS `dimension_area` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dimension_id` INT NOT NULL,
  `area_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_dimension_area_dimension1_idx` (`dimension_id` ASC) VISIBLE,
  INDEX `fk_dimension_area_area1_idx` (`area_id` ASC) VISIBLE,
  CONSTRAINT `fk_dimension_area_dimension1`
    FOREIGN KEY (`dimension_id`)
    REFERENCES `dimension` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_dimension_area_area1`
    FOREIGN KEY (`area_id`)
    REFERENCES `area` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

