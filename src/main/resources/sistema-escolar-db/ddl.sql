CREATE TABLE users
(
    id       SERIAL PRIMARY KEY NOT NULL,
    username VARCHAR(45) NOT NULL,
    password VARCHAR(64) NOT NULL,
    role     VARCHAR(45) NOT NULL,
    enabled  BOOLEAN DEFAULT NULL
);
