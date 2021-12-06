USE
    `lab7`;

SET GLOBAL log_bin_trust_function_creators = 1;


DROP FUNCTION IF EXISTS getMaxDob;
DELIMITER //
CREATE FUNCTION getMaxDob()
    RETURNS DATE
BEGIN
    return (SELECT MAX(coworker.dob) FROM coworker);
END //
DELIMITER ;


DROP FUNCTION IF EXISTS getAssessmentNameById;
DELIMITER //
CREATE FUNCTION getAssessmentNameById(
    assessment_id INT
)
    RETURNS VARCHAR(25)
BEGIN
    RETURN (
        select `name`
        from assessment
        where id = assessment_id
    );
END //
DELIMITER ;

select getMaxDob();
