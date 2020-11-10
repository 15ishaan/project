drop table if exists USER;

create table USER(
     USER_ID INTEGER AUTO_INCREMENT,
     FIRSTNAME VARCHAR(128) NOT NULL,
     LASTNAME VARCHAR(128) NOT NULL,
     USERNAME VARCHAR(128) NOT NULL,
     GENDER VARCHAR(128) NOT NULL,
     PASSWORD VARCHAR(128) NOT NULL,
     CONFIRMPASSWORD VARCHAR(128) NOT NULL,
     ROLES VARCHAR(128) NOT NULL,
     ENABLED BOOLEAN
);

drop table if exists CONFIRMATIONTOKEN;

create table CONFIRMATIONTOKEN(
      TOKENID INTEGER AUTO_INCREMENT,
      CREATEDDATE DATE NOT NULL,
      CONFIRMATIONTOKEN VARCHAR(128) NOT NULL,
      USER_ID INTEGER NOT NULL
);