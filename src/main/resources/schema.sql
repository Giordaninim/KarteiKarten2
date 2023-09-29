create table Frage(
  ID int NOT NULL AUTO_INCREMENT,
  frage varchar(100) not null,
  antwort varchar(200),
  PRIMARY KEY ( ID )
);

insert into frage (frage, antwort) values ('Frage 1', ' Antowrt 1');
insert into frage (frage, antwort) values ('Frage 2', ' Antowrt 2');
