CREATE TABLE `users`(
    `ID` INT(11) NOT NULL AUTO_INCREMENT,
    `USER_NAME` VARCHAR(50) NOT NULL,
    `PASSWORD` VARCHAR(100) NOT NULL,
    `EMAIL` VARCHAR(100) DEFAULT NULL,
    `NAME` VARCHAR(100) NOT NULL,
    `ACTIVE_FLAG` INT(1) NOT NULL DEFAULT 1,
    `CREATE_DATE` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_DATE` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(ID)
);