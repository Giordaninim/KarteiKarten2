CREATE TABLE frage (
  ID int NOT NULL AUTO_INCREMENT,
  frage varchar(500) not null,
  antwort varchar(1500),
  gestellt int,
  richtig int,
  PRIMARY KEY ( ID )
);

insert into frage (frage, antwort, gestellt, richtig) values

('Was ist Java und warum ist es wichtig?', 'Java ist eine objektorientierte Programmiersprache, die für ihre Plattformunabhängigkeit
und große Entwicklergemeinschaft bekannt ist. Sie wird oft für die Entwicklung von Anwendungen, Webanwendungen und Android-Apps verwendet.',
3,1),

('Erklären Sie den Unterschied zwischen einer Klasse und einem Objekt in Java.', 'Eine Klasse ist eine Vorlage oder ein Bauplan,
während ein Objekt eine Instanz dieser Klasse ist und tatsächliche Daten speichert.',
3,1),

('Was bedeutet der Begriff "Plattformunabhängigkeit" in Bezug auf Java?', 'Plattformunabhängigkeit bedeutet, dass
Java-Programme auf verschiedenen Betriebssystemen ohne Änderungen am Quellcode ausgeführt werden können.',
3,1),

('Wie deklarieren Sie eine Variable in Java?', 'Eine Variable wird in Java durch die Angabe des Datentyps und des
Namens deklariert, z.B. "int zahl = 10;".',
3,1),

('Was ist der Unterschied zwischen einer if-Anweisung und einer switch-Anweisung in Java?', 'Die if-Anweisung ermöglicht
die Ausführung von Code basierend auf einer Bedingung, während die switch-Anweisung mehrere Bedingungen für verschiedene Codezweige verwendet.',
3,1),

('Welche Bedeutung hat das Schlüsselwort "static" in Java?', 'Das Schlüsselwort "static" wird verwendet, um eine Variable
oder Methode an die Klasse selbst zu binden, nicht an eine spezielle Instanz der Klasse.',
3,1),

('Wie erstellen Sie eine Schleife in Java, um eine Aktion mehrmals auszuführen?', 'Sie können Schleifen wie "for", "while"
oder "do-while" verwenden, um Code wiederholt auszuführen.',
3,1),

('Was sind Ausnahmen in Java und wie behandeln Sie sie?', 'Ausnahmen sind unerwartete Ereignisse, die während der Programmausführung
auftreten können. Sie werden mit try-catch-Blöcken behandelt.',
3,1),

('Wie können Sie in Java Benutzereingaben von der Konsole lesen?', 'Sie können die "Scanner"-Klasse verwenden, um Benutzereingaben
 von der Konsole zu lesen.',
3,1);

