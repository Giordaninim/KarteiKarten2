CREATE TABLE frage (
  ID int NOT NULL AUTO_INCREMENT,
  frage varchar(250) not null,
  antwort varchar(500),
  gestellt int,
  richtig int,
  PRIMARY KEY ( ID )
);

insert into frage (frage, antwort, gestellt, richtig) values ('Hauptstadt Italien', 'Rome',0,0);
insert into frage (frage, antwort, gestellt, richtig) values ('Hauptstadt Deutschland', 'Berlin', 0,0);
insert into frage (frage, antwort, gestellt, richtig) values ('Hauptstadt Frankreich', 'Paris', 0,0);
insert into frage (frage, antwort, gestellt, richtig) values ('Hauptstadt Spanien', 'Madrid', 0,0);
insert into frage (frage, antwort, gestellt, richtig) values ('Hauptstadt Österreich ', 'Wien', 0,0);
insert into frage (frage, antwort, gestellt, richtig) values ('Hauptstadt Portugal', 'Lisboa', 0,0);
insert into frage (frage, antwort, gestellt, richtig) values ('Hauptstadt Malta', 'La Valletta', 0,0);
insert into frage (frage, antwort, gestellt, richtig) values ('Hauptstadt Luxemburg', 'Luxemburg', 0,0);
insert into frage (frage, antwort, gestellt, richtig) values ('Hauptstadt Autralien', 'Canberra', 0,0);
insert into frage (frage, antwort, gestellt, richtig) values ('Hauptstadt Schweiz', 'Bern', 0,0);


