CREATE TABLE `doctor`
(
    `id`                bigint       NOT NULL AUTO_INCREMENT,
    `uuid`              varchar(36)  NOT NULL,

    `name`              varchar(100) NOT NULL,
    `email`             varchar(100) NOT NULL UNIQUE,
    `crm`               varchar(6)   NOT NULL UNIQUE,
    `medical_specialty` varchar(100) NOT NULL,
    `telephone`         varchar(20)  NOT NULL,
    `street_name`       varchar(100) NOT NULL,
    `neighborhood`      varchar(100) NOT NULL,
    `zip_code`          varchar(9)   NOT NULL,
    `complement`        varchar(100) NOT NULL,
    `address_number`    varchar(20)  NOT NULL,
    `city`              varchar(100) NOT NULL,
    `state`             char(2)      NOT NULL,
    `status`            varchar(100) NOT NULL,

    `input_date`        datetime(6) NOT NULL,
    `last_updated_date` datetime(6) NOT NULL,
    `version`           int(11)     NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY (`uuid`)
);
