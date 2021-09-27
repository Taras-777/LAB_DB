-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema khomyn_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema khomyn_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `khomyn_db` DEFAULT CHARACTER SET utf8 ;
USE `khomyn_db` ;

-- -----------------------------------------------------
-- Table `khomyn_db`.`first_meal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`first_meal` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `weight` FLOAT NOT NULL,
  `calories` FLOAT NOT NULL,
  `proteins` FLOAT NOT NULL,
  `fat` FLOAT NOT NULL,
  `carbohydrates` FLOAT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`supplements`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`supplements` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `protein` FLOAT NULL,
  `collagen` FLOAT NULL,
  `amino_acids` FLOAT NULL,
  `creatine` FLOAT NULL,
  `bcaa` FLOAT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`first_meal_supl`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`first_meal_supl` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_meal_id` INT NOT NULL,
  `supplements_id` INT NOT NULL,
  PRIMARY KEY (`id`, `first_meal_id`, `supplements_id`),
  INDEX `fk_first_meal_supl_first_meal1_idx` (`first_meal_id` ASC) VISIBLE,
  INDEX `fk_first_meal_supl_supplements1_idx` (`supplements_id` ASC) VISIBLE,
  CONSTRAINT `fk_first_meal_supl_first_meal1`
    FOREIGN KEY (`first_meal_id`)
    REFERENCES `khomyn_db`.`first_meal` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_first_meal_supl_supplements1`
    FOREIGN KEY (`supplements_id`)
    REFERENCES `khomyn_db`.`supplements` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`second_meal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`second_meal` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `weight` FLOAT NOT NULL,
  `calories` FLOAT NOT NULL,
  `proteins` FLOAT NOT NULL,
  `fat` FLOAT NOT NULL,
  `carbohydrates` FLOAT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`second_meal_supl`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`second_meal_supl` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `second_meal_id` INT NOT NULL,
  `supplements_id` INT NOT NULL,
  PRIMARY KEY (`id`, `second_meal_id`, `supplements_id`),
  INDEX `fk_second_meal_supl_second_meal1_idx` (`second_meal_id` ASC) VISIBLE,
  INDEX `fk_second_meal_supl_supplements1_idx` (`supplements_id` ASC) VISIBLE,
  CONSTRAINT `fk_second_meal_supl_second_meal1`
    FOREIGN KEY (`second_meal_id`)
    REFERENCES `khomyn_db`.`second_meal` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_second_meal_supl_supplements1`
    FOREIGN KEY (`supplements_id`)
    REFERENCES `khomyn_db`.`supplements` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`third_meal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`third_meal` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `weight` FLOAT NOT NULL,
  `calories` FLOAT NOT NULL,
  `proteins` FLOAT NOT NULL,
  `fat` FLOAT NOT NULL,
  `carbohydrates` FLOAT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`third_meal_supl`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`third_meal_supl` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `third_meal_id` INT NOT NULL,
  `supplements_id` INT NOT NULL,
  PRIMARY KEY (`id`, `third_meal_id`, `supplements_id`),
  INDEX `fk_third_meal_supl_third_meal1_idx` (`third_meal_id` ASC) VISIBLE,
  INDEX `fk_third_meal_supl_supplements1_idx` (`supplements_id` ASC) VISIBLE,
  CONSTRAINT `fk_third_meal_supl_third_meal1`
    FOREIGN KEY (`third_meal_id`)
    REFERENCES `khomyn_db`.`third_meal` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_third_meal_supl_supplements1`
    FOREIGN KEY (`supplements_id`)
    REFERENCES `khomyn_db`.`supplements` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`diet`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`diet` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_meal_supl_id` INT NOT NULL,
  `second_meal_supl_id` INT NOT NULL,
  `third_meal_supl_id` INT NOT NULL,
  PRIMARY KEY (`id`, `first_meal_supl_id`, `second_meal_supl_id`, `third_meal_supl_id`),
  INDEX `fk_diet_first_meal_supl1_idx` (`first_meal_supl_id` ASC) VISIBLE,
  INDEX `fk_diet_second_meal_supl1_idx` (`second_meal_supl_id` ASC) VISIBLE,
  INDEX `fk_diet_third_meal_supl1_idx` (`third_meal_supl_id` ASC) VISIBLE,
  CONSTRAINT `fk_diet_first_meal_supl1`
    FOREIGN KEY (`first_meal_supl_id`)
    REFERENCES `khomyn_db`.`first_meal_supl` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_diet_second_meal_supl1`
    FOREIGN KEY (`second_meal_supl_id`)
    REFERENCES `khomyn_db`.`second_meal_supl` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_diet_third_meal_supl1`
    FOREIGN KEY (`third_meal_supl_id`)
    REFERENCES `khomyn_db`.`third_meal_supl` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`nutritionist`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`nutritionist` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `full_name` VARCHAR(80) NOT NULL,
  `reviews` FLOAT NOT NULL,
  `license` TINYINT NOT NULL,
  `diet_id` INT NOT NULL,
  PRIMARY KEY (`id`, `diet_id`),
  INDEX `fk_nutritionist_diet1_idx` (`diet_id` ASC) VISIBLE,
  CONSTRAINT `fk_nutritionist_diet1`
    FOREIGN KEY (`diet_id`)
    REFERENCES `khomyn_db`.`diet` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`sportsman`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`sportsman` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `full_name` VARCHAR(82) NOT NULL,
  `weight` FLOAT NOT NULL,
  `height` FLOAT NOT NULL,
  `type_of_sport` VARCHAR(45) NOT NULL,
  `nutritionist_id` INT NOT NULL,
  PRIMARY KEY (`id`, `nutritionist_id`),
  INDEX `fk_sportsman_nutritionist1_idx` (`nutritionist_id` ASC) VISIBLE,
  CONSTRAINT `fk_sportsman_nutritionist1`
    FOREIGN KEY (`nutritionist_id`)
    REFERENCES `khomyn_db`.`nutritionist` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`history_of_competitions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`history_of_competitions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `sportsman_id` INT NOT NULL,
  `date` DATE NOT NULL,
  `venue` VARCHAR(45) NOT NULL,
  `award` VARCHAR(45) NULL,
  `number_of_participants` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`, `sportsman_id`),
  INDEX `fk_history_of_competitions_sportsman1_idx` (`sportsman_id` ASC) VISIBLE,
  CONSTRAINT `fk_history_of_competitions_sportsman1`
    FOREIGN KEY (`sportsman_id`)
    REFERENCES `khomyn_db`.`sportsman` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`scheduled_competitions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`scheduled_competitions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `sportsman_id` INT NOT NULL,
  `date` DATE NULL,
  `venue` VARCHAR(45) NULL,
  `number_of_participants` INT NULL,
  PRIMARY KEY (`id`, `sportsman_id`),
  INDEX `fk_scheduled_competitions_sportsman1_idx` (`sportsman_id` ASC) VISIBLE,
  CONSTRAINT `fk_scheduled_competitions_sportsman1`
    FOREIGN KEY (`sportsman_id`)
    REFERENCES `khomyn_db`.`sportsman` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `khomyn_db`.`coach`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `khomyn_db`.`coach` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `sportsman_id` INT NOT NULL,
  `full_name` VARCHAR(45) NOT NULL,
  `license` TINYINT NOT NULL,
  `reviews` FLOAT NOT NULL,
  PRIMARY KEY (`id`, `sportsman_id`),
  INDEX `fk_coach_sportsman1_idx` (`sportsman_id` ASC) VISIBLE,
  CONSTRAINT `fk_coach_sportsman1`
    FOREIGN KEY (`sportsman_id`)
    REFERENCES `khomyn_db`.`sportsman` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
