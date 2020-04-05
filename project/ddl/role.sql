CREATE TABLE `role`(
    `ID` INT(11) NOT NULL AUTO_INCREMENT,
    `ROLE_NAME` VARCHAR(50) NOT NULL,
    `DESCRIPTION` VARCHAR(200) NOT NULL,
    `ACTIVE_FLAG` INT(1) NOT NULL DEFAULT 1,
    `CREATE_DATE` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_DATE` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(ID)
);