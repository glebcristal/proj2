CREATE DATABASE mydb;
CREATE TABLE Person(
  id         INT         NOT NULL  PRIMARY KEY,
 imageUrl   VARCHAR(255),
 firstName  VARCHAR(255) NOT NULL,
 lastName   VARCHAR(255) NOT NULL,
 patronymic VARCHAR(255) NOT NULL,
 passport   VARCHAR(255) NOT NULL,
 year_of_birth INT NOT NULL,
 profession VARCHAR(255) NOT NULL,
 sex BOOLEAN
);
