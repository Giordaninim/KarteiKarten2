create table Frage(
  ID int NOT NULL AUTO_INCREMENT,
  frage varchar(250) not null,
  antwort varchar(500),
  gestellt int,
  richtig int,
  PRIMARY KEY ( ID )
);

insert into frage (frage, antwort, gestellt, richtig) values ('Frage 1', ' Antowrt 1', 2, 1);
insert into frage (frage, antwort, gestellt, richtig) values ('Frage 2', ' Antowrt 2', 5, 0);
insert into frage (frage, antwort, gestellt, richtig) values ('Frage 3', ' Antowrt 3', 6, 5);
insert into frage (frage, antwort, gestellt, richtig) values ('Frage 4', ' Antowrt 4', 6, 2);
insert into frage (frage, antwort, gestellt, richtig) values ('Frage 5', ' Antowrt 5', 7, 6);
insert into frage (frage, antwort, gestellt, richtig) values ('Frage 6', ' Antowrt 6', 11, 4);
insert into frage (frage, antwort, gestellt, richtig) values ('Frage 7', ' Antowrt 7', 0, 0);
insert into frage (frage, antwort, gestellt, richtig) values ('Frage 8', ' Antowrt 8', 0, 0);
insert into frage (frage, antwort, gestellt, richtig) values ('Frage 9', ' Antowrt 9', 0, 0);

