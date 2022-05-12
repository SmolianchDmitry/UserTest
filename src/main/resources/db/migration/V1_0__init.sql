CREATE TABLE users (
    id          SERIAL       NOT NULL PRIMARY KEY,
    user_name   VARCHAR(255) NOT NULL,
    first_name  VARCHAR(255) NOT NULL,
    last_name   VARCHAR(255) NOT NULL,
    email       VARCHAR(255) NOT NULL,
    password    VARCHAR(255) NOT NULL,
    phone       VARCHAR(255) NOT NULL,
    user_status INT          NOT NULL
);